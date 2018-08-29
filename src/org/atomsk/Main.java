package org.atomsk;

public class Main {

    public static void main(String[] args) {

        Horse[] arr = new Horse[10];
        arr[0] = new Horse("양말");
        arr[1] = new Horse("그짓말");
        arr[2] = new Horse("아무말1");
        arr[3] = new Horse("정말");
        arr[4] = new Horse("사랑한단말");
        arr[5] = new Horse("암흑의다크니스");
        arr[6] = new Horse("전설의레전드");
        arr[7] = new Horse("말말말");
        arr[8] = new Horse("뭔말");
        arr[9] = new Horse("아무말8");



        for (Horse h:arr
             ) {h.start();

        }


    }
}
