import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {

    Scanner menuInput = new  Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap <Integer,Integer> data =new HashMap<>();

    public void getLogin() throws IOException {
        int x =1;

        do {
            try {
                data.put(221155658,5658);
                data.put(221155656,5656);
                data.put(221155688,5688);
                data.put(221154647,4647);
                data.put(221154672,4672);
                data.put(221154827,4827);
                data.put(221154652,4652);
                data.put(221154701,4701);
                data.put(221155702,5702);
                data.put(221155571,5571);
                data.put(221155017,5017);
                data.put(221155121,5121);
                data.put(221155618,5618);
                System.out.println("Welcome to the ATM project !");
                System.out.println("Enter your customer number");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your pin number: ");
                setPinNumber(menuInput.nextInt());

            } catch (Exception e) {
                System.out.println("/n" + "Invalid Charaters. Only numbers " + "/n");
                x = 2;
            }

            int cn = getCustomerNumber();
            int pn = getPinNumber();

            if (data.containsKey(cn) && data.get(cn) == pn) {
                getAccountType();
            } else
                System.out.println("/n" + "wrong customer number or pin number" + "/n");
        }while (x ==1);

    }
    public void getAccountType(){
        System.out.println("select the account you want to access");
        System.out.println("Type 1: Checking Account");
        System.out.println("Type 2: saving Account");
        System.out.println("Type 3: - Exit");

        int Selection = menuInput.nextInt();

        switch (Selection){

            case 1:
                getChecking();
                break;

            case 2:
                getSaving();
                break;

            case 3:
                System.out.println("thank you for using the ATM ! ");
                break;

            default:
                System.out.println("Invalid selection !");
        }
    }

    public void getChecking(){
        System.out.println("checking Account: ");
        System.out.println("Type 1- View Balance");
        System.out.println("Type 2- withdraw funds");
        System.out.println("Type 3- Deposit funds");
        System.out.println("Type 4- Exit");
        System.out.println("choice: ");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("checking account balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                break;

            case 3:
                getCheckingDepositInput();
                break;

            case 4:
                System.out.println("Thank you for using this ATM. ");
                break;

            default:
                System.out.println("Invalid choice !");
                getChecking();
        }
    }
    public void getSaving(){

        System.out.println("Saving Account: ");
        System.out.println("Type 1- View Balance");
        System.out.println("Type 2- withdraw funds");
        System.out.println("Type 3- Deposit funds");
        System.out.println("Type 4- Exit");
        System.out.println("choice: ");

        int selection = menuInput.nextInt();


        switch (selection) {
            case 1:
                System.out.println("checking account balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;

            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for using this ATM. ");
                break;

            default:
                System.out.println("Invalid choice !");
                getChecking();
        }

    }
}
