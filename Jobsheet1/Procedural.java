public class Procedural {
    public static void main(String[] args) {
        String itemName1 = "Coffe";
        float price1 = 120000.0f;
        int quantity1 = 3;

        String itemName2 = "Sugar";
        float price2 = 30000.0f;
        int quantity2 = 1;

        String itemName3 = "Ice Latte";
        float price3 = 45000.0f;
        int quantity3 = 4;

        System.out.println(itemName1 + ": " + total(price1, quantity1));
        System.out.println(itemName2 + ": " + total(price2, quantity2));
        System.out.println(itemName3 + ": " + total(price3, quantity3));
    }

    static float total(float price, int quantity){
        return price * quantity;
    }
}
