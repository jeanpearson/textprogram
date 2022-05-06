/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconversion;

import java.util.Scanner;

/**
 *
 * @author jaybryantc
 */
public class TemperatureConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int fahrenheit = 0, celsius = 0, temp =0;
     
       Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("Temperature Convertion!");
            System.out.println("[0] Convert Fahrenheit to Celsius");
            System.out.println("[1] Convert Celsius to Fahrenheit");
            int choice = sc.nextInt();
            
            switch (choice){
                case 0:
                    System.out.println("Enter Fahrenheit Temperature: ");
                    temp = sc.nextInt();
                    ConversionProcess cpft = new ConversionProcess(temp, temp);
                    System.out.println(cpft.ftoc(temp));
                   
                case 1:
                    System.out.println("Enter Celsius Temperature: ");
                    temp = sc.nextInt();
                    ConversionProcess cpct = new ConversionProcess(temp, temp);
                    System.out.println(cpct.ctof(temp));;
                   
                   
            }      
        } while (1 != 0);
        
       
       
        
    }
    
}
