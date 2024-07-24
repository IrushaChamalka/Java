import java.util.Scanner;

class fibonacci{
    public static int fibo(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        return fibo(n-1) + fibo(n-2);   
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        for(int i=1 ;i< number;i++){
            System.out.print(fibo(i) + " ");
        }
        
    }

}