package BhanuTask1;

import BhanuTask2.Batsman;

import java.util.Optional;

public class EspnCricInfo {
    private static final int size = 50;
    private Batsman[] batsmens;
    private int noOfBatsmans;

    public EspnCricInfo() {
      this.batsmens = new Batsman[size];
      this.noOfBatsmans = 0;
    }

    public Batsman[] getBatsmens() {
      return batsmens;
    }

    public int getNoOfBatsmans() {

      return noOfBatsmans;
    }

    public  Batsman  addBatsman(String name, int runScored, int centuries, int halfcenturies) {
      if (noOfBatsmans < size-1) {
        batsmens[noOfBatsmans] = new Batsman(name, runScored, centuries, halfcenturies);
        noOfBatsmans++;
          System.out.println( "generated id is"+Batsman.getId());
      }
      return null;

    }

   public Batsman updateBatsmanStats(int id, int centuries, int halfcenturies) {
      if (id >= 0 && id < noOfBatsmans && batsmens[id] != null) {
        batsmens[id].setCenturies(centuries);
        batsmens[id].setHalfCenturies(halfcenturies);
        return batsmens[id];
      }
      return null;

    }

    public Batsman getBatsmen(int batsmanid) {
      if (batsmanid >= 0 && batsmanid < noOfBatsmans && batsmens[batsmanid] != null) {
        return batsmens[batsmanid];
      }
      return null;
    }

    public static void  main(String[] args) {
      EspnCricInfo espn = new EspnCricInfo();
      espn.addBatsman("virat", 5000, 100, 150);
      espn.addBatsman("rohit", 3000, 45, 97);
      espn.addBatsman("Dhoni", 10000, 100, 100);
      espn.addBatsman("Dube", 4000, 56, 90);

      Batsman[] batsmen = espn.getBatsmens();
      for (Batsman batsman : batsmen) {
        if (batsman != null) {
          System.out.println("Name : "+ batsman.getName() + " runScored : " + batsman.getRunsScored() + "   centuries : " + batsman
                  .getCenturies() + " half-Centuries : " + batsman.getHalfCenturies());
        }

      }
      Batsman updatedBatsman = espn.updateBatsmanStats(1, 50, 100);
      if (updatedBatsman != null) {
        System.out.println("Updated Batsman: " + updatedBatsman.getName() +
                ", Centuries: " + updatedBatsman.getCenturies() +
                ", Half-Centuries: " + updatedBatsman.getHalfCenturies());
      } else {
        System.out.println("Batsman not found.");
      }
      System.out.println();
      Batsman getbatsman=espn.getBatsmen(10002);
      if(getbatsman !=null){
        System.out.println("ID : " + getbatsman.getId() + " Name : " + getbatsman.getName() + " runScored : " + getbatsman.getRunsScored() + "   centuries : " + getbatsman
                .getCenturies() + " half-Centuries : " + getbatsman.getHalfCenturies());

      }
      System.out.println("no of batsmans added is : "+espn.getNoOfBatsmans());;

    }
  }
