import java.util.Scanner;

class printNto1_backtack{
    static void print(int i,int n){

        if(i>n){
            return;
        }
        else{
            print(i+1,n);
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();;

        print(1,n);
    }
}