package array;

import java.util.logging.Handler;

public class ArrayHandler {
    public boolean contains(int[] source, int itemToFind){
        for (int item : source){
            if (item == itemToFind){
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind){
        for (int x = 0; x < source.length; x++){
            if (source[x] == itemToFind){
                return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        final int[]testArray = new int[]{2, 6, 11, 16, 20};

        System.out.println("Contains method");
        System.out.println(arrayHandler.contains(testArray, 9));
        System.out.println(arrayHandler.contains(testArray, 16));

        System.out.println("Find method");
        System.out.println(arrayHandler.find(testArray, 5));
        System.out.println(arrayHandler.find(testArray, 11));
    }
}
