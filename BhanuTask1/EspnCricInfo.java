package BhanuTask1;

import BhanuTask2.Batsman;
public class EspnCricInfo {
    private static final int size = 50;
    private final Batsman[] batsmens;
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

    public int addBatsman(String name, int runScored, int centuries, int halfcenturies) {
        if (noOfBatsmans < size - 1) {
            Batsman newbatsman = new Batsman(name, runScored, centuries, halfcenturies);
            batsmens[noOfBatsmans] = newbatsman;
            noOfBatsmans++;
        }
            return 0;
    }

    public Batsman updateBatsmanStats(int id, int centuries, int halfcenturies) {
        for(int i=0;i < noOfBatsmans;i++) {
            if (batsmens[i].getId() == id) {
                batsmens[i].setCenturies(centuries);
                batsmens[i].setHalfCenturies(halfcenturies);
                return batsmens[i];
            }
        }
        return null;

    }

    public Batsman getBatsmen(int batsmanid) {
        for(int i=0;i<noOfBatsmans;i++) {
            if (batsmens[i].getId()==batsmanid) {
                return batsmens[i];
            }
        }
        return null;
    }
}

