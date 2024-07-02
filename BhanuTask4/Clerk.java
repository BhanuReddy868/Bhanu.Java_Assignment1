package BhanuTask4;

public class Clerk extends employee {
    int speed;
    int accuracy;
    private boolean increment=false;

    public Clerk() {
        this.speed = speed;
        this.accuracy = accuracy;
    }

    public Clerk(String name,int emp_id, int salary,int speed, int accuracy) {
        this.speed = speed;
        this.accuracy = accuracy;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAccuracy() {

        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
        if (!increment &&speed > 70 && accuracy > 80) {
            super.setSalary(salary + 1000);
            increment=true;
        } else {
            super.setSalary(salary);

        }

    }
}
