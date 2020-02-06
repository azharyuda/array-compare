package com.azhar.comparearray.compare;

import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input panjang array: ");
        int pjgArray = input.nextInt();

        int alice[] = new int[pjgArray];
        int bob[] = new int[pjgArray];

        int aliceLength = alice.length;
        int bobLength = bob.length;
        int i = 0;
        int j = 0;

        int aliceTemp = 0;
        int bobTemp = 0;

        int sumAlice = 0;
        int sumBob = 0;


        for(i = 0; i < aliceLength; i++){
            System.out.print("Input skor ke- " + i + " dari Alice: ");
            alice[i] = input.nextInt();
        }
        System.out.println("====================================");
        for(j = 0; j < bobLength; j++){
            System.out.print("Input skor ke- " + j + " dari Bob: ");
            bob[j] = input.nextInt();
        }
        for(int k = 0; k < aliceLength; k++){
            if(alice[k] < bob[k]){
                bobTemp = bobTemp + 1;
                sumBob = bobTemp;
            }else if(bob[k] < alice[k]){
                aliceTemp = aliceTemp  + 1;
                sumAlice = aliceTemp;
            }
        }
        System.out.println("Alice Score: " + sumAlice);
        System.out.println("Bob Score: " + sumBob);
    }
}
