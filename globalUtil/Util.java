package com.havefunwith.globalUtil;

public class Util {

    public static void loading() {
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500);
                System.out.print(".");
            }
            Thread.sleep(1000);
            System.out.println();
        }
        catch (InterruptedException e) {
            System.out.println("Something went wrong while loading your changes");
        }
    }

}
