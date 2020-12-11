package de.dumbuya;
//Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to auto-matically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger(String name, double basePrice, String breadTypeRoll, boolean meat) {
        super(name, basePrice, breadTypeRoll, meat);
        addChips();
        addDrink();
    }

    @Override
    public void addTomato() {
        System.out.println("You can't add more than 2 additions to your a Deluxe Hamburger.");
    }

    @Override
    public void addLettuce() {
        System.out.println("You can't add more than 2 additions to your a Deluxe Hamburger.");
    }

    @Override
    public void addCarrot() {
        System.out.println("You can't add more than 2 additions to your a Deluxe Hamburger.");
    }

    @Override
    public void addCucumbers() {
        System.out.println("You can't add more than 2 additions to your a Deluxe Hamburger.");
    }

    public void addChips() {
        if (getNumberOfAdditions() < 2) {
            addAdditionalPrice(.70);
            increaseNumberOfAdditions();
        } else {
            System.out.println("You can't add more than 2 additions to your a Deluxe Hamburger.");
        }
    }

    public void addDrink() {
        if (getNumberOfAdditions() < 2) {
            addAdditionalPrice(.90);
            increaseNumberOfAdditions();
        } else {
            System.out.println("You can't add more than 2 additions to your a Deluxe Hamburger.");
        }
    }
}
