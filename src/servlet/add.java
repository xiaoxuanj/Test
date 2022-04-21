package servlet;

public class add extends Thread{
    private int i;

    public add() {
    }

    public add(int i) {
        this.i = i;
    }

    public void run(){
        for (int j =0;j<=50000;j++){
            i++;
        }
    }
}
