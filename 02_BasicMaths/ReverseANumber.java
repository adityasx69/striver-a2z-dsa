import java.util.Scanner;

public class ReverseANumber {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        int revNo = 0;
        int lastdigit;

        int sign;
        if (n<0){
            sign = -1;
        }
        else{
            sign = 1;
        }

        n = Math.abs(n);

        while(n>0){
            lastdigit = n % 10;
            n = n / 10;
            revNo = (revNo * 10) + lastdigit;
        }

        revNo = revNo * sign;

        System.out.println(revNo);
	}
}