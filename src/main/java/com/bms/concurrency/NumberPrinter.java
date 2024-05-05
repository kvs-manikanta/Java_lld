package com.bms.concurrency;



public class NumberPrinter implements Runnable {
    private final int start;
    private final int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        int totalNumbers = 100;
        int threadsCount = 5;
        int numbersPerThread = totalNumbers / threadsCount;

        for (int i = 0; i < threadsCount; i++) {
            int start = i * numbersPerThread + 1;
            int end = (i + 1) * numbersPerThread;
            if (i == threadsCount - 1) {
                end = totalNumbers;
            }
            Thread thread = new Thread(new NumberPrinter(start, end));
            thread.start();
        }
    }
}
