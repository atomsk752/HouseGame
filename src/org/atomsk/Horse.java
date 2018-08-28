package org.atomsk;

import java.util.Map;

public class Horse extends Thread {

    private int pos;
    private String name;

    public Horse(String name){
        this.name = name;


    }

    @Override
    public void run() {
        gallop();
    }

    public void gallop(){

        for (int i = 0; i < 100; i++) {

            int amount = (int)(Math.random()*10);
            this.pos += amount;

            int count = this.pos/10; //멀티쓰레드를 돌리면 static으로 돌리는 count를 쓰레드가 다 같이 돌려씀
                                     // 점이 마구 늘어난다!
            synchronized (System.out) {
                for (int j = 0; j < count; j++) {
                    System.out.print(".");
                }
                System.out.println(this.name+":"+this.pos);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }//ed 4

    }


}
