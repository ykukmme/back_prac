package org.example;

public class User {
    private  String password;

    public void initPassword(PasswordGenerator passwordGenerator)  {
        String randomPassword = passwordGenerator.generatePassword();

        if(randomPassword.length() >=8 && randomPassword.length() <= 12) {
            this.password = randomPassword;
        }
    }

    public String getPassword() {
        return password;
    }
}
