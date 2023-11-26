import java.util.Scanner;

public class ATM {
    float Balance;
    int Pin = 5674;

    // Constructor Called
//    public ATM(float balance, int pin) {
//        this.Balance = balance;
//        this.Pin = pin;
//    }




    // This checks the pin entered by the User
    public void checkPin(){
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if(enteredPin==Pin){
            menu();
        }
        else{
            System.out.println("You Entered Wrong Pin");
        }

    }

    // Choice of  Language of User
    public void menu(){
        System.out.println("Select Your Language");
        System.out.println("1. Hindi");
        System.out.println("2. English");

        Scanner scanner= new Scanner(System.in) ;
        int option = Integer.parseInt(scanner.next());

        if(option==1 || option==2){
            operation();
        }

    }
    public void operation(){
        System.out.println("1. Check A/c Balance");
        System.out.println("2. WithDraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");


        Scanner sc= new Scanner(System.in);

        int opt = sc.nextInt();


        if(opt==1){
            checkBalance();
        }

        else if(opt==2){
            withDrawAmount();
        }

        else if(opt==3){
            DepositAmount();
        }

        else if(opt==4) {
            return;
        } else{
            System.out.println("There is Some " +
                    "Error in your selection please try again later");
            menu();
        }




    }

    private void checkBalance() {
        System.out.println(" Available Balance:"+Balance);
        menu();
    }

    private void DepositAmount() {
        System.out.println("Enter the Deposit Amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance += amount;
        System.out.println("Money Deposit Successfully " + Balance);
        menu();
    }

    private void withDrawAmount() {
        System.out.println("Enter the WithDraw Amount");
        Scanner sc = new Scanner (System.in);
        float amount = sc.nextFloat();

        if(amount>Balance){
            System.out.println("Transaction Failed /Enter" +
                    "the less Amount");
            menu();
        }
        else if(Balance-amount <1000){
            System.out.println("Please Maintain MinimumBalance");
            menu();
        }
        else{
            Balance -= amount;
            System.out.println("Money WithDrawl Successful"+"Remaining Balance "+ Balance);
        }
        menu();
    }
}


