import java.util.Scanner;

class print1toN_backtack{
    static void print(int i,int n){

        if(i<1){
            return;
        }
        else{
            print(i-1,n);
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();;

        print(n,n);
    }
}