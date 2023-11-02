package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class PlaceHolders {
    public static void main(String[] args) {
        Integer oldWeight;
        Integer newWeight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter old weight:");
        oldWeight = sc.nextInt();

        System.out.println("Enter new weight:");
        newWeight = sc.nextInt();

        //Creating the Logger object
        Logger logger = LoggerFactory.getLogger(PlaceHolders.class);

        //Logging the information
        logger.info("Old weight is {}. new weight is {}.", oldWeight, newWeight);

        //Logging the information
        logger.info("After the program weight reduced is: "+(oldWeight-newWeight));
    }
}
