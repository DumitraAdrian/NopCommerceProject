package ObjectData;

import java.util.HashMap;

public class RegisterObject {
    private String Gender;
    private String FirstName;
    private String LastName;
    private String Date_of_birth_Day;
    private String Date_of_birth_Month;
    private String Date_of_birth_Year;
    private String Email;
    private String CompanyName;
    private String Password;
    private String ConfirmPassword;
    private String Register;
    private String RegisterContinue;

    public RegisterObject(HashMap<String, String> testdata){
        for(String Key:testdata.keySet()){
            switch (Key){
                case "FirstName":
                    setFirstName(testdata.get(Key));
                    break;
                case "LastName":
                   setLastName(testdata.get(Key));
                    break;
                case "Date_of_birth_Day":
                    setDate_of_birth_Day(testdata.get(Key));
                    break;
                case "Date_of_birth_Month":
                    setDate_of_birth_Month(testdata.get(Key));
                    break;
                case "Date_of_birth_Year":
                    setDate_of_birth_Year(testdata.get(Key));
                    break;
                case "Email":
                    setEmail(testdata.get(Key));
                    break;
                case "CompanyName":
                    setCompanyName(testdata.get(Key));
                    break;
                case "Password":
                    setPassword(testdata.get(Key));
                    break;
                case "ConfirmPassword":
                    setConfirmPassword(testdata.get(Key));
                    break;
                case "Register":
                    setRegister(testdata.get(Key));
                    break;
                case "RegisterContinue":
                    setRegisterContinue(testdata.get(Key));
                    break;

            }
        }
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDate_of_birth_Day() {
        return Date_of_birth_Day;
    }

    public void setDate_of_birth_Day(String date_of_birth_Day) {
        Date_of_birth_Day = date_of_birth_Day;
    }

    public String getDate_of_birth_Month() {
        return Date_of_birth_Month;
    }

    public void setDate_of_birth_Month(String date_of_birth_Month) {
        Date_of_birth_Month = date_of_birth_Month;
    }

    public String getDate_of_birth_Year() {
        return Date_of_birth_Year;
    }

    public void setDate_of_birth_Year(String date_of_birth_Year) {
        Date_of_birth_Year = date_of_birth_Year;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public String getRegister() {
        return Register;
    }

    public void setRegister(String register) {
        Register = register;
    }

    public String getRegisterContinue() {
        return RegisterContinue;
    }

    public void setRegisterContinue(String registerContinue) {
        RegisterContinue = registerContinue;
    }



}
