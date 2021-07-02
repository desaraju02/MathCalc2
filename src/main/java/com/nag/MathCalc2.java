package com.nag;


public class MathCalc2 {

    public static void main(String[] args) {
        System.out.println(new MathCalc2().isEven(4));
    }

    public boolean isEven(int n){
        return n%2==0?true:false;
    }

    public boolean isOdd(int n){
        return n%2==0?false:true;
    }

}
