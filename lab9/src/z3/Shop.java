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
        System.out.println("(-1) - ��������� ������!");
        System.out.println("\n���������� ����������� � �������� �����������: " + countr);
        notify();
    }
    public synchronized void put() {
        while (countr >= 3) {
            try {
                wait();
            }catch (InterruptedException e) {} 
        }
        countr++;
        System.out.println("(+1) - ��������� ��������.");
        System.out.println("\n���������� ����������� � �������� �����������: " + countr);
        notify();
    }
}

