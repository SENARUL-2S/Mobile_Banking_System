package mobilebackingsystem;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import mobilebackingsystem.DialPadGUI.DialPadListener;

public class MainClass {

    double Balence = 10000;
    int pin = 12345;
    int NID =2102023;
    String Birth = "10/07/2003";

    public static void main(String[] args) {
        DialPadListener listener;
        listener = new DialPadListener() {
            @Override
            public void onCall(String number) {
                //System.out.println("String dialed in the main class: " + number);
                
                if (number.equals("*247#")) {
                //JOptionPane.showInputDialog("bKash\n1 Send Money\n2 Mobile Recharge\n3 Cash Out\n4 My bKash\n5 Payment\n6 Pay Bill\n7 Download bKash App\n8 Send Money to Non-bKash User\n9 Reset PIN");
        
                   System.out.println("bKash");
                    System.out.println("1 Send Money");
                    System.out.println("2 Mobile Recharge");
                    System.out.println("3 Cash Out");
                    System.out.println("4 My bKash");
                    System.out.println("5 Payment");
                    System.out.println("6 Pay Bill");
                    System.out.println("7 Download bKash App");
                    System.out.println("8 Send Money to Non-bKash User");
                    System.out.println("9 Reset PIN");
                    System.out.print("==>: ");
                    Scanner select = new Scanner(System.in);
                    try {
                        // Read user input
                        String input = select.nextLine();
                        
                        // Check if input is a digit
                        if (!input.matches("\\d")) {
                            throw new IllegalArgumentException("Service is not available at this moment.\nPlease try again later.");
                        }
                        
                        int n = Integer.parseInt(input);
                        Chose call = new Chose();
                        switch (n) {
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
}
                         
                    }
                    catch (Exception e) {
                        System.out.println("Service is not available at this moment.\nPlease try again later.");
                    }
                    
                    finally {
                        select.close();
                    }
                    
                } else {
                    System.out.println("Invalid try again");
                }
            }
        };

        SwingUtilities.invokeLater(() -> {
            DialPadGUI dialPad = new DialPadGUI(listener);
            dialPad.setVisible(true);
        });
    }
}
