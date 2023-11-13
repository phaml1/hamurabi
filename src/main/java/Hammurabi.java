
import java.util.Random;         // imports go here
import java.util.Scanner;

public class Hammurabi {         // must save in a file named Hammurabi.java
    Random rand = new Random();  // this is an instance variable
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { // required in every Java program
        new Hammurabi().playGame();
    }

    void playGame() {
    int deaths, immigrants = 5, population = 100, acres = 1000, stores = 2800, acrePrice = 19;
        // declare local variables here: grain, population, etc.
        // statements go after the declations
    System.out.println("Welcome to Hammurabi!");
    for (int i = 0; i < 10; i++){
        askHowManyAcresToBuy(acrePrice, stores);
        askHowManyAcresToSell(acres);

    }
    }

    public int askHowManyAcresToBuy(int price, int bushels){
        System.out.println("How many acres do you wish to purchase?");
        int ask = scanner.nextInt();
        int askPrice = ask * price;
        if(bushels > askPrice){
            bushels -= askPrice;
            return bushels;
        }else {
         System.out.println("You're asking for too much! Ask again!");
         return bushels;
        }
    }

    public int askHowManyAcresToSell(int acresOwned){
        System.out.println("How many acres do you wish to sell?");
        while (true){
            int selling = scanner.nextInt();
            if (selling > acresOwned){
                System.out.println("You don't have enough! Try again!");
            }else {
                acresOwned -= selling;
                break;
            }
        }
        return acresOwned;
    }

    public int askHowMuchGrainToFeedPeople(int bushels){
        System.out.println("How many bushels do you wish to feed the people?");
        while (true){
            int feeding = scanner.nextInt();
            if (feeding > bushels){
                System.out.println("You don't have enough! Try again!");
            }else {
                bushels -= feeding;
                break;
            }
        }
        return bushels;
    }

    public int askHowManyAcresToPlant(int acresOwned, int population, int bushels){
        return 0;
    }

    public int plagueDeaths(int num){return 0;}

    public int starvationDeaths(int num, int num2){return 0;}

    public boolean uprising(int num, int num2){return false;}

    public int immigrants(int num, int num2, int num3){return 0;}

    public int harvest(int num){return 0;}

    public int grainEatenByRats(int num){return 0;}

    public int newCostOfLand(){return 0;}

    //other methods go here

}