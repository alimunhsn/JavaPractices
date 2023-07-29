package firstAssignment;

public class Medicine {
    String Medicine = "Napa 500mg ";
    private int mrp = 250;

    public static void main(String[] args) {
        firstAssignment.Medicine medicinePrice = new Medicine();
        System.out.println(medicinePrice.Medicine + "Per Pkg MRP " +medicinePrice.mrp+" BDT");
    }
}
