public class Main {
    public static void main(String args[]){
        Product iPhone= new Product("IPhone 16 pro");

        Observer user1 =new User("Tooba");
        Observer user2=new User("Shafaq");

        iPhone.registerObserver(user1);
        iPhone.registerObserver(user2);

        iPhone.setInstock(true);
    }
}
