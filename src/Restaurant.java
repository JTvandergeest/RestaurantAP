import java.util.ArrayList;

public class Restaurant {

    private String name;
    private String location;
    private String manager;
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<OrderItem> menu = new ArrayList<>();
    private ArrayList<Table> tables = new ArrayList<>();

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName(){
        return this.name;
    }

    public Integer getTableCount(){
        return this.tables.size();
    }

    public void addTable(Table table){
        this.tables.add(table);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLocation(){
        return this.location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public void addOrderItem(OrderItem orderItem){
        this.menu.add(orderItem);
    }

    public OrderItem getOrderItem(String orderItemName){
        for (OrderItem OI : this.menu){
            if (OI.getName().equals(orderItemName)){
                return OI;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("Restaurant name: %s " + "\n" +
                "On location: %s" + "\n" +
                "Staff: " + employees + "\n" +
                "With tables" + tables + "\n" +
                "Menu: " + this.menu ,this.getName(), this.getLocation());
    }
}
