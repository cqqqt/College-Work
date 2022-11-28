package com.company;

public class Phil implements Runnable {
    private Object LFork;
    private Object RFork;

    public Phil(Object LFork, Object RFork) {
        this.LFork = LFork;
        this.RFork = RFork;
    }
    @Override
    public void run() {
        try {
            Behaviour(System.nanoTime() + ": decided to reflect.");
            synchronized (LFork) {
                Behaviour(System.nanoTime() + ": raised the left fork.");
                synchronized (RFork) {
                    Behaviour(System.nanoTime() + ": took the right fork and started eating.");
                    Behaviour(System.nanoTime() + ": lowered the right fork.");
                }
                Behaviour(System.nanoTime() + ": put down the left fork, he started thinking again.");
            }
        } 
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
    private void Behaviour(String behav) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + behav);
        Thread.sleep(((int) (Math.random() * 100)));
    }
}
