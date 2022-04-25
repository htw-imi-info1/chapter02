/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // The number of tickets printed by this machine.
    private int count;
    // Coins to return.
    private int oneEuro = 100;
    private int twoEuros = 200;
    private int oneCent = 1;
    private int twoCents = 2;
    private int fiveCents = 5;
    private int tenCents = 10;
    private int twentyCents = 20;
    private int fiftyCents = 50;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int ticketPrice)
    {
        price = ticketPrice;
        balance = 0;
        total = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getAmount()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    /**(For the bored) Can you make the better-ticket-machine
     * give proper change with a minimal amount of Euro coins?
     */

    public String returnChange(){
        int returnedAmount = balance;
        balance = 0;
        String ret = "";
        while(returnedAmount>0){
            if(returnedAmount>=twoEuros){
                ret = ret + "twoEuros";
                returnedAmount = returnedAmount - twoEuros;
            } else if(returnedAmount>=oneEuro){
                ret = ret + "oneEuro";
                returnedAmount = returnedAmount - oneEuro;
            } else if(returnedAmount>=fiftyCents){
                ret = ret + "fiftyCents";
                returnedAmount = returnedAmount - fiftyCents;
            } else if(returnedAmount>=twentyCents){
                ret = ret + "twentyCents";
                returnedAmount = returnedAmount - twentyCents;
            } else if(returnedAmount>=tenCents){
                ret = ret + "tenCents";
                returnedAmount = returnedAmount - tenCents;
            } else if(returnedAmount>=fiveCents){
                ret = ret + "fiveCents";
                returnedAmount = returnedAmount - fiveCents;
            } else if(returnedAmount>=twoCents){
                ret = ret + "twoCents";
                returnedAmount = returnedAmount - twoCents;
            } else {
                ret = ret + "oneCent";
                returnedAmount = returnedAmount - oneCent;
            }
        }
        System.out.println(ret);
        return ret;
    }
}
