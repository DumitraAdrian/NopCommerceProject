package ObjectData;

import java.util.HashMap;

public class LoginObject {
    private String Email;
    private String Password;
    private String RememberMe;
    private String Login;
    private LoginObject(HashMap<String, String> testdata){
        for(String Key:testdata.keySet()){
            switch (Key){
                case "Email":
                    setEmail(testdata.get(Key));
                    break;
                case "Password":
                    setPassword(testdata.get(Key));
                    break;
                case "RememberMe":
                    setRememberMe(testdata.get(Key));
                    break;
                case "Login":
                    setLogin(testdata.get(Key));
                    break;

            }
        }
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRememberMe() {
        return RememberMe;
    }

    public void setRememberMe(String rememberMe) {
        RememberMe = rememberMe;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }
}
