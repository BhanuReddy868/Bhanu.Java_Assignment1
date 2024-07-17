package BhanuTask1;

import BhanuTask2.Batsman;

public class Main {
    public static void main(String[] args) {
        EspnCricInfo espn = new EspnCricInfo();
        espn.addBatsman("virat", 5000, 100, 150);
        espn.addBatsman("rohit", 3000, 45, 97);
        espn.addBatsman("Dhoni", 10000, 100, 100);
        espn.addBatsman("Dube", 4000, 56, 90);
        espn.addBatsman("abhishek sharma",2000,15,50);

        Batsman[] batsmen = espn.getBatsmens();
        for (Batsman batsman : batsmen) {
            if (batsman != null) {
                System.out.println(batsman);
            }

        }

        System.out.println("no of batsmans added is : " + espn.getNoOfBatsmans());
        System.out.println();
        Batsman updatedBatsman = espn.updateBatsmanStats(12, 50, 100);
        if (updatedBatsman != null) {
            System.out.println("Updated Batsman: " + updatedBatsman.getName() +
                    ", Centuries: " + updatedBatsman.getCenturies() +
                    ", Half-Centuries: " + updatedBatsman.getHalfCenturies());
        } else {
            System.out.println("Batsman not found.");
        }

        System.out.println();

        Batsman getbatsman = espn.getBatsmen(12);
        if (getbatsman != null) {
            System.out.println("The batsmen details are : "+getbatsman);
        }else{
            System.out.println("batsman not fount");
        }

    }
}
