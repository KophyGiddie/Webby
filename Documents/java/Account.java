public class Account{

    private String accountHoldersName;
    private String accountNumber;
    private double amount;
    private String history;
    private static final long BANK_ID = 80056322;
    private static int numberOfAccounts = 0;
    protected double interestRate = 0;

    public Account(String accountHoldersName, String accountNumber, double amount){
        this.accountHoldersName = accountHoldersName;
        this.accountNumber = accountNumber;
        this.amount = amount;
        history ="";
        numberOfAccounts++; 
    }


     public Account(String accountHoldersName, 
        String accountNumber){
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        amount = 0.0;
        history = "";
        numberOfAccounts++;
    }

    public void processTransfer(double amount){
        if(!isAmountPositive() && amount < 0){
            updateHistory("Transaction could not be completed.");
        }else{
            this.amount = this.amount + amount;
            updateHistory("Amount: "+amount+" was processed on your"
                +" account. New balance is: "+this.amount);
        }    	
    }

    private void updateHistory(String entry){
        history = history + "\n" + entry;
    }

    public boolean isAmountPositive(){
    	return amount >= 0;
    }

    public String toString(){
        return "Bank Id: " + BANK_ID 
        + "\nName: "+ accountHoldersName +
        "\nAccount Number: "+ accountNumber + "\nAmount: " + amount;
    }


    public String getAccountHoldersName(){
        return accountHoldersName;
    }

    public static long getBankId(){
        return BANK_ID;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getAmount(){
        return amount;
    }

    public String getHistory(){
        return history;
    }

    public static int getNumberOfAccounts(){
         return numberOfAccounts;
    }
 
}