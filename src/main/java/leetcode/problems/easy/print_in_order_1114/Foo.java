package leetcode.problems.easy.print_in_order_1114;

class Foo {
    private int runs = 0;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        runs++;
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (true) {
            if (runs == 1) {
                runs++;
                // printSecond.run() outputs "second". Do not change or remove this line.
                printSecond.run();
                break;
            } else {
                Thread.sleep(1);
            }
        }

    }

    public void third(Runnable printThird) throws InterruptedException {
        while (true) {
            if (runs == 2) {
                printThird.run();
                break;
            } else {
                Thread.sleep(1);
            }
        }
    }
}
