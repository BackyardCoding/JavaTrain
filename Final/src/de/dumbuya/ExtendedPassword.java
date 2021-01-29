package de.dumbuya;

public class ExtendedPassword extends Password {
    private int decrypedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decrypedPassword = password;
    }
}
