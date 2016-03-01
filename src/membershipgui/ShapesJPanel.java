package membershipgui;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
  import java.awt.BasicStroke;  
  import java.awt.Rectangle;
  import java.awt.Graphics2D;           
  import java.awt.geom.Ellipse2D;       
  import java.awt.geom.Rectangle2D;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.geom.Arc2D;           
  import java.awt.geom.Line2D;

import javax.swing.JComponent;
import javax.swing.JPanel;

import com.db.DBUser;
   
  public class ShapesJPanel extends JComponent 
  {
	 public DBUser user;    
     public ShapesJPanel(DBUser dbUser){
    	 
    	 user = dbUser;
    	 
     }
     public void paintComponent( Graphics g )
     {
        super.paintComponent( g ); // call superclass's paintComponent
   
        Graphics2D g2d = ( Graphics2D ) g; // cast g to Graphics2D
   
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date()); 
                                 
        g2d.setPaint( Color.BLACK );      
        g2d.setFont(new Font("Monospaced", Font.BOLD, 26));
        g2d.drawString("Silverline Sports Club", 180, 130);
        g2d.setStroke( new BasicStroke( 3.0f ) );            
        g2d.draw( new Rectangle2D.Double( 130, 90, 450, 500 ) );
        g2d.setStroke( new BasicStroke( 3.0f ) );  
        g2d.drawLine(130, 150, 580, 150  );
        g2d.setFont(new Font("Calibri", Font.BOLD, 16));
        g2d.drawString("Receipt", 330, 170);
        g2d.setFont(new Font("Calibri", Font.BOLD, 16));
        g2d.drawString("Date : ", 400, 200);
        g2d.drawString(date, 450, 200);
        g2d.setFont(new Font("Calibri", Font.PLAIN, 20));
        g2d.drawString("Name              : "+user.getFirstname()+" "+user.getSurname(), 140, 250);
        g2d.drawString("Membership ID     : "+user.getMemberID(), 140, 300);
        g2d.drawString("Subscription Type : "+user.getSubscriptionType(), 140, 350);
        g2d.drawString("Payment Amount    : "+user.getAmountPaid(), 140, 400);
        g2d.setStroke( new BasicStroke( 2.0f ) );
        g2d.drawLine(400, 480, 550, 480  );
        g2d.setFont(new Font("Calibri", Font.BOLD, 16));
        g2d.drawString("Authorised Signature", 400, 500);
       // draw 2D lines in green and yellow               
       // g2d.setPaint( Color.BLACK );                       
       // g2d.draw( new Line2D.Double( 80, 30, 320, 150 ) );
     } // end method paintComponent
  }