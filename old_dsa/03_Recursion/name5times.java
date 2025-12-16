import java.util.Scanner;

class name5times{
    static void printName(int i,int n){
    if(i>n){
        return;
    }
    else{
        System.out.println("Aditya");
        printName(i+1,n);
    }

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printName(1,n);
    }
}