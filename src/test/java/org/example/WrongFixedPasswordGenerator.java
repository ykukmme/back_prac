package org.example;

import org.example.pass.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "ab"; //8글자
    }
}
