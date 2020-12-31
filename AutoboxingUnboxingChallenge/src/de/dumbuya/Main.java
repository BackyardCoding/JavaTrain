package de.dumbuya;
// A simple banking application.

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank("Sydbank");
	bank.addBranch("Nordjylland");
	bank.addCustomer("Nordjylland", "Anne", 10000);
	bank.addCustomer("Nordjylland", "Mette", 1000);
	bank.addCustomer("Nordjylland", "Hans", 96785);

	bank.addBranch("Esbjerg");
	bank.addCustomer("Esbjerg", "Benny", 3430);

	bank.addTransaction("Norjylland", "Hans", 323);
	bank.addTransaction("Norjylland", "Hans", 323);
	bank.addTransaction("Norjylland", "Anne", 323);

	bank.showCostumers("Esbjerg", false);
	bank.showCostumers("Nordjylland", true);
    }
}
