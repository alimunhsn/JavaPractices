package firstAssignment;

public class VariableExercise {
    protected String name = "Md Alimun Hasan"; //Declared Instance Variable
    public int salary =50000; //Declared Instance Variable
    private static int pf=15000; //Declared static Variable

    public static void main(String[] args) {

        int MobBill = 1000; //Declared a Local Variable
        VariableExercise tester = new VariableExercise();
        System.out.println( tester.name + " draw salary " + tester.salary);
        System.out.println(tester.name +" Mobile bill is "+ MobBill);
        System.out.println(tester.name+ " Provident fund "+ pf);

    }
}
