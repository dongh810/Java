package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);

        printOrders(productOrders);
        System.out.println("총 결제 금액: " + getTotalAmount(productOrders));
    }

    public static ProductOrder createOrder(String name, int price, int amount) {
        ProductOrder po = new ProductOrder();
        po.productName = name;
        po.price = price;
        po.quantity = amount;

        return po;
    }

    public static void printOrders(ProductOrder[] po) {
        for(ProductOrder pos : po) {
            System.out.println(pos.productName + " " + pos.price + " " + pos.quantity);
        }
    }

    public static int getTotalAmount(ProductOrder[] po) {
        int total=0;
        for(ProductOrder pos: po) {
            total = total + pos.price * pos.quantity;
        }
        return total;
    }
}
