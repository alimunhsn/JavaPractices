package ThirdAssignment;

public class WhileLoopStatement {
    public static void main(String[] args) {
        int sum = 0;
        int salary = 15000;

        while (sum <= 4) {
            salary = salary + sum;
            sum++;
            System.out.println(sum);
        }

        System.out.println("Result = " + salary);

    }
}

