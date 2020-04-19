//https://leetcode.com/problems/print-in-order/
class PrintInOrder {

    //Lock value to force methods to wait for the lock to update
    volatile int lock = 0;
    
    public Foo() {
        
    }
    
    public void first(Runnable printFirst) throws InterruptedException {
        
        //Infinite Loop to let threads wait
        while(lock != 0){}
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        lock = 1;
        
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        //Infinite Loop to let threads wait    
        while(lock != 1){}
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        lock =2;
        
    }

    public void third(Runnable printThird) throws InterruptedException {
      
        //Infinite Loop to let threads wait
        while(lock != 2){}
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        lock = 0;
        
    }
}
