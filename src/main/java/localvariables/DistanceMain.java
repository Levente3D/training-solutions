package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(25.25, false);
        System.out.println(distance.getDistanceInKm() + " " + distance.isExact());

        int intNr = (int) distance.getDistanceInKm();
        System.out.println(intNr);
    }
}
