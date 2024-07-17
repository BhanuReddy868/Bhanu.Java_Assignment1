package BhanuTask3;

public class Time {
    private int h1;
    private int m1;
    private int s1;

    public void timeA(String time1) {
        String[] split = time1.split(":");
        h1 = Integer.parseInt(split[0]);
        m1 = Integer.parseInt(split[1]);
        s1 = Integer.parseInt(split[2]);
    }

    private int h2;
    private int m2;
    private int s2;

    public void timeB(String time2) {
        String[] split = time2.split(":");
        h2 = Integer.parseInt(split[0]);
        m2 = Integer.parseInt(split[1]);
        s2 = Integer.parseInt(split[2]);
    }

    void difference() {
        int s = s1 - s2;
        if (s < 0) {
            s += 60;
            m1--;
        }
        int m = m1 - m2;
        if (m < 0) {
            m += 60;
            h1--;
        }
        int h = h1 - h2;
        if (h < 0) {
            h += 24;
        }
        System.out.println("The difference is  : " + h + ":" + m + ":" + s);

    }
}

