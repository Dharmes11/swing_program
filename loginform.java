import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.renderable.ContextualRenderedImageFactory;
import javax.swing.*;

import org.ietf.jgss.MessageProp;

class login extends JFrame implements ActionListener
{
    JLabel user = new JLabel("Enter User Name : ");
    JLabel psw = new JLabel("Enter User Password : ");
    JLabel msg = new JLabel();
    JTextField usertxt = new JTextField();
    JPasswordField pswtxt = new JPasswordField();
    JButton btn = new JButton("Login");
    Container c;
    login()
    {
        c = this.getContentPane();
        c.setLayout(null);
        Font font = new Font("arial",Font.BOLD,25);
        Font font1 = new Font("arial",Font.BOLD,50);
        Font fonttxt = new Font("arial",Font.TRUETYPE_FONT,25);
        user.setFont(font);
        msg.setFont(font1);
        psw.setFont(font);
        usertxt.setFont(fonttxt);
        pswtxt.setFont(fonttxt);
        btn.setFont(font);
        btn.setBackground(Color.yellow);
        user.setBounds(100,50,300,50);
        psw.setBounds(100,120,300,50);
        usertxt.setBounds(380,50,300,50);
        pswtxt.setBounds(380,120,300,50);
        btn.setBounds(190,220,300,50);
        msg.setBounds(50,300,600,100);
        btn.addActionListener(this);
        c.add(user);
        c.add(psw);
        c.add(usertxt);
        c.add(pswtxt);
        c.add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btn)
        {
            String username = usertxt.getText();
            String password = String.valueOf(pswtxt.getPassword());

            if((username.equals( "dharmesh")  && password.equals("1966")))
            {
                c.setBackground(Color.BLUE); 
                c.add(msg);
                msg.setText("Login Successfully");   
            }
            else
            {
                c.setBackground(Color.RED);
                c.add(msg);
                msg.setText("Incorrect...try again");
            }
        }
    }
}



public class loginform {
    public static void main(String[] args) 
    {
        login l1 = new login();
        l1.setVisible(true);
        l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1.setBounds(100,50,800,600);
        l1.setTitle("LOGIN FORM");
        l1.setResizable(false);
    }
}
