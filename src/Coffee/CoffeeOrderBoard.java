package Coffee;

import Coffee.Order.Order;

import java.util.ArrayList;

public class CoffeeOrderBoard {
    private ArrayList<Order> orderList;
    private int nextNumber;

    public CoffeeOrderBoard() {
        orderList = new ArrayList<>();
        nextNumber = 1;
    }

    public int add(String name) {
        Order order = new Order(nextNumber, name);
        orderList.add(order);
        nextNumber++;
        return order.getNumber();
    }

    public Order deliver() {
        if (orderList.isEmpty()) {
            return null; // Якщо черга замовлень порожня, повертаємо null
        }

        Order nextOrder = orderList.get(0);
        orderList.remove(0);
        return nextOrder;
    }

    public Order deliver(int orderNumber) {
        for (int i = 0; i < orderList.size(); i++) {
            Order order = orderList.get(i);
            if (order.getNumber() == orderNumber) {
                orderList.remove(i);
                return order;
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("====================");
        System.out.println("Num | Name");
        for (Order order : orderList) {
            System.out.println(order.getNumber() + " | " + order.getName());
        }
    }
}
