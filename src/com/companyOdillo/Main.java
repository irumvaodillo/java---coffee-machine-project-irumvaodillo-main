package com.companyOdillo;
import java.util.Scanner;

class CoffeeMachine {

    public static void main(String[] args) {
        // write your code here

        CoffeeMachine obj1=new CoffeeMachine();
        // obj1.printingCoffee();
        obj1.readData();
    }



    public void printingCoffee(){
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print(">");
        int cups=scanner.nextInt();
        System.out.println("For"+cups+"cups of coffee you will need:");
        System.out.println(200*cups+" ml of water");
        System.out.println(50*cups+" ml of milk");
        System.out.println(15*cups+" g of coffee beans");
    }
    public void readData(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.println("Write how many cups of coffee you will need: ");
        int water=scanner.nextInt();
        int milk=scanner.nextInt();
        int bean=scanner.nextInt();
        int cup=scanner.nextInt();



        int cupsAvailable = Math.min(water/200, Math.min(milk/50, bean/15));
        if (cup== cupsAvailable) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cup > cupsAvailable) {
            System.out.println("No, I can make only " + cupsAvailable + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupsAvailable - cup) + " more than that)");
        }


    }

}

