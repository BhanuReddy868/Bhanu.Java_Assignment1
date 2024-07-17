package BhanuTask2;

public class Batsman {
    private static int idgenerator=10;
   private  final int id;
    private final String name;
    private int runsScored;
    private int centuries;
    private int halfCenturies;


    public Batsman(String name, int runsScored,int centuries, int halfCenturies) {
        this.id=++idgenerator;
        this.name = name;
        this.centuries = centuries;
        this.halfCenturies = halfCenturies;
        this.runsScored = runsScored;
    }

    public int getId(){
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

    @Override
    public String toString() {
        return "id=" + id +
                " name='" + name +
                " runsScored=" + runsScored +
                " centuries=" + centuries +
                " halfCenturies=" + halfCenturies;
    }

    public int getRunsScored() {
        return runsScored;
    }


}

