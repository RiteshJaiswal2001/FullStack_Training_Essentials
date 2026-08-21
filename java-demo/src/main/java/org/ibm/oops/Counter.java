package org.ibm.oops;

/**
 * Counter
 */
public class Counter {

        private int count = 0;

        private object lock = new object();
        public synchronized void increment(){
            count++;
        }
    
}
