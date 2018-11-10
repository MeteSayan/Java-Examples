package com.info.ilerijava;

public class TryCatchMain {

    public static void main(String[] args) {

        int x = 5;
        int y = 0;

        int dizi[] = new int[2];


        try {
            System.out.println("Sonuç: "+(x/y));
            System.out.println("işlem tamam");
            dizi[1] = 8;


        }
        catch (ArithmeticException e){
            System.out.println("Sayılar sıfıra bölünmez");

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dizinin boyunu aştınız");

        }
        /*catch (Exception e){

            if (e instanceof ArithmeticException){
                System.out.println("Sayılar sıfıra bölünmez");
            }
            if (e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("Dizinin boyunu aştınız");
            }
        }*/




    }




}
