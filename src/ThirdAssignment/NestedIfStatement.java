package ThirdAssignment;

public class NestedIfStatement {
    public static void main(String[] args) {
        int salary = 50000;

        if (salary >= 40000) {

            if (salary == 50000) {

                System.out.println("Manager gets this salary");
            }
        } else {
            System.out.println("VP gets this salary");
        }
    }


}
