class Food implements Runnable{
    private String task;

    Food(String task){
        this.task = task;
    }

    public void run(){
        System.out.println(task+" is prepared by "+Thread.currentThread().getName());
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Thread f1 = new Thread(new Food("Pasta"));
        Thread f2 = new Thread(new Food("Maggie"));
        Thread f3 = new Thread(new Food("Chowmin"));
        f1.start();
        f2.start();
        f3.start();
    }
}
