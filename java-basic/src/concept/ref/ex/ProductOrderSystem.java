package concept.ref.ex;

import java.util.Scanner;

public class ProductOrderSystem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int orderAmount;
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        orderAmount = Integer.parseInt(in.nextLine());

        System.out.println(orderAmount);

        ProductOrder[] productOrders = new ProductOrder[orderAmount];

        for (int i = 0; i < orderAmount; i++) {
            System.out.println(i+1 + "번째 주문 정보를 입력하세요");
            System.out.print("상품명: ");
            String name = in.nextLine();
            System.out.print("가격: ");
            int price = Integer.parseInt(in.nextLine());
            System.out.print("수량: ");
            int quantity = Integer.parseInt(in.nextLine());

            productOrders[i] = createOrder(name, price, quantity);

        }
        printOrders(productOrders);
        getTotalAmount(productOrders);
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

    public static void getTotalAmount(ProductOrder[] po) {
        int total=0;
        for(ProductOrder pos: po) {
            total = total + pos.price * pos.quantity;
        }
        System.out.println(total);
    }



}
