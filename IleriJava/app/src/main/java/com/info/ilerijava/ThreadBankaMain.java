package com.info.ilerijava;

public class ThreadBankaMain {

    public static void main(String[] args) {

        Banka b = new Banka(900);

        BankaIslemThread is1 = new BankaIslemThread(b,"Ali" , 500);
        BankaIslemThread is2 = new BankaIslemThread(b, "Zeynep", 600);

        is1.start();
        is2.start();




    }

    static class BankaIslemThread extends Thread{

        private Banka b;
        private String isim;
        private int tutar;

        public BankaIslemThread(Banka b,String isim, int tutar){
            this.b = b;
            this.isim = isim;
            this.tutar = tutar;
        }

        @Override
        public void run() {

            try {
                Thread.sleep(100);
                b.paraCek(isim,tutar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



        }
    }

}
