package de.dumbuya;
// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.
public class Main {

    public static void main(String[] args) {
	LivingRoom livingRoom = new LivingRoom(5,6,2,1,new Sofa(3,"leather"),
            new Television("Philips","Ambilight",127,false),new Table("yellow"),
            new Carpet(3.5,3),new Lamp(3,false));
	livingRoom.getLamp().turnLightOn();
	livingRoom.getTelevision().turnOn();
	livingRoom.getTelevision().turnOff();
	livingRoom.getLamp().turnLightOff();
    }
}
