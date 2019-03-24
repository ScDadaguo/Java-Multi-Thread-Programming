package p_r_test;

public class Producter {
    private Depot depot;

    public Producter(Depot depot) {
        this.depot = depot;
    }

    public void produce(final int val) throws InterruptedException {
        new Thread(){
            @Override
            public void run() {
                try {
                    depot.produce(val);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();


    }


}
