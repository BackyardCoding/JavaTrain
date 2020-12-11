package de.dumbuya;
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
public class Hamburger {
    private String name;
    private double basePrice;
    private double additionalPrice;
    private double totalPrice;
    private int numberOfAdditions = 0;
    //Ingredients
    private String breadTypeRoll;
    private boolean meat;
    private String customer;

    public Hamburger(String name, double basePrice, String breadTypeRoll, boolean meat) {
        this.name = name;
        this.basePrice = basePrice;
        this.breadTypeRoll = breadTypeRoll;
        this.meat = meat;
    }

    public void addAdditionalPrice(double additionalPrice) {
        this.additionalPrice += additionalPrice;
    }

    public double getTotalPrice() {
        return getBasePrice() + getAdditionalPrice();
    }

    public void setTotalPrice() {
        this.totalPrice = getBasePrice() + getAdditionalPrice();
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getNumberOfAdditions() {
        return numberOfAdditions;
    }

    public void increaseNumberOfAdditions() {
        ++numberOfAdditions;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public String getBreadTypeRoll() {
        return breadTypeRoll;
    }

    public boolean isMeat() {
        return meat;
    }

    public String getCustomer() {
        return customer;
    }

    public void addTomato() {
        additionalPrice += .25;
        increaseNumberOfAdditions();
    }

    public void addLettuce() {
        additionalPrice += .25;
        increaseNumberOfAdditions();
    }

    public void addCarrot() {
        additionalPrice += .30;
        increaseNumberOfAdditions();
    }

    public void addCucumbers() {
        additionalPrice += .30;
        increaseNumberOfAdditions();
    }

    public void addCustomer(String customerName) {
        setCustomer(customerName);
    }
}
