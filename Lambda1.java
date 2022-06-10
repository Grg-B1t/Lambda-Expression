import java.util.ArrayList;

public class Lambda1{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("Awesome");
        al.add("Shazam");
        al.add("Bazinga");
    
        // for (String string : al) {
        //      System.out.println(string);
        //  }

        al.forEach(
            (string)->System.out.println(string)
        );
    }
}