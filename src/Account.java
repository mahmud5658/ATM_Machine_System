import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {
    private int customerNumber;
    private int PinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormate = new DecimalFormat("###,##0.00'Tk.'");

    public int getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    public int getPinNumber() {
        return PinNumber;
    }
    public void setPinNumber(int pinNumber) {
        PinNumber = pinNumber;
    }
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }
    public double getSavingBalance() {
        return savingBalance;
    }
    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }
    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance = amount);
        return savingBalance;
    }
    public void getCheckingWithdrawInput() {
        System.out.println("Checking account balance: " + moneyFormate.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New checking Account balance: " + moneyFormate.format(checkingBalance));
        } else {
            System.out.println("balance cannot be Negative. " + "/n");
        }
    }
    public void getSavingWithdrawInput() {
        System.out.println("Saving account balance: " + moneyFormate.format(savingBalance));
        System.out.println("Amount you want to withdraw from saving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New saving Account balance: " + moneyFormate.format(savingBalance));
        } else {
            System.out.println("balance cannot be Negative. " + "/n");

        }
    }
    public void getCheckingDepositInput() {
        System.out.println("Checking account balance: " + moneyFormate.format(checkingBalance));
        System.out.println("Amount you want to deposite from Checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New checking Account balance: " + moneyFormate.format(checkingBalance));
        } else {
            System.out.println("balance cannot be Negative. " + "/n");
        }
    }
    public void getSavingDepositInput() {
        System.out.println("Saving account balance: " + moneyFormate.format(savingBalance));
        System.out.println("Amount you want to Deposit from saving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance + amount) >= 0) {
            calcSavingDeposit(amount);
            System.out.println("New saving Account balance: " + moneyFormate.format(savingBalance));
        } else {
            System.out.println("balance cannot be Negative. " + "/n");
        }
    }
}
