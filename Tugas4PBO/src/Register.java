import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import javax.swing.*;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class Register {
    public String username, password;
    Connector connector = new Connector();
    
    //DEKLARASI KOMPONEN
    JFrame window = new JFrame("JDBC - Register");
    
    JLabel regUsername = new JLabel("Username ");
    JTextField tfRegUsername = new JTextField();
    JLabel regPassword = new JLabel("Password ");
    JTextField tfRegPassword = new JTextField();
    
    JButton btnRegister = new JButton("Register");
    
    public Register(){
        window.setLayout(null);
        window.setSize(280,160);
        window.setVisible(true);
        window.setResizable(false);
        
//ADD COMPONENT
        window.add(regUsername);
        window.add(tfRegUsername);
        window.add(regPassword);
        window.add(tfRegPassword);
        window.add(btnRegister);
        
//LABEL
        regUsername.setBounds(15, 15, 120, 20);
        regPassword.setBounds(15, 40, 120, 20);
        
//TEXTFIELD
        tfRegUsername.setBounds(110, 15, 120, 20);
        tfRegPassword.setBounds(110, 40, 120, 20);
        
//BUTTON PANEL
        btnRegister.setBounds(85, 80, 90, 20);
        
        btnRegister.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                try{
                    String query1 = "SELECT * FROM users WHERE username = '"+getRegUsername()+"'";
                    connector.statement = connector.koneksi.createStatement();
                    ResultSet isUsername = connector.statement.executeQuery(query1);
                    if(isUsername.next()){
                        JOptionPane.showMessageDialog(null, "Username Sudah Digunakan");
                    } else{
                        String query2 = "INSERT INTO users (`username`, `password`) VALUES ('"+getRegUsername()+"','"+getRegPassword()+"')";
                        connector.statement = connector.koneksi.createStatement();
                        connector.statement.executeUpdate(query2);
                        JOptionPane.showMessageDialog(null, "Berhasil Mendaftarkan User");
                    }
                }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
        });
    }
    
    public String getRegUsername(){
        return tfRegUsername.getText();
    }

    public String getRegPassword() {
        return tfRegPassword.getText();
    }
    
    public void inputDB(){
        
    }

}
