package com.info.nesnetabanliprogramlama3.Objects;

public class Elma implements Eatable,Squeezable{
    @Override
    public void howToEat() {
        System.out.println("Yıka ve ye.");
    }

    @Override
    public void howToSqueeze() {
        System.out.println("Soy ve suyunu çıkar.");
    }
}
