package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        Boolean b = message.equals("Hello John Doe");
        Boolean c = message.equals ("Hello John Doe");
      // String minta = "" + "";
      //  System.out.println(minta);
        String minta = "abcde";
        System.out.println(minta.length());
        System.out.println(minta.charAt(0) + ", " + minta.charAt(2));
        System.out.println(minta.substring(0,2));
    }
}
