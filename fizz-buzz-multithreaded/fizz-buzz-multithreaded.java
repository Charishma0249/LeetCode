class FizzBuzz {
    private int n;
    private int c;

    public FizzBuzz(int n) {
        this.n = n;
        this.c = 1;
    }

    // printFizz.run() outputs "fizz".
    synchronized public void fizz(Runnable printFizz) throws InterruptedException {
        
        while(c<=n)
        {
        if(c%3==0 && c%5!=0)
        {
            printFizz.run();
            c++;
            notifyAll();
        }
        else
            wait();
        }
        
    }

    // printBuzz.run() outputs "buzz".
    synchronized public void buzz(Runnable printBuzz) throws InterruptedException {
        
        while(c<=n)
        {
        if(c%3!=0 && c%5==0)
        {
            printBuzz.run();
            c++;
            notifyAll();
        }
        else
            wait();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    synchronized public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        
        while(c<=n)
        {
        if(c%5==0 && c%3==0)
        {
            printFizzBuzz.run();
            c++;
            notifyAll();
        }
        else
            wait();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    synchronized public void number(IntConsumer printNumber) throws InterruptedException {
        
        while(c<=n)
        {
        if(c%5!=0 && c%3!=0)
        {
            printNumber.accept(c);
            c++;
            notifyAll();
        }
        else
            wait();
        }
    }
    
    
}