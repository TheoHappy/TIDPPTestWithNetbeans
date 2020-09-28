/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author theo
 */
public class TestDebugger {
     public static void main(String[] args) {
        int n;
        int numbers;
        int min = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = 0; i < n; i++){
            numbers = input.nextInt();
            if (numbers < min){
                min = numbers;
            }
        }

        System.out.println("The smallest number is " + min);
    }
}
