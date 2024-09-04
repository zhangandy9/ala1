public class Employee extends Person{
    private String position;
    private double salary;

    public Employee(){
        super();
        position="none";
        salary=0.0;
    }
    /**
     * Constructor with five parameters
     * @param id initial value for the id
     * @param name initial value for the name
     * @param address initial value for the address
     * @param phone initial value for the phone number
     * @param email initial value for the email address
     * @param position initial value for the position
     * @param salary initial value for the salary
     */
    public Employee(int id,String name,String address,String phone,String email,String position,double salary){
        super(id,name,address,phone,email);
        this.position=position;
        this.salary=salary;
    }
    //@param position value of the position
    public String getPosition(){
        return position;
    }
    //@param Salary value of the Salary
    public double getsalary(){
        return salary;
    }
    //@param position value of the position
    public void setPosition(String position){
        this.position=position;
    }
    //@param salary value of the salary
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String toString(){
        String str=super.toString();
        str+=String.format("Position:%s\nAnnual salary:%.2f\n,",position,salary);
        return str;
    }
}