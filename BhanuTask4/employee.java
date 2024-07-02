package BhanuTask4;

public class employee {
    private String name;
    private int emp_id;
    private double salary;

    enum ManagerType{
        HR,
        Sales
    }
    public employee() {
        this.name=name;
        this.emp_id=emp_id;
        this.salary=salary;
    }

    public employee(String name, int emp_id, double salary) {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Manager m=new Manager("bhanu",01,50000);
        m.setTpye(ManagerType.HR);
        m.setSalary(50000);
        System.out.println("Salary of hr manager is "+m.getSalary());
        m.setTpye(ManagerType.Sales);
        m.setSalary(50000);
        System.out.println("Salary of Sales manager is"+m.getSalary());

        Clerk c=new Clerk("bhanu",01,50000,75,85);
        c.setSalary(5000);
        System.out.println("salary of clerk is "+c.getSalary());


    }
}
