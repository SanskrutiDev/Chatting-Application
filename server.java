//  package chating.aplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class server extends JFrame implements ActionListener{
    server(){

        setLayout(null);


        JPanel p1=new JPanel();
        p1.setBackground(new Color(7,94 ,84));
        p1.setBounds(0,0,450,70);
        p1.setLayout(null);
        add(p1);

        try {
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
            Image i2 =i1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);

            JLabel back = new JLabel(i3);
            back.setBounds(5, 20, 25, 25);
            p1.add(back);


            JLabel name = new JLabel("vaishu");
            name.setBounds(110, 15, 100, 18);
            name.setForeground(Color.white); 
            name.setFont(new Font("SAN_SERIF",Font.BOLD,18));
            p1.add(name);

            
            JLabel status = new JLabel("Active now");
            status.setBounds(110, 35, 100, 18);
            status.setForeground(Color.white); 
            status.setFont(new Font("SAN_SERIF",Font.BOLD,14));
            p1.add(status);


            JPanel a1 = new JPanel();
            a1.setBounds(5,75,440,570);
            add(a1);

            JTextField text1=new JTextField();
            text1.setBounds(5,655,310,40);
            text1.setFont(new Font("SAN_SRRIE",Font.PLAIN,16));
            add(text1);

            JButton send = new JButton("send");
            send.setBounds(320,655,123,40);
            send.setBackground(new Color(7,94,84));
            send.setForeground(Color.WHITE);
            send.setFont(new Font("SAN_SRRIE",Font.PLAIN,16));
            add(send);
            

            back.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent ae){
                   System.exit(0);

                }
                
            });
           
            
           
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // ... (previous code)
        
            ImageIcon profileIcon = new ImageIcon(getClass().getClassLoader().getResource("icons/1.png"));
            JLabel profileLabel = new JLabel(new ImageIcon(profileIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
            profileLabel.setBounds(40, 10, 50, 50);
        
            // Add the profileLabel to the p1 panel
            p1.add(profileLabel);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            // ... (previous code)
        
            ImageIcon videoIcon = new ImageIcon(getClass().getClassLoader().getResource("icons/video.png"));
            JLabel video = new JLabel(new ImageIcon(videoIcon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
            video.setBounds(300, 20, 30, 30);
        
            // Add the video to the p1 panel
            p1.add(video);
        
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // ... (previous code)
        
            ImageIcon phoneIcon = new ImageIcon(getClass().getClassLoader().getResource("icons/phone.png"));
            JLabel phone = new JLabel(new ImageIcon(phoneIcon.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT)));
            phone.setBounds(360, 20, 35, 30);
        
            // Add the phone to the p1 panel
            p1.add(phone);
        
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // ... (previous code)
        
            ImageIcon norevertIcon = new ImageIcon(getClass().getClassLoader().getResource("icons/3icon.png"));
            JLabel norevertLabel = new JLabel(new ImageIcon(norevertIcon.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT)));
            norevertLabel.setBounds(420, 20, 10, 25);
        
            // Add the norevertLabel to the p1 panel
            p1.add(norevertLabel);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        

       
    
    


        setSize(450,700);
        setLocation(200,50);
        setUndecorated(true);
        getContentPane().setBackground(Color.white);



        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae) {
        // Handle actions here if needed
    }
       public static void main(String args[]){
       new server();
    }






    
}
