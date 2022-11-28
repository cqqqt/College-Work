package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        Phil[] phs = new Phil[5];
        Object[] forks = new Object[phs.length];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < phs.length; i++) {
            Object LFork = forks[i];
            Object RFork = forks[(i + 1) % forks.length];

            if (i == phs.length - 1) {
                phs[i] = new Phil(RFork, LFork);
            } else {
                phs[i] = new Phil(LFork, RFork);
            }

            Thread thr = new Thread(phs[i], "The Philosopher " + (i + 1));
            thr.start();
        }
    }
}