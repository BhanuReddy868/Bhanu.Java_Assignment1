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

    public Batsman addBatsman(String name, int runScored, int centuries, int halfcenturies) {
        if (noOfBatsmans < size - 1) {
            batsmens[noOfBatsmans] = new Batsman(name, runScored, centuries, halfcenturies);
            noOfBatsmans++;
            System.out.println("generated id is" + Batsman.getId());

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
}

