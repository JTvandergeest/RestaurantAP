public class OrderItem {
    private String name;
    private Double price;

    public OrderItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }

    public String toString(){
        return name + ": " + price;
    }
}