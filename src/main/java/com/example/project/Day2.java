
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[][] naughtyOrNice = new String[2][names.length];
        Random random = new Random();
        for (int i = 0; i < names.length; i++) {
            int rand = random.nextInt(2);
            naughtyOrNice[rand][i] = names[i];
        }
        return naughtyOrNice; //you must return a two dimensional string array
    }

    public static void main(String[] args) {

    }
}