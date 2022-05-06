/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbank;

/**
 *
 * @author jaybryantc
 */
public class ProcessBank extends NetBank{
    private final String username;
    private final String password;
    private int balance;
    
    public ProcessBank(String username, String password, int balance){
        this.username = username;
        this.password = password;
        this.balance = balance;
    }
    
    String username(){
        return this.username;
    }
    
    String password(){
        return this.password;
    }
    
    int balance(){
        return this.balance;
    }
    
    void viewBalance(){
        System.out.println("Hello! "+this.username);
        System.out.println("Balance Saving: "+this.balance);
    }
    
    int depositBalance(int balance){
        this.balance += balance;
        return this.balance;
    }
    
    int withdrawalBalance(int balance){
        this.balance -= balance;
        return this.balance;
    }
    
}
