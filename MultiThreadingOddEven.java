class Even extends Thread{
    public void run(){
        for(int i = 0; i <= 20; i++){
            if(i%2 == 0){
                System.out.printf("Even : %d\n",i);
            }
        }
    }

}

class Odd extends Thread{
    public void run(){
        for(int i = 0; i <= 20; i++){
            if(i%2 != 0){
                System.out.printf("Odd : %d\n",i);
            }
        }
    }
}

public class MultiThreadingOddEven {
    public static void main(String[] args) {
        Even even = new Even();
        Odd odd = new Odd();
        even.start();
        odd.start();
    }
}
