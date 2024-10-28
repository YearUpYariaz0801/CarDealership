package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {
    public static final String

    //read from CSV file
    try{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inventory));

        String line;
        while((line = bufferedReader.readLine()) != null){

            if (line.startsWith("D")) {
                String[] titleArr = line.split("\\|");

                dealership.setName(titleArr[0]);
                dealership.setAddress(titleArr[1]);
                dealership.setPhoneNumber(titleArr[2]);
            } else {
                String[] lineArr = line.split("\\|");
            }
        }
    }



}
