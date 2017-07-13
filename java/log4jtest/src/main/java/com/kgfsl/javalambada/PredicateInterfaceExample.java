import java.util.function.Predicate;
public class PredicateInterfaceExample {
    public static void main(String[] args) {
     Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
        System.out.println(pr.test(20)); // Calling Predicate method
        
        //Gladiator gl = PredicateInterfaceExample::blblbl;
        //System.out.println(gl.test(25));
   }}

   // static boolean blblbl(int x) {
   //     return (x % 2 == 0);
   // }
//}

//interface Gladiator {
   // boolean test(int a);
//}