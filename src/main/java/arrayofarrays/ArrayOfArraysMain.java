package arrayofarrays;

public class ArrayOfArraysMain {

    public int[][] multiplicationTable(int size){
        int [][] multiplicationTable =new int[size][size];
        for (int x = 0; x < size;x++){
            for (int y = 0; y < size; y++){
                multiplicationTable[x][y] = (y + 1) * (y + 1);
            }
        }
        return multiplicationTable;
    }

    public void printArrayOfArrays(int[][] a) {
        for (int x[] : a) {
            for (int y : x) {
                if (y < 10) {
                    System.out.print("  ");
                } else if (y < 100) {
                    System.out.print(" ");
                }
                System.out.print(y);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int[][] triangularMatrix(int size){
        int[][] triangularMatrix = new int[size][size];
        for (int x = 0; x <triangularMatrix.length; x++){
            triangularMatrix[x] = new int[x + 1];
            for (int y = 0; y < x + 1; y++){
                triangularMatrix[x][y] = x;
            }
        }
        return triangularMatrix;
    }


    public int[][] getValues() {
        int[][] values = new int[12][];
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int x = 0; x < numberOfDays.length; x++) {
            values[x] = new int[numberOfDays[x]];
        }
        return values;
    }


    public static void main(String[] args) {
        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();

        System.out.println("Multiplication table");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.multiplicationTable(10));

        System.out.println("Triangular matrix");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.triangularMatrix(3));

        System.out.println("Values per days");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.getValues());
    }
}
