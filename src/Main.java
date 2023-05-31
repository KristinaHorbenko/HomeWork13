import Coffee.CoffeeOrderBoard;
import Coffee.Order.Order;
public class Main {
    public static void main(String[] args) {
       CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Alen");
        board.add("Yoda");
        board.add("Obi-van");
        board.add("John Snow");

        board.draw();


        Order nextOrder = board.deliver();
        System.out.println("Next Order: " + nextOrder.getNumber() + " - " + nextOrder.getName());


        Order deliveredOrder = board.deliver();
        System.out.println("Delivered Order: " + deliveredOrder.getName() + " | Order Number: " + deliveredOrder.getNumber());




    }
}










