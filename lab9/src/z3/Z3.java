package z3;
public class Z3 {
	public static void main(String[] args) 
    {
        Shop shop = new Shop();
        Prod  prod = new Prod(shop);
        Cons  cons = new Cons(shop);
        new Thread(prod).start();
        new Thread(cons).start();
    }
}
