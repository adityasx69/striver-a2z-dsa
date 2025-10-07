import java.util.Scanner;

class Factorial{

    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n * sum(n-1);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = sum(n);
        System.out.println(sum);
    }
}