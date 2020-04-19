class 1115PrintFooBarAlternately {
    private int n;
    volatile boolean turn = true;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            //Lock for Foo
            while(!turn){}
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            turn = false;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            //Lock for Bar
            while(turn){}
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            turn = true;
        }
    }
}
