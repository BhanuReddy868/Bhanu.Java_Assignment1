package BhanuTask2;

public class Batsman {
   private static int id;
    private String name;
    private int runsScored;
    private int centuries;
    private int halfCenturies;
    private static int idgenerator=100000;



   public Batsman(){
        this.id=++idgenerator;
   }

    public Batsman(String name, int runsScored,int centuries, int halfCenturies) {
        this.id=++idgenerator;
        this.name = name;
        this.centuries = centuries;
        this.halfCenturies = halfCenturies;
        this.runsScored = runsScored;
    }

    public static int getId(){
        return id;
    }

    public String getName() {

        return name;
    }
    public int getCenturies()
    {
        return centuries;
    }

    public void setCenturies(int centuries) {
        this.centuries = centuries;
    }
    public int getHalfCenturies() {

        return halfCenturies;
    }

    public void setHalfCenturies(int halfCenturies) {
        this.halfCenturies = halfCenturies;
    }


    public int getRunsScored() {
        return runsScored;
    }

}

