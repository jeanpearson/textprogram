/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconversion;

/**
 *
 * @author jaybryantc
 */
public class ConversionProcess {
    double fahrenheit;
    double celsius;
   

    public ConversionProcess(double fahrenheit, double celsius) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;     
    }
    
    double Fahrenheit(){
        return this.fahrenheit;
    }
    
    double Celsius(){
        return this.celsius;
    }
    
    double ctof(double celsius){
        this.fahrenheit = ((9*celsius)/5)+32;
        return this.fahrenheit;       
    }
    
    double ftoc(double fahrenheit){
        this.celsius = (fahrenheit-32)*5/9;
        return this.celsius;    
    }
        
}
