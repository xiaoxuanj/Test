package servlet;

public class reduce extends Thread{
    private int i;

    public reduce() {
    }

    public reduce(int i) {
        this.i = i;
    }

    public void run(){
        for (int j =0;j<=50000;j++){
            i--;
        }
    }
}
