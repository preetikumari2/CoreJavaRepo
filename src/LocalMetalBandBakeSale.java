import java.util.*;
class Product{
    final private String pname;
    final private int quantity;
    final private double totalPrice;
    final private double paidAmount;
    final private double change;

    Product(String pname, int quantity, double totalPrice, double paidAmount, double change){
        this.pname = pname;
        this.quantity = quantity;
        this.paidAmount = paidAmount;
        this.totalPrice = totalPrice;
        this.change = change;
    }

    public String getPname() {
        return pname;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getChange() {
        return change;
    }
    public static void codeForItems(){
        HashMap<String, String> code = new HashMap<>();
        code.put("B ", " Brownie");
        code.put("M ", " Muffin");
        code.put("C ", " Cake Pop");
        code.put("W ", " Water");
        System.out.println(code);
    }
}


public class LocalMetalBandBakeSale {
    public static void main(String[] args) {
        String productName = null;
        int quantityOfItem = 0;
        double totalPriceToPay = 0.0;
        double amountPaid = 0.0;
        double change = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = sc.nextLine();
        System.out.println("Welcome to Local Metal Band's stall, " + name + "! We have the following items in the bake sale:");
        System.out.println("Brownie      $0.65     48 in stock");
        System.out.println("Muffin       $1.00     36 in stock");
        System.out.println("Coke Pop     $0.35     24 in stock");
        System.out.println("water        $1.50     30 in stock");
        Product.codeForItems();
        System.out.print("Items to purchase: ");
        productName = sc.next();
        switch (productName) {
            case "B":
                System.out.print("Enter the quantity: ");
                quantityOfItem = sc.nextInt();
                totalPriceToPay = quantityOfItem * 0.65;
                System.out.println("Your total price is: $" + totalPriceToPay);
                System.out.print("Enter the amount to pay: $");
                amountPaid = sc.nextDouble();
                change = totalPriceToPay - amountPaid;
                System.out.println("Your change is: $" + change);
                break;
            case "M":
                System.out.print("Enter the quantity: ");
                quantityOfItem = sc.nextInt();
                totalPriceToPay = quantityOfItem * 1.00;
                System.out.println("Your total price is: $" + totalPriceToPay);
                System.out.print("Enter the amount to pay: $");
                amountPaid = sc.nextDouble();
                change = totalPriceToPay - amountPaid;
                System.out.println("Your change is: $" + change);
                break;
            case "C":
                System.out.print("Enter the quantity: ");
                quantityOfItem = sc.nextInt();
                totalPriceToPay = quantityOfItem * 0.35;
                System.out.println("Your total price is: $" + totalPriceToPay);
                System.out.print("Enter the amount to pay: $");
                amountPaid = sc.nextDouble();
                change = totalPriceToPay - amountPaid;
                System.out.println("Your change is: $" + change);
                break;
            case "W":
                System.out.print("Enter the quantity: ");
                quantityOfItem = sc.nextInt();
                totalPriceToPay = quantityOfItem * 1.50;
                System.out.println("Your total price is: $" + totalPriceToPay);
                System.out.print("Enter the amount to pay: $");
                amountPaid = sc.nextDouble();
                change = totalPriceToPay - amountPaid;
                System.out.println("Your change is: $" + change);
                break;
        }
    }
}
