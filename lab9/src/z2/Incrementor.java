package z2;
class Incremenator extends Thread implements Runnable{
    private volatile boolean mIsIncrement = true;
    private volatile boolean mFinish= false;
    public void ChangeAction() {
    	mIsIncrement=!mIsIncrement;
    }
    public void finish()
    {
    	mFinish=true;
    	
    }
    public void changeAction() {
        this.mIsIncrement = !this.mIsIncrement;
    }
   @Override
    public void run() {
    	do {
    		
    		if(!mFinish)
    		{
    			System.out.println("Aleksey");
    		}
    		else
    			return;
    		try {
    			Thread.sleep(1000);
    		}catch(InterruptedException e) {}
    	}while(true);
    }
}
