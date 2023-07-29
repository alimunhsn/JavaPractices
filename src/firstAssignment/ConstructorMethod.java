package firstAssignment;

public class ConstructorMethod {

    String name;
    protected int salary;
    private static int pf =5000;

    public ConstructorMethod() //Constructor
    {
        this.name ="Md. Salary Man";
    }
    public int getSalary(){ // method
        return salary;
    }
    public void Provident(){ // method

        System.out.println(name +" Provident: "+pf+ " tk");
    }

    public static void main(String[] args) {
        ConstructorMethod constructorMethod = new ConstructorMethod();
        constructorMethod.salary=50000;
        System.out.println(constructorMethod.name + " salary: "+constructorMethod.getSalary()+ " tk");
        constructorMethod.Provident();
    }
}
