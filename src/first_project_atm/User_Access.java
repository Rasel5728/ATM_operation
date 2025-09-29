
package first_project_atm;

/**
 *
 * @author Rasel
 */
public class User_Access {
    private String username;
    private String password;
   
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void resetpassword(String newPassword){                 
            this.password=newPassword;
            System.out.println("Password is changed.");
        }
    
    }    

