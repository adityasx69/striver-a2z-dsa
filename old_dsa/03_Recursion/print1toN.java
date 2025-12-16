import java.util.Scanner;

class print1toN{
    static void print(int i,int n){

        if(i>n){
            return;
        }
        else{
            System.out.println(i);
            print(i+1,n);
        }
    }
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();;

        print(1,n);
    }
}