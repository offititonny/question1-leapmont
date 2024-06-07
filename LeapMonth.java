/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questionone;
import java.util.Scanner;
/**
 *
 * @author TONNY OS
 */
public class LeapMonth {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        boolean isLeapMonth = (year % 4 == 0) && (month % 100 != 0) || (month % 400 == 0);

        if (isLeapMonth) {
            System.out.println("The given month is a leap month.");
        } else {
            System.out.println("The given month is not a leap month.");
        }
    }}

