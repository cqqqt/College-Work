package z3;
class Prod implements Runnable
{
    Shop shop;    
    Prod(Shop shop) {
       this.shop=shop; 
    }
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            shop.put();
        }
    }
}
