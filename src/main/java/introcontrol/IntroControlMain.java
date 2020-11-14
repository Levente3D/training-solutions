package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();
        System.out.println(introControl.subtractTenIfGreaterThanTen(2));
        System.out.println(introControl.subtractTenIfGreaterThanTen(10));
        System.out.println(introControl.subtractTenIfGreaterThanTen(16));

        System.out.println(introControl.describeNumber(2));
        System.out.println(introControl.describeNumber(0));

        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Bill"));

        System.out.println(introControl.calculateBonus(560000));
        System.out.println(introControl.calculateBonus(1000000));
        System.out.println(introControl.calculateBonus(3500000));

        System.out.println(introControl.calculateConsumption(5600,9800));
        System.out.println(introControl.calculateConsumption(5600,580));

        System.out.println("printNumbers");
        introControl.printNumbers(20);

        System.out.println("printNumbersBetween");
        introControl.printNumbersBetween(18,11);

        System.out.println("printOddNumbers(21)");
        introControl.printOddNumbers(21);






    }
}
