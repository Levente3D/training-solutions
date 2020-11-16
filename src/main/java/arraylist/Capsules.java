package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colors = new ArrayList<>();

    public void addLast(String color){
        colors.add(color);
    }

    public void addFirst(String color){
        colors.add(0, color);
    }

    public void removeFirst(){
        colors.remove(0);
    }

    public void removeLast(){
        colors.remove(colors.size() - 1);
    }

    public List<String> getColors(){
        return colors;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("Red");
        capsules.addLast("Black");
        capsules.addLast("Green");
        capsules.addFirst("Yellow");
        capsules.addFirst("White");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}
