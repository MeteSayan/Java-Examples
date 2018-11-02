package com.info.string;

public class StringDegismezlikMain {

    public static void main(String[] args) {

        String s1 = "Merhaba Dünya";

        String s2 = s1;

        String s3 = "Merhaba Dünya";

        String s4 = "Merhaba ";

        String s5 = s4 + "Dünya";

        String s6 = new String("Merhaba Dünya");

        if (s1 == s6){
            System.out.println("Eşit");
        }
        else {
            System.out.println("Eşit değil");
        }

        String s7 = "Merhaba";

        String s8 = "MERHABA";

        if (s7.equalsIgnoreCase(s8)){
            System.out.println("Doğru");
        }
        else{
            System.out.println("Yanlış");
        }

        StringBuilder stringToplayici = new StringBuilder();

        stringToplayici.append("Merhaba");
        stringToplayici.append(" dünya");

        System.out.println(stringToplayici.toString());




    }

}
