public class User implements Observer{
    public User(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void update(String productName) {
        System.out.println("Hello "+name+" , "+productName+" is back in stock");
    }
}
