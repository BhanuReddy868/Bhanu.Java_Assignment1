package BhanuTask4;

class Manager extends employee{

    private ManagerType  type;

   public ManagerType getTpye() {
        return type;    }

  public void setTpye(ManagerType tpye) {
       this.type = tpye;
   }

    public Manager() {
    }

    public Manager(String name, int emp_id, double salary) {
        super(name, emp_id, salary);
    }



    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
        if(type == ManagerType.HR) {
            super.setSalary(salary + 10000);
        }
         else if (type == ManagerType.Sales) {
                super.setSalary(salary + 5000);

            } else {
            super.setSalary(salary );

        }
    }
}

