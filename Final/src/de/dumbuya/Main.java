package de.dumbuya;
// This program demonstrates the use of the final keyword by the example of a login/password/decrypt solution
// Furthermore it demonstrates the use the static keyword.
public class Main {

    public static void main(String[] args) {

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        int pw = 341243;
        Password password = new Password(pw);
        password.storePassword();
        password.letMeIn(1);
        password.letMeIn(9234);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(341243);


        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
