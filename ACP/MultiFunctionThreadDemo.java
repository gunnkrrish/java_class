package ACP;

class Worker implements Runnable {

    private volatile boolean running = true;

    private String taskName;

    public Worker(String taskName) {

        this.taskName = taskName;

    }

    public void run() {

        while (running) {

            try {

                System.out.println(taskName + " is working on thread: " + Thread.currentThread().getName());

                Thread.sleep(1000); // simulate work

            } catch (InterruptedException e) {

                System.out.println(taskName + " was interrupted.");

            }

        }

        System.out.println(taskName + " has stopped.");

    }

    public void stop() {

        running = false;

    }

}

public class MultiFunctionThreadDemo {

    public static void main(String[] args) {

        // Creating multiple Worker instances with different functions

        Worker task1 = new Worker("Task 1 - Downloading");

        Worker task2 = new Worker("Task 2 - Processing");

        Worker task3 = new Worker("Task 3 - Saving");

        // Assigning threads

        Thread t1 = new Thread(task1, "Download-Thread");

        Thread t2 = new Thread(task2, "Process-Thread");

        Thread t3 = new Thread(task3, "Save-Thread");

        // Start the threads

        t1.start();

        t2.start();
        task2.stop();
   
        t3.start();

        // Let them run for 5 seconds

        try {

            Thread.sleep(5000);

        } catch (InterruptedException e) {

            System.out.println("Main thread interrupted.");

        }

        // Now stop all threads gracefully using stop() method (custom flag)

        System.out.println("\nStopping all tasks...");

        task1.stop();

        

        task3.stop();

    }

}
