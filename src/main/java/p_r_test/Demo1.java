package p_r_test;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Depot depot=new Depot(100);
        Producter producter = new Producter(depot);
        Custom custom=new Custom(depot);

        producter.produce(60);
        producter.produce(120);
        custom.consume(90);
        custom.consume(150);
        producter.produce(110);
    }
}
