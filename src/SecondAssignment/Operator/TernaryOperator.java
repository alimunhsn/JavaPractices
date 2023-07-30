package SecondAssignment.Operator;

public class TernaryOperator {

    public static void main(String[] args) {

        int  qty= 50;
        int price =20;
        System.out.println( qty>price||qty<=price);
        System.out.println( qty<price||qty<=price);
        System.out.println( qty<=price && qty !=price);
        System.out.println( qty>=price && qty !=price);
        System.out.println( qty !=price && qty==price);
        System.out.println( qty==price||qty>price);

    }
}
