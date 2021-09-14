import java.util.Scanner;

public class Account {
    Scanner input = new Scanner((System.in));


    public int setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        return accountNumber;
    }

    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getAccountNumber(){ return accountNumber; }
    public int getPinNumber(){ return pinNumber; }
    public double getCheckingBalance(){ return checkingBalance; }
    public double getSavingBalance(){ return savingBalance; }

    public double calcCheckingWithdraw(double amount){
        checkingBalance = checkingBalance - amount;
        return checkingBalance;
    }
    public double calcCheckingDeposit(double amount){
        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }


    public double calcSavingWithdraw(double amount){
        savingBalance = savingBalance - amount;
        return savingBalance;
    }
    public double calcSavingDeposit(double amount){
        savingBalance = savingBalance + amount;
        return savingBalance;
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + checkingBalance);
        System.out.println("Amount you want to withdraw: ");
        double amount = input.nextDouble();

        if(checkingBalance - amount >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New checking Account Balance: " + checkingBalance);
        }
        else{
            System.out.println("Balance not sufficient." + "\n");
        }
    }
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + checkingBalance);
        System.out.println("Amount you want to deposit: ");
        double amount = input.nextDouble();

        if(amount >= 0){
            calcCheckingDeposit(amount);
            System.out.println("New checking Account Balance: " + checkingBalance);
        }
        else{
            System.out.println("Balance Cannot be negative." + "\n");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + savingBalance);
        System.out.println("Amount you want to withdraw: ");
        double amount = input.nextDouble();

        if(savingBalance - amount >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + savingBalance);
        }
        else{
            System.out.println("Balance not sufficient." + "\n");
        }
    }
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + savingBalance);
        System.out.println("Amount you want to deposit: ");
        double amount = input.nextDouble();

        if(amount >= 0){
            calcCheckingDeposit(amount);
            System.out.println("New Saving Account Balance: " + savingBalance);
        }
        else{
            System.out.println("Balance Cannot be negative." + "\n");
        }
    }



    private int accountNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

}
