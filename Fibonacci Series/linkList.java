import java.util.LinkedList;
import java.util.Scanner;

public class linkList {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();

        int fib1 =1,fib2=1;
        list.add(fib1);
        list.add(fib2);

        System.out.print("Enter number : ");
        int number = input.nextInt();

        for (int i = 2; i < number; i++) {
            list.add(list.get(i-1)+list.get(i-2));
        }
        System.out.println(list);
        
    }
}
