import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int dup = n;
        
        int revNo = 0;
        int lastdigit;

        boolean isPalindrome;

        while(n>0){
            lastdigit = n % 10;
            n = n / 10;
            revNo = (revNo * 10) + lastdigit;
        }

        if (revNo == dup){
            isPalindrome = true;
            System.out.println("It is a palindrome!");
        }
        else{
            isPalindrome = false;
            System.out.println("It is not a palindrome!");
        }
        
	}
}
