public class fibonacci {
    public static void main(String[] args) {
        fibonacciSequence(9);
    }
    public static void fibonacciSequence(int n){
 
        int fib1 = 0 , fib2 = 1;

        System.out.println(fib1);
        System.out.println(fib2);

        for(int i = 2;i<n; i++){
            int fib3 = fib1 + fib2 ;
            fib1 = fib2;
            fib2 = fib3;

            System.out.println(fib3);

        }

    }

}
