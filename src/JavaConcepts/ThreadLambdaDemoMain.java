package JavaConcepts;

import javax.swing.*;

public class ThreadLambdaDemoMain {
    public static void main(String[] args) {


        //First Thread : - sourabh

        Runnable sourabh = () -> {
            for(int i = 1 ;i<=10;i++){
                System.out.println("hello ji");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        };

        Thread t = new Thread(sourabh);
        t.setName("Sourabh");
        t.start();

        Runnable ashish = () -> {
            for(int i=1;i<=10;i++){
                System.out.println(5+" * "+ i +" = "+5*i);
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException s){
                s.printStackTrace();
            }
        };

        Thread t2 = new Thread(ashish);
        t2.setName("ashish");
        t2.start();




    }

}
