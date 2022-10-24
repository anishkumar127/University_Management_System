import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login(){
        getContentPane().setBackground(Color.WHITE);

        setLayout(null);

        // username label title.
        JLabel Input_username = new JLabel("Username");
        Input_username.setBounds(40,20,100,20);
        add(Input_username);

        // design text file for username.
        JTextField text_username = new JTextField();
        text_username.setBounds(150,20,150,20);
        add(text_username);

        // password label title
        JLabel Input_password = new JLabel("Password");
        Input_password.setBounds(40,70,100,20);
        add(Input_password);

        // design text file for password.
        JTextField text_password = new JPasswordField();
        text_password.setBounds(150,70,150,20);
        add(text_password);

        // login button design.
        JButton login_button = new JButton("Login");
        login_button.setBounds(40,140,120,30);
        login_button.setBackground(Color.BLACK);
        login_button.setForeground(Color.WHITE);
        login_button.setFont(new Font("Tahoma",Font.BOLD,15));
        add(login_button);

        // cancel button design.
        JButton cancel_button = new JButton("Cancel");
        cancel_button.setBounds(180,140,120,30);
        cancel_button.setBackground(Color.BLACK);
        cancel_button.setForeground(Color.WHITE);
        cancel_button.setFont(new Font("Tahoma",Font.BOLD,15));
        add(cancel_button);

        // user image add.
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);


        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}
