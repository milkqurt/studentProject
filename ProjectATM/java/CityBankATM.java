package ProjectATM.java;

import java.util.Scanner;

public class CityBankATM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter card number");
        String accountNumber = in.next();
        System.out.println("enter pincode");
        String pinCode = in.next();
       for (int i = 0;i<Database.allAccounts.length;i++){
           if ("KZC".equals(Database.allAccounts[i].getAccountNumber().substring(0, 3)) && Database.allAccounts[i].getPinCode().equals(pinCode)){
               System.out.println("PRESS [1] TO CASH WITHDRAWAL "+"\n"

                       + "PRESS [2] TO VIEW BALANCE " + "\n"

                       + "PRESS [3] TO CHANGE PIN CODE " + "\n"

                       + "PRESS [4] TO CASH IN ACCOUNT " + "\n"

                       + "PRESS [5] TO VIEW ACCOUNT DATA " + "\n"

                       + "PRESS [6] TO EXIT");
               int a = in.nextInt();
                   if (a == 1) {
                       System.out.println("PRESS TO CASH WITHDRAWL");
                       System.out.println("CITY BANK");
                       int b = in.nextInt();
                       System.out.println(Database.allAccounts[i].totalBalance() - b);
                       System.out.println("To continue go back to the menu");
                   }
               if(a==2){
                   System.out.println("PRESS TO VIEW BALANCE");
                   System.out.println(Database.allAccounts[i].totalBalance());
                   System.out.println("To continue go back to the menu");
               }
               if (a==3){
                   System.out.println("PRESS TO CHANGE PIN CODE");
                   String pinCodde = in.next();
                   Database.allAccounts[i].setPinCode(pinCodde);
                   System.out.println("To continue go back to the menu");
               }
               if(a==4){
                   System.out.println("PRESS TO CASH IN ACCOUNT");
                   Integer balancee = in.nextInt();
                   System.out.println(Database.allAccounts[i].totalBalance()+balancee);
                   System.out.println("To continue go back to the menu");
               }
               if (a==5){
                   System.out.println("PRESS TO VIEW ACCOUNT DATA");
                   System.out.println(Database.allAccounts[i].accountData());
                   System.out.println("To continue go back to the menu");
               }
               if (a==6){
                   System.out.println("YOU WENT OUT" + "\n" + "To continue go back to the menu");
                   break;
               }
           }
       }
       for (int i = 0;i<Database.allAccounts.length;i++){
          if ("KZN".equals(Database.allAccounts[i].getAccountNumber().substring(0, 3)) && Database.allAccounts[i].getPinCode().equals(pinCode)){
               System.out.println(" PRESS [1] TO CASH WITHDRAWAL"+"\n"
                      + "PRESS [2] TO VIEW BALANCE"+"\n"
                      + "PRESS [3] TO EXIT");
               int c = in.nextInt();
               if (c==1){
                   System.out.println("PRESS TO CASH WITHDRAWAL");
                   System.out.println("NATIONAL BANK");
                   int balancee2 = in.nextInt();
                   int com = 200;
                   System.out.println(Database.allAccounts[i].totalBalance()-balancee2-com);
                   System.out.println("To continue go back to the menu");
               }
               if (c==2){
                   System.out.println("PRESS [2] TO VIEW BALANCE");
                   System.out.println(Database.allAccounts[i].totalBalance());
                   System.out.println("To continue go back to the menu");
               }         if (c==3){
                System.out.println("YOU WENT OUT" + "\n" + "To continue go back to the menu");
              }
          }
      }
    }
}