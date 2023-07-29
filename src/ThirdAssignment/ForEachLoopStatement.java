package ThirdAssignment;

public class ForEachLoopStatement {
    public static void main(String[] args) {

        int arrayNumber[] = {1, 2, 3, 4, 5, 6, -12};
        int sum = 0;

        for (int number : arrayNumber) {
            sum += number;
        }
        System.out.println("Sum = "+ sum);

        System.out.println("====================================");

        String[] medicine = {"Napa", "Finix", "Fxo","Rupa"};
        for (String names : medicine) {
            System.out.println(names);
        }

        System.out.println("====================================");
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(char item:vowels)
            System.out.println(item);
        }

    }

