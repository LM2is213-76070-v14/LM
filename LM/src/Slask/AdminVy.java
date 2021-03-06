package Slask;



import javax.swing.*;

import java.awt.event.*;

public class AdminVy extends JFrame {
    
    public AdminVy() {
        
         //This will create the title you see in the upper left of the window    
        setTitle("Tabbed Pane");  
        setSize(600,400); //set size so the user can "see" it
        //Here we are creating the object
     
               
       JTabbedPane jtp = new JTabbedPane();
             
       //Moves tabs to the right side
       jtp.setTabPlacement(MAXIMIZED_HORIZ);
       
       
        //This creates the template on the windowed application that we will be using
       getContentPane().add(jtp);

       JPanel jp1 = new JPanel();//This will create the first tab

       JPanel jp2 = new JPanel();//This will create the second tab
       
       JPanel jp3 = new JPanel();//This will create the third tab
       
       JPanel jp4 = new JPanel();//This will create the fourth tab
       
       JPanel jp5 = new JPanel();//This will create the fifth tab

       JPanel jp6 = new JPanel();//This will create the sixth tab
       
       JPanel jp7 = new JPanel();//This will create the seventh tab
       
       JPanel jp8 = new JPanel();//This will create the eight tab
        
         //This creates a non-editable label, sets what the label will read
        //and adds the label to the first tab
       JLabel label1 = new JLabel();
       label1.setText("This is Tab 1");
       jp1.add(label1);

       //This adds the first and second tab to our tabbed pane object and names it
       jtp.addTab("Updates", jp1);
       jtp.addTab("General info", jp2);
       jtp.addTab("Disruptions", jp3);
       jtp.addTab("Create message", jp4);

       
       jtp.addTab("Edit message", jp5);
       jtp.addTab("Edit subscription", jp6);
       jtp.addTab("My subscriptions", jp7);
       jtp.addTab("My account", jp8);
       
        //This creates a new button called "Press" and adds it to the second tab
       JButton test = new JButton("Press");
       jp2.add(test);

        //This is an Action Listener which reacts to clicking on 
        //the test button called "Press"
        ButtonHandler phandler = new ButtonHandler();
        test.addActionListener(phandler);
        setVisible(true); //otherwise you won't "see" it 
    }
    
    //This is the internal class that defines what the above Action Listener
    //will do when the test button is pressed.
    class ButtonHandler implements ActionListener{
           public void actionPerformed(ActionEvent e){
                   JOptionPane.showMessageDialog(null, "I've been pressed", "What happened?", JOptionPane. INFORMATION_MESSAGE);
           }
    }

    //example usage
     public static void main (String []args){
        AdminVy tab = new AdminVy();
    }

}


