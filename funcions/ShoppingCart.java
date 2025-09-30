public class ShoppingCart {
    public static String addItem(String product){
    return (product);
    }
    public static String addItem (String product , int quantity){
        return (product + quantity);
    }
    public static String addItem (String product, int quantity,int price){
        return (product + quantity * price);
    }
    public static void main(String[]args){
        System.out.println (addItem("shirt"));
         System.out.println (addItem("shirt",3));
        System.out.println (addItem("shirt", 3, 500));
    }
}
