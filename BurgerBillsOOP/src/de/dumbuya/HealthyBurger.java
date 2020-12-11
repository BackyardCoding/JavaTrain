package de.dumbuya;
//Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
class HealthyBurger extends Hamburger {
    private boolean cheese;
    private boolean onions;

    public HealthyBurger(String name, double price, boolean meat, boolean cheese, boolean onions) {
        super(name, price, "Brown rye bread roll", meat);
        this.cheese = cheese;
        this.onions = onions;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isOnions() {
        return onions;
    }

    public HealthyBurger(String name, double basePrice, boolean meat) {
        super(name, basePrice, "Brown rye bread roll", meat);
    }

    @Override
    public void addTomato() {
        if (getNumberOfAdditions() < 6) {
            super.addTomato();
            System.out.println();
        } else {
            System.out.println("You can't add more than 6 additions to your Healthy Hamburger.");
        }
    }

    @Override
    public void addLettuce() {
        if (getNumberOfAdditions() < 6) {
            super.addLettuce();
        } else {
            System.out.println("You can't add more than 6 additions to your Healthy Hamburger.");
        }
    }

    @Override
    public void addCarrot() {
        if (getNumberOfAdditions() < 6) {
            super.addCarrot();
        } else {
            System.out.println("You can't add more than 6 additions to your Healthy Hamburger.");
        }
    }

    @Override
    public void addCucumbers() {
        if (getNumberOfAdditions() < 6) {
            super.addCucumbers();
        } else {
            System.out.println("You can't add more than 6 additions to your Healthy Hamburger.");
        }
    }

    public void addOnions() {
        if (getNumberOfAdditions() < 6) {
            addAdditionalPrice(.20);
            increaseNumberOfAdditions();
        } else {
            System.out.println("You can't add more than 6 additions to your Healthy Hamburger.");
        }
    }

    public void addCheese() {
        if (getNumberOfAdditions() < 6) {
            addAdditionalPrice(.50);
            increaseNumberOfAdditions();
        } else {
            System.out.println("You can't add more than 6 additions to your Healthy Hamburger.");
        }
    }
}
