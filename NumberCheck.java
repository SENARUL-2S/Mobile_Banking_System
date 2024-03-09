
package mobilebackingsystem;

import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

class NumberCheck extends MainClass {
	Scanner select = new Scanner(System.in);
        Calendar now = Calendar.getInstance();
	String ref;
	double fee;
	NumberCheck(double amount, long number, int n){
		if(n==3) {
			fee = (amount*.0185);
			amount = amount+fee;
		}
		if(Balence>amount)
		{
			if(n==1) {
			System.out.println("Enter Reference: ");
			ref = select.nextLine();
			
			System.out.println("Send Money.\nTo: 0"+number+"\nAmount: Tk "+amount+"\nReference: "+ref+"\nEnter Menu PIN to confirm: ");
			}
                        if(n==8) {
			System.out.println("Enter Reference: ");
			ref = select.nextLine();
			
			System.out.println("Send Money to Non-bKash User\nTo: 0"+number+"\nAmount: Tk "+amount+"\nReference: "+ref+"\nEnter Menu PIN to confirm: ");
			}
                        if(n==5) {
			System.out.print("Enter Reference: ");
			ref = select.nextLine();
			
			System.out.print("Payment.\nTo: 0"+number+"\nAmount: Tk "+amount+"\nReference: "+ref+"\nEnter Menu PIN to confirm: ");
			}
			if(n==3) {
				System.out.print("Cash Out\nTo: 0"+number+"\nAmount: Tk "+amount+"\nEnter Menu PIN to confirm: ");
			}
			int Npin = select.nextInt();
			if(Npin==pin)
			{
				Balence = Balence-amount;
				if(n==1) {
				System.out.println("\n\nSend Money Tk "+amount+ " to 0" +number+"\nsuccessful. Reference "+ref+". Fee TK 0.0. Balance\nTk "+Balence+". TrxID A6H2B4NS"+" "+(now.get(Calendar.DATE)) + "/"
                               + (now.get(Calendar.MONTH)+1) + "/" + now.get(Calendar.YEAR) + " at "+ now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"+ now.get(Calendar.SECOND));
				}
                                else if(n==8) {
				System.out.println("\n\nSend Money to Non-bKash User Tk "+amount+ " to 0" +number+"\nsuccessful. Reference "+ref+". Fee TK 0.0. Balance\nTk "+Balence+". TrxID A6H2B4NS"+" "+(now.get(Calendar.DATE)) + "/"
                               + (now.get(Calendar.MONTH)+1) + "/" + now.get(Calendar.YEAR) + " at "+ now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"+ now.get(Calendar.SECOND));
				}
                                else if(n==5) {
				System.out.println("\n\nPayment. Tk "+amount+ " to 0" +number+"\nsuccessful. Reference: "+ref+" Balance\nTk "+Balence+". TrxID A6H2B4NS"+" at "+(now.get(Calendar.DATE)) + "/"
                               + (now.get(Calendar.MONTH)+1) + "/" + now.get(Calendar.YEAR) + " at "+ now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"+ now.get(Calendar.SECOND));
				}
				else {
					System.out.println("\n\nCash Out Tk "+amount+ " to 0" +number+"\nsuccessful"+". Fee TK "+fee+". Balance\nTk "+Balence+". TrxID A6H2B4NS"+"  "+(now.get(Calendar.DATE)) + "/"
                               + (now.get(Calendar.MONTH)+1) + "/" + now.get(Calendar.YEAR) + " at "+ now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"+ now.get(Calendar.SECOND));
			}
			}
			else 
			{
				System.out.println("Pin Number is Wrong\n\n");
			}
			}
		else
		{
			System.out.println("Insuffice Balence\n\n");
		}
			
	}
	
	 NumberCheck(long number, int n) {
		if(number>=1300000000)
		{
			System.out.printf("Enter Amount: ");		
			double amount = select.nextDouble();
			NumberCheck obj = new NumberCheck(amount ,number,n);
		}
		else
		{
			System.out.println("\nThis bKash Number is Wrong!\n\n");
		}
		
	} 

    
	
}