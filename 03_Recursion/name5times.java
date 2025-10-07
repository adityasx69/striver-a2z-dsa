class name5times{
    static int count = 0;
    static void printName(){
    if(count == 5){
        return;
    }
    else{
        System.out.println("Aditya");
        count++;
        printName();
    }

    }
    public static void main(String[] args){
        printName();
    }
}