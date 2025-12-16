import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int dup = n;
        int lastdigit;
        int sum = 0;
        int count = 0;
        int temp = dup;

        while(temp>0){
            temp = temp/10;
            count = count + 1;
        }

        temp = dup;

        while(temp>0){
            lastdigit = temp % 10;
			sum = sum + (int)Math.pow(lastdigit,count);
            temp = temp / 10;
        }

        if (sum == dup){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

	}
}
