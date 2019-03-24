package p_r_test;

public class Custom {
    private Depot depot;

    public Custom(Depot depot) {
        this.depot = depot;
    }

    public void consume(final int val) throws InterruptedException {
        new Thread(){
            @Override
            public void run() {
                try {
                    depot.consume(val);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }
}
