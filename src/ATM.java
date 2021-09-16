//Pooja would like to withdraw X $US from an ATM.
// The cash machine will only accept the transaction if X is a multiple of 5,
// and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges).
// For each successful withdrawal the bank charges 0.50 $US.
// Calculate Pooja's account balance after an attempted transaction.
class ATM {
    public static void main(String[] args)
    {
        float X, balance, charge;
        X = 255;
        balance = 2045;
        charge =(float) 0.5;
        float rembal;
        rembal = balance - X - charge;
        if (X%5==0)
            System.out.println("Remaining balance =$"+rembal);
        else System.out.println("ENTER VALID AMOUNT");
    }
}