package z1;
public class Z1
{
    public Z1() {}
    public static void main(String[] args)
    {
        Thread myThready = new Thread(new Runnable(){ public void run(){} });
        System.out.println(myThready.getState());
        myThready.start();
        System.out.println(myThready.getState());
        try 
        {
			myThready.join();
		}
        catch (InterruptedException e)
        {
			e.printStackTrace();
		}
        System.out.println(myThready.getState());
    }
}