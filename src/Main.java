public class Main {
    public static void main(String[] args)
    {
        double price=1437;
        double taxRate=0.05;
        double salesTax = price*taxRate;
        double totalPrice = price + salesTax;
        System.out.println("The input price is:" + price);
        System.out.println("The total price, with 5% sales tax is:" + totalPrice);

    }
}