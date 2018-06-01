package com.agapovp.epam.fundamentals.ht2.ex6;

public class NuclearSubmarine {
    private String model;
    private int number;
    private EngineForNuclearSubmarine engineForNuclearSubmarine;

    public NuclearSubmarine(String model, int number) throws InterruptedException {
        this.model = model;
        this.number = number;
        System.out.println(String.format("Submarine:%s with board number:%d was created.", model, number));
        Thread.sleep(1000);
        System.out.println("Creating engine for submarine...");
        Thread.sleep(3000);
        this.engineForNuclearSubmarine = new EngineForNuclearSubmarine();
        System.out.println("Engine was created.");
    }

    void sendToSail() throws InterruptedException {
        System.out.println("Submarine is trying to start to sail...");
        Thread.sleep(2000);
        engineForNuclearSubmarine.isWorking();
        Thread.sleep(2000);
        engineForNuclearSubmarine.turnOn();
        engineForNuclearSubmarine.isWorking();
        Thread.sleep(3000);
        System.out.println("Submarine is sailing now.");
    }

    class EngineForNuclearSubmarine {
        private boolean working;

        public EngineForNuclearSubmarine() {
            this.working = false;
        }

        public void isWorking() {
            if (working) {
                System.out.println("Engine is on.");
            } else {
                System.out.println("Engine is off.");
            }
        }

        public void turnOn() throws InterruptedException {
            System.out.println("Initiating engine...");
            Thread.sleep(3000);
            this.working = true;
        }

        public void turnOff() throws InterruptedException {
            System.out.println("Stopping engine...");
            Thread.sleep(1000);
            this.working = true;
        }

    }
}
