class basics{
    static int count = 0;
    static void print(){
        if(count == 3){
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