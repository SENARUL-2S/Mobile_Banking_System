package mobilebackingsystem;

import java.util.Scanner;
import javax.swing.JOptionPane;

class Chose extends MainClass {

    Scanner select = new Scanner(System.in);

    void SendMoney() {
        System.out.println("Enter Receiver bKash Account NO: ");
        long number = select.nextLong();
        NumberCheck obj = new NumberCheck(number, 1);
    }

    void Payment() {
        System.out.print("Enter Receiver bKash Account NO: ");
        long number = select.nextLong();
        NumberCheck obj = new NumberCheck(number, 5);
    }

    void MobileRechare() {
        System.out.println("\n1. Robi\n2. Airtel\n3. Bangalink\n4. GrameenPhone\n5. Teletalk");
        //System.out.print("==>: ");
        int n = select.nextInt();
        switch (n) {
            case 1: {
                System.out.print("Enter Robi Mobile NO: ");
                long robi = select.nextInt();
                if (robi >= 1800000000 && robi <= 1899999999) {
                    Rechargeamount("Robi", robi);
                } else {
                    System.out.println("The Robi Mobile NO. is invalid!");
                }
                break;
            }
            case 2: {
                System.out.print("Enter Airtel Mobile No: ");
                long airtel = select.nextInt();
                if (airtel >= 1600000000 && airtel <= 1699999999) {
                    Rechargeamount("airtel", airtel);
                } else {
                    System.out.println("The Airtel Mobile NO. is invalid!");
                }
                break;
            }
            case 3: {
                System.out.print("Enter Bangalink Mobile No: ");
                long banglalink = select.nextInt();
                if (banglalink >= 1900000000 && banglalink <= 1999999999) {
                    Rechargeamount("Banglalink", banglalink);
                } else {
                    System.out.println("The Banglalink Mobile NO. is invalid!");
                }
                break;
            }
            case 4: {
                System.out.print("Enter GrameenPhone Mobile No: ");
                long grameenphone = select.nextInt();
                if (grameenphone >= 1700000000 && grameenphone <= 1799999999) {
                    Rechargeamount("GrameenPhone", grameenphone);
                } else {
                    System.out.println("The GrameenPhone Mobile NO. is invalid!");
                }
                break;
            }
            case 5: {
                System.out.print("Enter Teletalk Mobile No: ");
                long teletalk = select.nextInt();
                if (teletalk >= 1500000000 && teletalk <= 1599999999) {
                    Rechargeamount("Teletalk", teletalk);
                } else {
                    System.out.println("The Teletalk Mobile NO. is invalid!");
                }
                break;
            }
        }
    }

    void Rechargeamount(String sim, long number) {
        System.out.print("Enter Recharge Amount: ");
        long amount = select.nextLong();
        if (Balence > amount) {
            System.out.print("\nMobile Recharge\nTo: 0" + number + "\nAmount: Tk " + amount + "\nEnter Menu PIN to Confirm: ");
            int Npin = select.nextInt();
            if (Npin == pin) {
                Balence = Balence - amount;
                System.out.println("\nYour bKash Mobile Recharge request of\nTk " + amount + ".00 for 0" + number + " was successful");
            }
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    void CashOut() {
        System.out.print("Cash out charge 1.85%\nEnter bKash Agent No: ");
        long number = select.nextLong();
        NumberCheck obj = new NumberCheck(number, 3);
    }

    void MybKash() {
        System.out.println("1. Cheek Balance\n2. Change Pin");
        //System.out.print("==>: ");
        int n = select.nextInt();
        switch (n) {
            case 1: {
                System.out.print("Enter Menu Pin: ");
                int npin = select.nextInt();
                if (npin == pin) {
                    System.out.println("\nYour current bKash Account\nbalance is Tk " + Balence);
                } else {
                    System.out.println("Pin Number is Wrong");
                }
                break;
            }
            case 2: {
                System.out.print("Enter Old Pin: ");
                int oldpin = select.nextInt();
                if (oldpin == pin) {
                    System.out.print("Enter New pin: ");
                    int newpin = select.nextInt();
                    pin = newpin;
                    System.out.println("Your Pin Changed successfully.");
                } else {
                    System.out.println("Your Old pin is wrong!");
                }
                break;
            }
        }
    }

    void Download_bKash_App() {
        System.out.println("bKash\n1. Get up to 125TK bonus & exclusive \noffers on bKash App! Download now!\n0. Main Menu");
       // System.out.print("==>: ");
        int n = select.nextInt();
       // Chose call2 = new Chose();
        switch (n) {
            case 1: {
                System.out.print("Get the app now: https://bka.sh/aoussd ");
               
               
                break;
            }
            case 0: {/*
                          int q = select.nextInt();
                        Chose call = new Chose();
                        switch (q) {
                            case 1 -> {
                                call.SendMoney();
                            }
                            case 2 -> {
                                call.MobileRechare();
                            }
                            case 3 -> {
                                call.CashOut();
                            }
                            case 4 -> {
                                call.MybKash();
                            }
                            case 5 -> {
                                call.Payment();
                            }
                            case 7 -> {
                                call.Download_bKash_App();
                                
                            }
                             case 8 -> {
                                call.Send_Money_to_Non_bKash_User();
                            }
                            case 9 -> {
                                call.ResetPIN();
                            }
                            break;*/
//}
               //call2.onCall(number);
              System.out.println("bKash");
                System.out.println("1 Send Money\n2 Mobile Recharge\n3 Cash Out\n4 My bKash\n5 Payment\n6 Pay Bill\n7 Download bKash App\n8 Send Money to Non-bKash User\n9 Reset PIN");
               // System.out.println("==>: ");
                }

            }


    }
    void Send_Money_to_Non_bKash_User(){
        System.out.println("Enter Receiver Number: ");
        long number = select.nextLong();
        NumberCheck obj = new NumberCheck(number, 8);
    }
      void ResetPIN() {
        System.out.println("Enter your bKash registered NID/Passport/Driving License Number:");
        //System.out.print("==>: ");
        int n = select.nextInt();
         select.nextLine();
         
        if(n==NID){
          System.out.print("Enter the 4 digits of your Birth Year\n(YYYY):");
         String p = select.nextLine();
           if(p.equals(Birth)){
               System.out.println("Select a service from last 10\ntransaction in 30 days:");
               System.out.println("1 Send Money\n2 Mobile Recharge\n3 Cash Out\n4 My bKash\n5 Payment\n6 Pay Bill\n7 No Transaction" );
                //System.out.print("==>: ");
                int m = select.nextInt();
                        Chose call = new Chose();
                        switch (m) {
                            case 1 -> {
                                call.SendMoney();
                            }
                            case 2 -> {
                                call.MobileRechare();
                            }
                            case 3 -> {
                                call.CashOut();
                            }
                            case 4 -> {
                                call.MybKash();
                            }
                            case 5 -> {
                                call.Payment();
                            }
                            case 6 -> {
                                call.Payment();
                            }
                            case 7 -> {
                                System.out.println("Thank you for initiating your PIN\n reset request! Please wait for a\n confirmation SMS for further details.");
                            }
                    }
           } 
        }
        else 
            System.out.println("Incorrect NID Number");
    

}}