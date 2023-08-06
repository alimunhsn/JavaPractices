package ThirdAssignment;

public class ForLoopStatement {
    public static void main(String[] args) {
        int sum = 0;
        int salary = 2;

        for (int x = 1; x <= salary; ++x) {
            sum += x;
        }
        System.out.println("Sum = " + sum);
        {
            for (int x = 10; x >= salary; --x) {
                sum += x;
            }
            System.out.println("Result = " + sum);
        }
    }
}

