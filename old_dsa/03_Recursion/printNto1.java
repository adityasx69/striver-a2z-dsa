import java.util.Scanner;

class printNto1{
    static void print(int i,int n){

        if(i<1){
            return;
        }
        else{
            System.out.println(i);
            print(i-1,n);
        }
    }
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();;

        print(n,n);
    }
}