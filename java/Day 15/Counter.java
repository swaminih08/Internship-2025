package Day15.java;

public class Counter {
	    private int count = 0;

	    public synchronized void increment() {
	        count++;
	    }

	    public int getValue() {
	        return count;
	    }
	}

	class CounterThread extends Thread {
	    Counter counter;

	    CounterThread(Counter counter) {
	        this.counter = counter;
	    }

	    public void run() {
	        for (int i = 0; i < 1000; i++) {
	            counter.increment();
	        }
	    }
	
	    public static void main(String[] args) {
	        Counter counter = new Counter();

	        CounterThread t1 = new CounterThread(counter);
	        CounterThread t2 = new CounterThread(counter);

	        t1.start();
	        t2.start();

	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted.");
	        }

	        System.out.println("Final Counter Value: " + counter.getValue());
	    }
	}


