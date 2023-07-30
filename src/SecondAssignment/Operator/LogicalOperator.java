package SecondAssignment.Operator;

public class LogicalOperator {

    public static void main(String[] args) {

        int subject3;
        String name;

        int qty = 50, items = 20;
        int totalQty;
        String medicine;
        totalQty = qty < items ? qty : items;
        System.out.println(totalQty);

        totalQty = qty > items ? qty : items;
        System.out.println(totalQty);

        medicine = qty > items ? "Napa 500mg" : "Finix 20mg";
        System.out.println(medicine);


    }
}
