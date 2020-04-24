public class Manager implements Employee{
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.getClass().getSimpleName() + ": " + this.getName();
    }
}