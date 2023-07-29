package ThirdAssignment;

public class IfElseIfStatement {
    public static void main(String[] args) {
        int salary = 175000;
        if (salary <= 51000 && salary >= 35000) {
            System.out.println("SQA Engineer gets this salary");
        } else if (salary <= 70000 && salary >= 51001) {
            System.out.println("Sr. SQA Engineer gets this salary");
        } else if (salary <= 90000 && salary >= 70001) {
            System.out.println("Lead SQA Engineer gets this salary");
        } else {
            System.out.println("VP gets this salary");
        }
    }
}



