import java.util.function.Predicate;

public class Lambda2 {
    public static void main(String[] args) {
        Predicate<Integer> pr = (a)->(a>10);
        System.out.println(pr.test(11));
    }   
}
