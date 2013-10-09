public class Dogs{

    /* The list of attributes, 
    defining the state of the object.*/
    private String accountHoldersName;
    private String accountNumber;
    private double amount;
    private static final long BANK_ID = 80056322; 

    /* This is a constructor. It desribes how to create a 
    new Account object*/
    public Account(String accountHoldersName, 
        String accountNumber, 
        double amount){
    	this.accountHoldersName = accountHoldersName;
    	this.accountNumber = accountNumber;
     	this.amount = amount;
    }

    /* a class can have more than one constructor */

    /* if we still want the standard constructor, we have to explicitly define it*/
 
    /* The list of methods forming the behavior of th
    account class*/
    public void processTransfer(double amount){
    	this.amount = this.amount + amount;
    }

    public boolean isAmountPositive(){
    	return amount >= 0;
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

    public String getName(){
        return accountHoldersName;
    }

    /* This method defines how the textual representation of
    your object will look like.*/
    public String toString(){
        return "Bank Id: " + BANK_ID 
        + "\nName: "+ accountHoldersName +
        "\nAccount Number: "+ accountNumber + "\nAmount: " + amount;
    }
}