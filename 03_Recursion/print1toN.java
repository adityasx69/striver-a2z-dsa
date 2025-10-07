import java.util.Scanner;

class print1toN{
    static int count = 1;
    static Scanner scanner = new Scanner(System.in);

    static int n = scanner.nextInt();;

    static void print(){

        if(count == n+1){
            return;
        }
        else{
            System.out.println(count);
            count++;
            print();
        }
    }
    public static void main(String[] args){
        print();
    }
}