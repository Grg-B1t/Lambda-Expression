@FunctionalInterface
interface i{
    void hello();
}

@FunctionalInterface
interface i2{
    int multiply(int num1, int num2); 
}

// public class hi implements i{
//     public void hello(){
//         System.out.println("Hello and Hi");
//     }
// }

public class Main{
    public static void main(String[] args) {
        i inter = ()-> System.out.println("Hello and Hi");
        inter.hello();
    
        i2 mult = (num1, num2)-> num1 * num2; 
        System.out.println(mult.multiply(2, 3)); 
    }

    public int addition(int num1, int num2){
        return num1 + num2;
    }

}