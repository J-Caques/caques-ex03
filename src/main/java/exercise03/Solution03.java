/*
   UCF COP3330 Fall 2021 Assignment 1 Solution
   Copyright 2021 Jonathan Caques
 */
package exercise03;

import java.util.Scanner;

public class Solution03 {
    /*
        Print "What is the quote?"
        Use scanner to read user input
        String quote = input.nextLine()
        Print "Who is the author?"
        Use scanner to read user input
        String author = input.nextLine()
        Printf( author + "once said. " + "\"" + quote + "\"
     */
    public static void main(String[] args) {
        System.out.println("What is the quote?");

        Scanner input  = new Scanner(System.in);
        String quote = input.nextLine();

        System.out.println("Who was the author?");

        Scanner input2 = new Scanner(System.in);
        String author = input2.nextLine();

        System.out.printf(author + " once said, " + "\"" + quote + "\"");
    }
}
