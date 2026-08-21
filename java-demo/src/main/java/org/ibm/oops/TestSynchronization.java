package org.ibm.oops;

public class TestSynchronization {

        public static void main(String[] args) {
            Counter counter = new Counter();
            Thread [] threads = new Thread[1000];  //-- it only intilizaton not creation.

            for (int i = 0; i < threads.length; i++) {
                //System.out.println("Threads [i]" + threads[i]);  --null
                threads[i] = new Thread(() -> {
                    for (int j = 0; j < threads.length; j++) {
                        counter.increment();
                    }
                });

                //System.out.println("Threads [i]" + threads[i]);   //-- thread.

                threads[i].start();
            }

            for (Thread t : threads) {
                try {
                    t.join();
                } catch (InterruptedException e) {
                   System.out.println();
                }
            }
        }
}
