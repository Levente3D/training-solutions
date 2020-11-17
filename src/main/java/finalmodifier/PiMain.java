package finalmodifier;

import static finalmodifier.CircleCalculator.PI;

public class PiMain {

    public static void main(String[] args) {
        System.out.println(PI);

        CircleCalculator circleCalculator = new CircleCalculator();

        System.out.println(circleCalculator.calculateArea(5));
        System.out.println(circleCalculator.calculatePerimeter(5));

        CylinderCalculator cylinderCalculator = new CylinderCalculator();

        System.out.println(cylinderCalculator.calculateVolume(5, 10));
        System.out.println(cylinderCalculator.calculateSurfaceArea(5, 10));
    }
}
