package z3;
public class Shop {
	private int countr = 0;
    public synchronized void get()
    {
        while (countr < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        countr--;
        System.out.println("(-1) - Телевизор купили!");
        System.out.println("\nКоличество телевизоров в магазине электроники: " + countr);
        notify();
    }
    public synchronized void put() {
        while (countr >= 3) {
            try {
                wait();
            }catch (InterruptedException e) {} 
        }
        countr++;
        System.out.println("(+1) - Телевизор привезли.");
        System.out.println("\nКоличество телевизоров в магазине электроники: " + countr);
        notify();
    }
}

