import java.util.Scanner;
public class CheckPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n = scanner.nextInt();

        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                count++;
                if((n/i) != i){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

}