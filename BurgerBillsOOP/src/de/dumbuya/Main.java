package de.dumbuya;
// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.
public class Main {

    public static void main(String[] args) {
        //Create Burger
        Hamburger hamburger = new Hamburger("Big Mac", 9.99, "White", true);
        System.out.println("Base price " + hamburger.getBasePrice() + ", additional price " + hamburger.getAdditionalPrice());
        System.out.println("Total price " + hamburger.getTotalPrice());

        //Add items
        hamburger.addCustomer("Alf");
        hamburger.addTomato();
        System.out.println("Number of items added " + hamburger.getNumberOfAdditions());
        System.out.println("Base price " + hamburger.getBasePrice() + ", additional price " + hamburger.getAdditionalPrice());
        System.out.println("Total price " + hamburger.getTotalPrice());
        hamburger.addCarrot();
        System.out.println("Number of items added " + hamburger.getNumberOfAdditions());
        System.out.println("Base price " + hamburger.getBasePrice() + ", additional price " + hamburger.getAdditionalPrice());
        System.out.println("Total price " + hamburger.getTotalPrice());
        hamburger.addLettuce();
        System.out.println("Number of items added " + hamburger.getNumberOfAdditions());
        System.out.println("Base price " + hamburger.getBasePrice() + ", additional price " + hamburger.getAdditionalPrice());
        System.out.println("Total price " + hamburger.getTotalPrice());
        hamburger.addCucumbers();
        System.out.println("Number of items added " + hamburger.getNumberOfAdditions());
        System.out.println("Base price " + hamburger.getBasePrice() + ", additional price " + hamburger.getAdditionalPrice());
        System.out.println("Total price " + hamburger.getTotalPrice() + "\n");

        //Healthy Burger
        HealthyBurger healthyBurger = new HealthyBurger("Big Mac", 9.99, true);
        System.out.println("Base price " + healthyBurger.getBasePrice() + ", additional price " + healthyBurger.getAdditionalPrice());
        System.out.println("Total price " + healthyBurger.getTotalPrice());

        //Add items
        healthyBurger.addCustomer("Alf");
        healthyBurger.addTomato();
        System.out.println("Number of items added " + healthyBurger.getNumberOfAdditions());
        System.out.println("Base price " + healthyBurger.getBasePrice() + ", additional price " + healthyBurger.getAdditionalPrice());
        System.out.println("Total price " + healthyBurger.getTotalPrice());
        healthyBurger.addCarrot();
        System.out.println("Number of items added " + healthyBurger.getNumberOfAdditions());
        System.out.println("Base price " + healthyBurger.getBasePrice() + ", additional price " + healthyBurger.getAdditionalPrice());
        System.out.println("Total price " + healthyBurger.getTotalPrice());
        healthyBurger.addLettuce();
        System.out.println("Number of items added " + healthyBurger.getNumberOfAdditions());
        System.out.println("Base price " + healthyBurger.getBasePrice() + ", additional price " + healthyBurger.getAdditionalPrice());
        System.out.println("Total price " + healthyBurger.getTotalPrice());
        healthyBurger.addCucumbers();
        System.out.println("Number of items added " + healthyBurger.getNumberOfAdditions());
        System.out.println("Base price " + healthyBurger.getBasePrice() + ", additional price " + healthyBurger.getAdditionalPrice());
        System.out.println("Total price " + healthyBurger.getTotalPrice());
        healthyBurger.addCheese();
        System.out.println("Number of items added " + healthyBurger.getNumberOfAdditions());
        System.out.println("Base price " + healthyBurger.getBasePrice() + ", additional price " + healthyBurger.getAdditionalPrice());
        System.out.println("Total price " + healthyBurger.getTotalPrice());
        healthyBurger.addOnions();
        System.out.println("Number of items added " + healthyBurger.getNumberOfAdditions());
        System.out.println("Base price " + healthyBurger.getBasePrice() + ", additional price " + healthyBurger.getAdditionalPrice());
        System.out.println("Total price " + healthyBurger.getTotalPrice());
        healthyBurger.addOnions();
        System.out.println("Number of items added " + healthyBurger.getNumberOfAdditions());
        System.out.println("Base price " + healthyBurger.getBasePrice() + ", additional price " + healthyBurger.getAdditionalPrice());
        System.out.println("Total price " + healthyBurger.getTotalPrice() + "\n");

        //Healthy Burger
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Big Mac", 9.99, "Flatbread", true);
        System.out.println("Number of items added " + deluxeHamburger.getNumberOfAdditions());
        System.out.println("Base price " + deluxeHamburger.getBasePrice() + ", additional price " + healthyBurger.getAdditionalPrice());
        System.out.println("Total price " + deluxeHamburger.getTotalPrice() + "\n");
        deluxeHamburger.addDrink();
        deluxeHamburger.addChips();
        deluxeHamburger.addCarrot();
        deluxeHamburger.addLettuce();
        deluxeHamburger.addCucumbers();
        deluxeHamburger.addTomato();
    }
}
