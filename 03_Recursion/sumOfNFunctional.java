import java.util.Scanner;

class sumOfNFunctional{

    static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n + sum(n-1);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = sum(n);
        System.out.println(sum);
    }
}