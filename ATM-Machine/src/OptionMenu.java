import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner optInput = new Scanner(System.in);

    HashMap<Integer, Integer> data = new HashMap<Integer,Integer>();

    public void getLogin() throws IOException{
        int x = 1;
        do{
            try{
                data.put(700960662,2002);
                data.put(950146921,2001);

                System.out.println("\nWelcome to Atm");

                System.out.print("Enter your Account Number: ");
                setAccountNumber(optInput.nextInt());

                System.out.print("Enter your Pin Number: ");
                setPinNumber(optInput.nextInt());

            } catch (Exception e){
                System.out.println("\nInvalid Characters");
                x = 2;
            }
            boolean flag = true;
            for(Map.Entry<Integer,Integer> entry : data.entrySet()) {
                if (entry.getKey() == getAccountNumber() && entry.getValue() == getPinNumber()) {
                    getAccountType();
                    flag = false;
                }
            }
            if(flag) {
                System.out.println("\nWrong Account Number or Pin Number\n");
            }
        }while (x==1);
    }

    public void getAccountType() {
        System.out.println("Select the account you want to access: ");
        System.out.println("1. Checking Account");
        System.out.println("2. Saving Account");
        System.out.println("3. Exit");
        System.out.print("Choice: ");

        selection = optInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using the Atm");
                break;
            default:
                System.out.println("Invalid Choice");
                getAccountType();
        }
    }

    public void getChecking(){
        System.out.println("CHECKING ACCOUNT");
        System.out.println("1. View Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Exit");
        System.out.print("CHOICE: ");

        selection = optInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance: " + getCheckingBalance());
                getChecking();
                break;
            case 2:
                getCheckingDepositInput();
                getChecking();
                break;
            case 3:
                getCheckingWithdrawInput();
                getChecking();
            case 4:
                System.out.println("Thank you for using the Atm");
                break;
            default:
                System.out.println("Invalid Choice");
                getChecking();
        }
    }

    public void getSaving(){
        System.out.println("SAVING ACCOUNT");
        System.out.println("1. View Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Exit");
        System.out.print("CHOICE: ");

        selection = optInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance: " + getSavingBalance());
                getSaving();
                break;
            case 2:
                getSavingDepositInput();
                getSaving();
                break;
            case 3:
                getSavingWithdrawInput();
                getSaving();
            case 4:
                System.out.println("Thank you for using the Atm");
                break;
            default:
                System.out.println("Invalid Choice");
                getSaving();
        }
    }

    int selection;


}
