package z3;
class Cons implements Runnable
{
	Shop shop;
	Cons(Shop shop) {
	    this.shop=shop; 
	}
	@Override
	public void run(){
	    for (int i = 1; i < 6; i++) {
	        shop.get();
	    }
	}
}
