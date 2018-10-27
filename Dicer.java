package com.company;

import java.util.Random;

public class Dicer {
    int dicesNo;

    public Dicer(int dicesNo){
        this.dicesNo = dicesNo;
    }

    public void throwDices(){
        Random random = new Random();

        StringBuilder stringBuilder = new StringBuilder("{");
        for(int i = 0; i<dicesNo; i++){
            stringBuilder.append(random.nextInt(6) + 1).append(",");
        }
        stringBuilder.delete(stringBuilder.lastIndexOf(","), stringBuilder.length());
        stringBuilder.append("}");
        System.out.println(stringBuilder.toString());
    }
 public static void main(String[] args){
        new Dicer(1).throwDices();
 }

        }
//    public void display(){
//        System.out.println(number);
//    }
