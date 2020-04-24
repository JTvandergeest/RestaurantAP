import java.util.ArrayList;

public class Waiter implements Employee{
    private String name;

    public Waiter(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.getClass().getSimpleName() + ": " + this.getName();
    }

}
