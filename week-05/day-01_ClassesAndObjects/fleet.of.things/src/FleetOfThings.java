//You have the Thing class
//You have the Fleet class
//You have the FleetOfThings class with a main method
//        Download those, use those
//        In the main method create a fleet
//        Achieve this output:
// Create a fleet of things to have this output:
// 1. [ ] Get milk
// 2. [ ] Remove the obstacles
// 3. [x] Stand up
// 4. [x] Eat lunch

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing thing1 = new Thing("Get milk");
        fleet.add(thing1);
        Thing thing2 = new Thing("Remove the obstacles");
        fleet.add(thing2);
        Thing thing3 = new Thing("Stand up");
        fleet.add(thing3);
        thing3.complete();
        Thing thing4 = new Thing("Eat lunch");
        fleet.add(thing4);
        thing4.complete();
        fleet.toString();

        System.out.println(fleet);
    }
}
