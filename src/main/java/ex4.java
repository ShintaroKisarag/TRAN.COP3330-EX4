/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Noun: ");
        String noun = input.nextLine();     //stores noun

        System.out.print("Enter Verb: ");
        String verb = input.nextLine();     //stores verb

        System.out.print("Enter Adjective: ");
        String adjective = input.nextLine();    //stores adjective

        System.out.print("Enter Adverb: ");
        String adverb = input.nextLine();   //stores adverb

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious");

    }
}
