package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println(b);

        int a = 2;
        System.out.println(a);

        int i = 3, j = 4;
        System.out.println(i);
        System.out.println(j);

        int k = i;
        System.out.println(k);

        String s = "Hello World";
        System.out.println(s);
        String t = s;
        System.out.println(t);

        {
            int x = 0;

            System.out.println(a); // kiirja, mert ez a blokk az "a"-t meghatározó blokkon belül van
        }
      //  System.out.println(x); - nem látja, mert "x" egy mélyebb blokkban van ahova nem lát ez a blokk
    }
}
