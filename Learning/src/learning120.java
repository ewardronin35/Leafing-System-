/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduar
 */
public class learning120 {
    int balance;
    
    public learning120 (int initialBalance) {
    balance = initialBalance;
    
}
    
    
    public void checkBalance () {
        
        System.out.println ("Hello welcome to the bank");
        System.out.println ("Your balance is" + balance);
        
        
    }
    public void deposit (int amountDeposited) {
        balance = amountDeposited;
        
        System.out.println("You have deposited" + amountDeposited);
        
      /* Deposits code basically what you will do is having to call something a method
  
        */
    }
    
    public int withDraw (int amountWithdrawed) {
        balance = balance - amountWithdrawed;
        System.out.println ("You only just withdrawed " + amountWithdrawed);
        return amountWithdrawed;
   
    }
    @Override
        public String toString () {
        
        System.out.println("You only have" + balance + "left");
        return toString;
    }
    
    public static void main (String[]args ) {
        learning120 savings = new learning120 (4000);
        
        
        savings.checkBalance();
        
        
        savings.deposit(300);
        
        savings.checkBalance();
        
        
        savings.withDraw(200);
        
        savings.checkBalance();
        
        savings.deposit(200);
        
        savings.checkBalance();
        
        System.out.println(savings);
        
        
    }
}
