import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import javax.swing.*;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class Login extends JFrame{
    public String username, password;
    Connector connector = new Connector();
    
    //DEKLARASI KOMPONEN
    JFrame window = new JFrame("JDBC - Login");
    
    JLabel logUsername = new JLabel("Username ");
    JTextField tfLogUsername = new JTextField();
    JLabel logPassword = new JLabel("Password ");
    JTextField tfLogPassword = new JTextField();
    
    JButton btnLogin = new JButton("Login");
    
    public Login(){
        window.setLayout(null);
        window.setSize(280,160);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        
//ADD COMPONENT
        window.add(logUsername);
        window.add(tfLogUsername);
        window.add(logPassword);
        window.add(tfLogPassword);
        window.add(btnLogin);
        
//LABEL
        logUsername.setBounds(15, 15, 120, 20);
        logPassword.setBounds(15, 40, 120, 20);
        
//TEXTFIELD
        tfLogUsername.setBounds(110, 15, 120, 20);
        tfLogPassword.setBounds(110, 40, 120, 20);

//BUTTON PANEL
        btnLogin.setBounds(85, 80, 90, 20);
        
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                try{
                    String query1 = "SELECT * FROM users WHERE username = '"+getLogUsername()+"'";
                    connector.statement = connector.koneksi.createStatement();
                    ResultSet isUsername = connector.statement.executeQuery(query1);
                    if(isUsername.next()){
                        String id = isUsername.getString("id");
                        String query2 = "SELECT * FROM users WHERE password = '"+getLogPassword()+"' AND id = '"+id+"'";
                        ResultSet isPassword = connector.statement.executeQuery(query2);
                        
                        if(isPassword.next()){
                        JOptionPane.showMessageDialog(null, "Berhasil Login");
                        } else{
                            JOptionPane.showMessageDialog(null, "Password Salah");
                        }
                    } else{
                        JOptionPane.showMessageDialog(null, "Username Tidak Ditemukan");
                    }
                }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
        });
    }
    public String getLogUsername(){
        return tfLogUsername.getText();
    }

    public String getLogPassword() {
        return tfLogPassword.getText();
    }

    public void inputDB(){
        
    }
}
