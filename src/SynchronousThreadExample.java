public class SynchronousThreadExample {
    public static void main(String[] args) {
        // Create three threads
        Thread thread1 = new NumberPrinter("Thread 1");
        Thread thread2 = new NumberPrinter("Thread 2");
        Thread thread3 = new NumberPrinter("Thread 3");

        // Start and wait for each thread to finish sequentially
        try {
            thread1.start();
            thread1.join(); // Wait for thread1 to finish

            thread2.start();
            thread2.join(); // Wait for thread2 to finish

            thread3.start();
            thread3.join(); // Wait for thread3 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Synchronous execution completed.");
    }
}

class NumberPrinter extends Thread {
    public NumberPrinter(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(100); // Sleep for a short time to simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
