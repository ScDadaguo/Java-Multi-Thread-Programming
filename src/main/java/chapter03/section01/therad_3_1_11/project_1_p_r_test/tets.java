package chapter03.section01.therad_3_1_11.project_1_p_r_test;

import chapter01.section07.thread_1_7_7.project_1_stopThrowLock.SynchronizedObject;

public class tets {

    public static void main(String[] args) {
        final String lock=new String("");
        Thread thread=new Thread(new Runnable() {
            public void run() {
                synchronized (lock){
                    System.out.println(1);
                    lock.notify();
                }


            }
        });
        thread.start();
    }

}
