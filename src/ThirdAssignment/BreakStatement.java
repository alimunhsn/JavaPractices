package ThirdAssignment;

public class BreakStatement {
    public static void main(String[] args) {
        int sum = 0;
        int salary = 10;

        for (int x = 1; x <= salary; x++) {
            if (x == 5) {
                break;
            }
            sum += x;
            System.out.println(x);
            System.out.println("Sum = " + sum);

        }
    }
}

