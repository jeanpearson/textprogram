/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbank;

import java.util.Scanner;

/**
 *
 * @author jaybryantc
 */
public class NetBank {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        // TODO code application logic here
        NetBank nb = new NetBank();
        nb.login();
    }
    
    
    void login(){
    
        String username ="";
        String password ="";
        int balance = 0;
        
        Scanner sc = new Scanner(System.in);
        NetBank nb = new NetBank();
        
        System.out.println("Welcome to NetBank!");
        do{
            System.out.println("Enter your Username: ");
            username = sc.next();
            System.out.println("Enter your Password: ");
            password = sc.next();
            
            if(username.equals("admin") && password.equals("password"))
                nb.menu(username, password, balance);
            else
                System.out.println("try again.");
            
        }while(1 != 0);
    }
    
    void menu(String username, String password, int balance){
        ProcessBank pb = new ProcessBank(username, password, balance);
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Welcome! "+pb.username());
            System.out.println("Current Balance: " + pb.balance());
            System.out.println("[0] View Balance");
            System.out.println("[1] Deposit Balance");
            System.out.println("[2] Withdraw Balance");
            System.out.println("[3] Sign-out!");
            
            System.out.println("choice:");
            String choice = sc.next();
            
            if(choice.equals("0"))
               viewBalance(pb.username(),pb.password(),pb.balance());
            if(choice.equals("1"))
                depositBalance(pb.username(),pb.password(),pb.balance());
            if(choice.equals("2"))
                withdrawBalance(pb.username(),pb.password(),pb.balance());
            if(choice.equals("3"))
                login();
            
                        
        }while(true);
    }
  

    private void viewBalance(String username, String password, int balance) {
        ProcessBank pb = new ProcessBank(username, password, balance);
        pb.viewBalance();
    }

    private void depositBalance(String username, String password, int balance) {
        ProcessBank pb = new ProcessBank(username, password, balance);
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("hey! "+pb.username());
            System.out.println("Enter Deposit Amount: ");
            int amount = sc.nextInt();           
            int newAmount = pb.depositBalance(amount);
            menu(username,password, newAmount);
        }while(true);
        
    }

    private void withdrawBalance(String username, String password, int balance) {
        ProcessBank pb = new ProcessBank(username, password, balance);
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("hey! "+pb.username());
            System.out.println("Enter Withdraw Amount: ");
            int amount = sc.nextInt();           
            int newAmount = pb.withdrawalBalance(amount);
            menu(username,password, newAmount);
        }while(true);
    } 
}
