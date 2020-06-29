package machine;

import java.util.Scanner;

public class Machine {
    Scanner scanner = new Scanner(System.in);
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    public Machine() {
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.cups = 9;
        this.money = 550;
    }

    public void run() {
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String option = scanner.next();
            switch (option) {
                case "buy":
                    buyCoffee();
                    System.out.println();
                    break;
                case "fill":
                    fillMachine();
                    System.out.println();
                    break;
                case "take":
                    takeMoney();
                    System.out.println();
                    break;
                case "remaining":
                    printDetails();
                    System.out.println();
                    break;
                case "exit":
                    System.exit(1);
                default:
                    System.out.println("buy, fill, take");
            }
        }
    }

    public void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String option = scanner.next();
        switch (option) {
            case "1":
                if (water - 250 >= 0) {
                    if (beans - 16 >= 0) {
                        if (cups - 1 >= 0) {
                            this.water -= 250;
                            this.beans -= 16;
                            this.cups--;
                            this.money += 4;
                            System.out.println("I have enough resources, making you a coffee!");
                        } else {
                            System.out.println("Sorry, not enough disposable cups!");
                        }
                    } else {
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "2":
                if (water - 350 >= 0) {
                    if (milk - 75 >= 0) {
                        if (beans - 20 >= 0) {
                            if (cups - 1 >= 0) {
                                this.water -= 350;
                                this.milk -= 75;
                                this.beans -= 20;
                                this.cups--;
                                this.money += 7;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                System.out.println("Sorry, not enough disposable cups!");
                            }
                        } else {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    } else {
                        System.out.println("Sorry, not enough milk!");
                    }
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "3":
                if (water - 200 >= 0) {
                    if (milk - 100 >= 0) {
                        if (beans - 12 >= 0) {
                            if (cups - 1 >= 0) {
                                this.water -= 200;
                                this.milk -= 100;
                                this.beans -= 12;
                                this.cups--;
                                this.money += 6;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                System.out.println("Sorry, not enough disposable cups!");
                            }
                        } else {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    } else {
                        System.out.println("Sorry, not enough milk!");
                    }
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "back":
                run();
            default:
                System.out.println("1 - espresso, 2 - latte, 3 - cappuccino");
        }
    }

    public void fillMachine() {
        System.out.println("Write how many ml of water do you want to add:");
        this.water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        this.milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        this.beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        this.cups += scanner.nextInt();
    }

    public void takeMoney() {
        System.out.printf("I gave you $%d", this.money);
        this.money = 0;
    }

    public void printDetails() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d of water\n", this.water);
        System.out.printf("%d of milk\n", this.milk);
        System.out.printf("%d of coffee beans\n", this.beans);
        System.out.printf("%d of disposable cups\n", this.cups);
        System.out.printf("%d of money\n", this.money);
    }
}
