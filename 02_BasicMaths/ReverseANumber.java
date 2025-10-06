import java.util.Scanner;

public class ReverseANumber {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int revNo = 0;
        int lastdigit;

        while(n>0){
            lastdigit = n % 10;
            n = n / 10;
            revNo = (revNo * 10) + lastdigit;
        }
        System.out.println(revNo);
	}
}
