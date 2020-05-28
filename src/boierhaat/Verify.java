
package boierhaat;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Verify {
    private String filename;
    private String username;
    private String password;
    private Scanner reader;
    
    Verify(String username,String password,String filename){
        this.username=username;
        this.password=password;        
        this.filename=filename;
    }
    public boolean verifyUser(){
        try {
            reader = new Scanner(new File(filename));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"File not found");
        }
        while(reader.hasNext()){
            String tmpUser=reader.next();
            String tmpPass=reader.next();
            if(tmpUser.equals(username)&&tmpPass.equals(password)) return true;   
        }
        return false;
    }
}
