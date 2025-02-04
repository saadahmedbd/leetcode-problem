package A_Master_OOP;

public class car {
    public static void main(String arg[]) {
        carBand cb = new carBand();
        cb.band = "mercedes benz";
        cb.model = "AMG g wagon";
        System.out.println(cb.band());
    }

    public static class carBand {
        String band;
        String model;

        public String band() {
            System.out.println("that car band is " + band + " and model is " + model);
            return "thanks";
        }

    }
}
//theory
// In the programming world everything is object.
// object have two things: 1. properties another is 2. behaviors
//if you want to create an object first you need to class.
// java class works as blueprint that blueprint helps us to create many things.
//java JVM(java virtual machine) manages java objects and class
