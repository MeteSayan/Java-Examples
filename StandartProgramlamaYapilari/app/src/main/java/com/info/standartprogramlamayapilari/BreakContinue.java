package com.info.standartprogramlamayapilari;

public class BreakContinue {

    public static void main(String args[]) {

        for (int i = 0; i < 6; i++) {

            /*   if (i == 3){
               break;
           }*/
            if (i == 3){
                continue;
            }
            System.out.println("index: " + i);
        }

    }
}