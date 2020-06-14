public class RC {
    public static void main(String[] args) {
        findNum();
    }

    public static void findNum(){
        for( int i = 1; i <= 100; i++ ){
            if(i%3==0 && i%5==0){
                System.out.println("Number: " + i + " CracklePop");
            } else if(i%5==0){
                System.out.println("Number: " + i + " Pop");
            } else if(i%3==0){
                System.out.println("Number: " + i + " Crackle");
            }
        }
    }
}
