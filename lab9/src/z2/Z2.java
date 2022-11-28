package z2;
public class Z2 
{
	public static int mValue=0;
    static Incremenator mInc;
    public static void main(String[] args)
    {
    	mInc=new Incremenator();
    	mInc.start();
    	for (int i = 1; i < 6; i++) {
    		try 
    		{
    			System.out.println("Kuryshev");
    			Thread.sleep(1000);
	        }
    		catch(InterruptedException e) 
    		{
    			
    		}
	    mInc.changeAction();
	    }
    mInc.finish();	
    }
}
