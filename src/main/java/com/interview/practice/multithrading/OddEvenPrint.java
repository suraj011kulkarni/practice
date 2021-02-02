package com.interview.practice.multithrading;

public class OddEvenPrint {

int L=1;
int R=10;

 public boolean printOdd=true;

    public static void main(String[] args) {

        OddEvenPrint oddEvenPrint = new OddEvenPrint();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                oddEvenPrint.printEven();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                oddEvenPrint.printOdd();
            }
        });

        thread1.start();
        thread2.start();


    }


   public void printEven(){



synchronized (this){


        while (L<R){
            while (printOdd==true){
                    try{
                        wait();
                    }catch (InterruptedException i){

                    }
            }

            if(L%2==0 || L==1){
                System.out.println("i m from even "+L);
            }

            L++;
            printOdd=true;
            notify();

        }
        }


    }

   public void printOdd(){

       try{
           Thread.sleep(1000);
       }catch (InterruptedException i){

       }

       synchronized (this){


           while (L<R){
               while (printOdd==false){
                   try{
                       wait();
                   }catch (InterruptedException i){

                   }
               }
               if(L%2!=0){
                   System.out.println("i m from odd "+L);
               }

               L++;
               printOdd=false;
               notify();

           }
       }
    }

}
