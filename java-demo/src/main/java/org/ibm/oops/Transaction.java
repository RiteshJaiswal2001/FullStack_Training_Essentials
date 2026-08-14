package org.ibm.oops;

public record Transaction(long transactionId,
    double amount,
     String description) implements Comparable<Transaction> {


        @Override
        public int compareTo(Transaction o) {
            
            return Double.compare(this.amount, o.amount);
        }
}