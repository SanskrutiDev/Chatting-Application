//  package chating.aplication;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import java.io.*;





import java.net.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;





public class client extends JFrame implements ActionListener{
    JTextField text1;
    JPanel a1;
    static Box vertical = Box.createVerticalBox();
    static JFrame f = new JFrame();
    static DataOutputStream dout;
    
    
    client(){

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


            JLabel name = new JLabel("Chanchu");
            name.setBounds(110, 15, 100, 18);
            name.setForeground(Color.white); 
            name.setFont(new Font("SAN_SERIF",Font.BOLD,18));
            p1.add(name);

            
            JLabel status = new JLabel("Active now");
            status.setBounds(110, 35, 100, 18);
            status.setForeground(Color.white); 
            status.setFont(new Font("SAN_SERIF",Font.BOLD,14));
            p1.add(status);


            a1 = new JPanel();
            a1.setBounds(5,75,440,570);
            add(a1);

            text1=new JTextField();
            text1.setBounds(5,655,310,40);
            text1.setFont(new Font("SAN_SRRIE",Font.PLAIN,16));
            add(text1);

            JButton send = new JButton("send");
            send.setBounds(320,655,123,40);
            send.setBackground(new Color(7,94,84));
            send.setForeground(Color.WHITE);
            send.addActionListener(this);
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
        
            ImageIcon profileIcon = new ImageIcon(getClass().getClassLoader().getResource("icons/2.png"));
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
        setLocation(800,50);
        setUndecorated(true);
        getContentPane().setBackground(Color.white);



        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae) {
        try {
            // Handle actions here if needed
            String out = text1.getText();
    
            JPanel p2 = formatLabel(out);
           
    
            a1.setLayout(new BorderLayout());
    
            JPanel right = new JPanel(new BorderLayout());
            right.add(p2, BorderLayout.LINE_END);
            vertical.add(right);
            vertical.add(Box.createVerticalStrut(15));
    
            a1.add(vertical, BorderLayout.PAGE_START);
    
            // dout.writeUTF(out);
    
             text1.setText("");
    
            repaint();
            invalidate();
            validate();
            // SwingUtilities.invokeLater(() -> {
            //     f.repaint();
            //     f.invalidate();
            //     f.validate();
            // });
            // ;
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

     public static JPanel formatLabel(String out) {
       JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       // JLabel output = new JLabel(out);
        
      JLabel output = new JLabel("<html><p style=\"width: 150px\">" + out + "</p></html>");
      output.setFont(new Font("Tahoma", Font.PLAIN, 16));
      output.setBackground(new Color(37, 211, 102));
      output.setOpaque(true);
      output.setBorder(new EmptyBorder(15, 15, 15, 50));
        
        panel.add(output);
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        
       JLabel time = new JLabel();
       time.setText(sdf.format(cal.getTime()));
        
        panel.add(time);
        
         return panel;
     }
       public static void main(String args[]){
        
       new client();
    //    try {
    //         ServerSocket skt = new ServerSocket(6001);
    //         while(true) {
    //             Socket s = skt.accept();
    //             DataInputStream din = new DataInputStream(s.getInputStream());
    //             dout = new DataOutputStream(s.getOutputStream());
                
    //             while(true) {
    //                 String msg = din.readUTF();
    //                 // JPanel panel = formatLabel(msg);
                    
    //             //     JPanel left = new JPanel(new BorderLayout());
    //             //     left.add(panel, BorderLayout.LINE_START);
    //             //     vertical.add(left);
    //             //     f.validate();
    //             }
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    }  
}
