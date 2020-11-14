package introcontrol;

public class IntroControl {
    public int subtractTenIfGreaterThanTen(int number){
        if (number <= 10) {return number;}
                     else {return number - 10;}
    }
    public String describeNumber(int number){
        if (number == 0) {return "zero";}
                    else {return "not zero";}
    }
    public String greetingToJoe(String name){
        if (name.equals("Joe")) {return "Hello joe";}
                           else {return "";}
    }

    public int calculateBonus(int sale){
        if (sale >= 1000000){return sale / 10;}
                       else {return 0;}
    }

    public int calculateConsumption(int prev, int next) {
        if (prev <= next) {return next - prev;}
                     else {return 9999 - prev + next;}
    }

    public void printNumbers(int max){
        for (int x = 0; x <= max; x++){
            System.out.println(x);
        }
    }
    public void printNumbersBetween(int min, int max){
        for (int x = min; x < max; x++){ //a megoldásban "x<=max". A feladatban a két érték KÖZÖTTIT kellett kiírni. :)
            System.out.println(x);
        }
    }
    public void printNumbersBetweenAnyDirection(int a, int b){
        if (a < b) {
            for (int x = a; x <= b; x++){
                System.out.println(x);
            }
        }
        else {
            for (int x = a; x >= b; a--){
                System.out.println(x);
            }
        }
    }

    public void printOddNumbers(int max){
        for (int x = 1; x <= max; x = x + 2){
            System.out.println(x);
        }
    }


}
