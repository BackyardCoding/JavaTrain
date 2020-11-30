package de.dumbuya;
// Challenge.
// A base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, another class, a specific type of Car that inherits from the Car class.
// Able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.
public class Main {

    public static void main(String[] args) {
	// write your code here
        Porsche porsche = new Porsche(36);
        porsche.steer(45);
        porsche.accelerate(30);
        porsche.accelerate(20);
        porsche.accelerate(-42);
    }
}
