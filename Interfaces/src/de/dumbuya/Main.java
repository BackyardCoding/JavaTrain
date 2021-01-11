package de.dumbuya;

public class Main {

    public static void main(String[] args) {
        ITelephone mosesPhone;
        mosesPhone = new DeskPhone(123456);
        mosesPhone.powerOn();
        mosesPhone.callPhone(123456);
        mosesPhone.answer();

        mosesPhone = new MobilePhone(24565);
        mosesPhone.powerOn();
        mosesPhone.callPhone(24565);
        mosesPhone.answer();
    }
}
