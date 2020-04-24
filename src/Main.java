public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("McDonalds", "Almere");
        OrderItem oi1 = new OrderItem("Coca Cola", 2.50);
        OrderItem oi2 = new OrderItem("Hertog Jan", 2.20);
        OrderItem oi3 = new OrderItem("Big Mac Menu", 8.50);
        restaurant.addOrderItem(oi1);
        restaurant.addOrderItem(oi2);
        restaurant.addOrderItem(oi3);

        OrderItem item = restaurant.getOrderItem("Coca Cola");
        Table table1 = new Table(1, 4);
        Table table2 = new Table(2, 4);
        Table table3 = new Table(3, 4);
        restaurant.addTable(table1);
        restaurant.addTable(table2);
        restaurant.addTable(table3);

        Waiter w1 = new Waiter("Walter");
        table1.addWaiter(w1);

        Manager b1 = new Manager("Bart Baksel");
        restaurant.addEmployee(w1);
        restaurant.addEmployee(b1);

        Customer cus1 = new Customer("Harold");
        table1.setCustomer(cus1);

        table1.doOrder(restaurant.getOrderItem("Coca Cola"));
        table1.doOrder(restaurant.getOrderItem("Coca Cola"));

        System.out.println(restaurant.toString());

    }
}