package com.db;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Criteria;
import org.hibernate.JDBCException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.db.util.HibernateUtil;

public class DBMethods {
	

	public void Update()
	{

	}
	public void Delete()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		//Query query = session.createSQLQuery("delete from club_member where memberid=151105000003");
		Object object=session.load(DBUser.class,new Long(Long.parseLong("151106151105000005")));
		DBUser dbUser = (DBUser)object;
		 Transaction tx = session.beginTransaction();
	        session.delete(dbUser);
	        System.out.println("Object Deleted successfully.....!!");
	        tx.commit();
	        session.close();
	       
		
	}
	public void Create(String gender,String firstname, String surname, String email, String phoneNumber, String altPhoneNumber
			, String address, String area, String City, int pincode, Date dob, String subscriptionType, String membershipDetails, String paymentType
			, int amountPaid, String name1, String relation1, String gender1, String name2, String relation2, String gender2,  String name3
			, String relation3, String gender3,  String name4, String relation4, String gender4)
	{

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
	
	    final java.util.Calendar cal = GregorianCalendar.getInstance();

	    cal.add( GregorianCalendar.YEAR, 1 ); 
	    cal.add( GregorianCalendar.YEAR, 3 ); 
	    cal.add( GregorianCalendar.YEAR, 6 ); 
	    cal.add( GregorianCalendar.YEAR, 12 ); 
	   
		DBUser user = new DBUser();
		
		
		
		//user.setMemberID(Integer.parseInt(list.get(0).toString())+1);
		user.setMemberID(genetateMembershipID());
		user.setGender(gender);
		user.setFirstname(firstname);
		user.setSurname(surname);
		user.setEmail(email);
		user.setPhoneNo(phoneNumber);
		user.setAltPhoneNo(altPhoneNumber);
		user.setAddress(address);
		user.setArea(area);
		user.setCity(City);
		user.setPinCode(pincode);
		user.setDob(dob);
		user.setCreatedDate(new Date());
		user.setLastPaymentDate(new Date());
		user.setSubscriptionType(subscriptionType);
		if (subscriptionType.contains("6 Months")) {
			cal.add( GregorianCalendar.MONTH, 6 ); 
			user.setMembershipExpiryDate(cal.getTime());
		}else if (subscriptionType.contains("1 Month")) {
			cal.add( GregorianCalendar.MONTH, 1 ); 
			user.setMembershipExpiryDate(cal.getTime());
		}else if (subscriptionType.contains("3 Months")) {
			cal.add( GregorianCalendar.MONTH, 3 ); 
			user.setMembershipExpiryDate(cal.getTime());
		}else if (subscriptionType.contains("1 Year")) {
			cal.add( GregorianCalendar.YEAR, 1 ); 
			user.setMembershipExpiryDate(cal.getTime());
		}
		user.setMembershipExpiryDate(new Date());
		user.setMembershipDetails(membershipDetails);
		user.setPaymentType(paymentType);
		user.setAmountPaid(amountPaid);
		user.setName1(name1);
		user.setRelationship1(relation1);
		user.setGender1(gender1);
		user.setName2(name2);
		user.setRelationship2(relation2);
		user.setGender2(gender2);
		user.setName3(name3);
		user.setRelationship3(relation3);
		user.setGender3(gender3);
		user.setName4(name4);
		user.setRelationship4(relation4);
		user.setGender4(gender4);
		user.setName5("");
		user.setRelationship5("");
		user.setGender5("");
		try{
			session.save(user);
			session.getTransaction().commit();
			}
		catch (JDBCException jdbce) {
		    jdbce.getSQLException().getNextException().printStackTrace();
		}
		
	}
	public DBUser Search(long memberid, String phoneno, DBUser dbUserDetails)
	{
		if ((memberid+"").length()>1) {
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			Criteria crr = session.createCriteria(DBUser.class);
			crr.add(Restrictions.eq("memberID", memberid));
			List<DBUser> users = (List<DBUser>) crr.list();
			try {
				dbUserDetails = users.get(0);
			} catch (IndexOutOfBoundsException e) {
				
			
				JOptionPane.showMessageDialog(null,"Not records found for this menbership ID");
			}
			
			
			/*
			List<DBUser> users = (List<DBUser>) crr.list();
			if (users != null) {
				System.out.println("Total Results:" + users.size());
				for (DBUser user : users) {
					System.out.println(user.getId() + " - " + user.getSurname());
				}
			}
*/
			
			/*Session session = HibernateUtil.getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(DBUser.class);
			List javaBeans = criteria.list();
			System.out.println(javaBeans.get(0));*/
			
			/*Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Query query = session.createSQLQuery("select phoneno, memberid, firstname from MEMBERS where memberid="+memberid);
			
			List list = query.list();
			System.out.println(list.get(0));*/
			
		} else {

			Session session = HibernateUtil.getSessionFactory().openSession();
			Criteria crr = session.createCriteria(DBUser.class);
			System.out.println(phoneno);
			crr.add(Restrictions.eq("phoneNo", phoneno.trim()));
			List<DBUser> users = (List<DBUser>) crr.list();
			try {
				dbUserDetails = users.get(0);
			} catch (IndexOutOfBoundsException e) {
				
			
				JOptionPane.showMessageDialog(null,"Not records found for this number");
			}
			
		}
		
		return dbUserDetails;
	}
	
	public DBUser Search(Date fromDate, Date toDate, DBUser dbUserDetails)
	{

		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria crr = session.createCriteria(DBUser.class);
		System.out.println(fromDate+":"+toDate+":");
		crr.add(Restrictions.between("createdDate", fromDate, toDate));
		List<DBUser> users = (List<DBUser>) crr.list();
		try {
			dbUserDetails = users.get(0);
		} catch (IndexOutOfBoundsException e) {
			
		
			JOptionPane.showMessageDialog(null,"Not records found for this time period");
		}
			
		
		
		return dbUserDetails;
	}
	
	
	//Used to get one particular user details
	public void GetDetails()
	{
		
		
	}
	
	public long genetateMembershipID()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createSQLQuery("select MAX(memberid) from club_member");
		
		List list = query.list();
		String highestMemberID = null;
		try {
			
			highestMemberID = list.get(0).toString();
		} catch (Exception e) {
			e.printStackTrace();
			highestMemberID = "0000";
		}
		String membershipID = "";
		DateFormat dateFormat = new SimpleDateFormat("yyMMdd");
		Date date = new Date();	
		if (highestMemberID.length()>6) {
			membershipID = ""+(Long.parseLong(highestMemberID)+1);
		} else {

			membershipID = dateFormat.format(date)+String.format("%06d", Long.parseLong(highestMemberID)+1);
		}
		System.out.println(Long.parseLong(membershipID));
		
		
		return Long.parseLong(membershipID);
	}
	
}
