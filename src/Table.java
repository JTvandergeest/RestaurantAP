import java.util.ArrayList;

public class Table {
    private Integer tableNumber;
    private Integer seats;
    private ArrayList<OrderItem> order = new ArrayList<>();
    private Customer customer;
    private ArrayList<Waiter> isServedBy = new ArrayList<>();

    public Table(Integer tableNumber, Integer seats) {
        this.tableNumber = tableNumber;
        this.seats = seats;
    }

    public Integer getTableNumber(){
        return this.tableNumber;
    }

    public Integer getSeats(){
        return this.seats;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public Boolean hasCustomer(){
        return this.customer != null;
    }

    public void addWaiter(Waiter waiter){
        this.isServedBy.add(waiter);
    }

    public void doOrder(OrderItem orderItem){
        this.order.add(orderItem);
    }

    public void removeWaiter(Waiter waiter){
        this.isServedBy.remove(waiter);
    }
    
    public Double getReceiptAmount(){
        Double total = new Double(0);
        for (OrderItem oi : order){
            total += oi.getPrice();
        }
        return total;
    }

    public void Pay(){
        this.order.clear();
    }

    public String toString(){
        return "\nTablenumber: " + this.getTableNumber() + "\n" +
                "Order" + order + "\n" +
                "Total Price" + this.getReceiptAmount() + "\n" +
                "Has customer at table: " + (this.hasCustomer());
    }
}
