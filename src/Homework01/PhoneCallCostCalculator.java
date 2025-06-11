package com.Homework01;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        int c1,c2,c3,t1,t2,t3,cost1,cost2,cost3,totalCost;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price per minute and duration of each call:");
        System.out.println("1 price per minute=");
        c1 = input.nextInt();
        System.out.println("Duration:");
        t1 = input.nextInt();

        System.out.println("2 price per minute=");
        c2 = input.nextInt();
        System.out.println("Duration:");
        t2 = input.nextInt();

        System.out.println("3 price per minute=");
        c3 = input.nextInt();
        System.out.println("Duration:");
        t3 = input.nextInt();

        cost1=c1*t1;
        cost2=c2*t2;
        cost3=c3*t3;
        totalCost=cost1+cost2+cost3;

        System.out.println("Cost1= "+cost1+"\nCost2= "+cost2+"\nCost3= "+cost3+"\nTotal Cost= "+totalCost);

    }
}
