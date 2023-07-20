class FooBar {
    private int n;
    Semaphore foolock,barlock;

    public FooBar(int n) {
        this.n = n;
        foolock=new Semaphore(1);
        barlock=new Semaphore(0);
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
          foolock.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            barlock.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            barlock.acquire();

            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            foolock.release();
        }
    }
}