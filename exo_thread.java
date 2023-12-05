class Paire implements Runnable {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Paire: " + i);
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Impaire implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Impaire: " + i);
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
    




public class exo_thread {
    public static void main(String[] args) {
        Paire a = new Paire();
        Impaire b = new Impaire();

        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);
         
        thread1.start();
        thread2.start();
    }
}
