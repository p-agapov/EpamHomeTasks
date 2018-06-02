package com.agapovp.epam.fundamentals.ht3.ex1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CrazyLogger crazyLogger = new CrazyLogger();

        crazyLogger.log("start to do something...");
        Thread.sleep(3000);
        crazyLogger.log("something happened.");
        Thread.sleep(1000);
        crazyLogger.log("stopping everything...");
        Thread.sleep(3000);
        crazyLogger.log("everything has been stopped.");

        crazyLogger.findAndPrint("");
    }
}
