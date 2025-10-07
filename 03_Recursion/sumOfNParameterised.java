import java.util.Scanner;
class sumOfNParameterised{

    static void sum(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        else{
            sum(i-1,sum+i);
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        sum(n,0);
    
    }
}