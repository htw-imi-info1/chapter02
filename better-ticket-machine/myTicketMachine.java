/**
 * CopyOfTicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class CopyOfTicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // The number of tickets printed by this machine.
    private int count;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public CopyOfTicketMachine(int ticketPrice)
    {
        price = ticketPrice;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
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
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The HTW Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        //give proper change
        returnChange(total, price);
        // reduce the balance to zero.
        balance = 0;
        // reduce the total to zero.
        total = 0;
        // Update the number of printed tickets.
        count++;
    }
    /**
     * Reduce price by the given amount.
     **/

    public void discount (int amount)
    {
        price = price - amount;
    }
    public void printPrice(){
        System.out.println("The price of a Ticket is " + price + " cents.");
    }
    public void getCounter() {
        if(count == 1){
            System.out.println("1 ticket has been sold.");
        } else {
            System.out.println(count + " tickets have been sold.");
        }
    }
    /**(For the bored) Can you make the better-ticket-machine
     * give proper change with a minimal amount of Euro coins?
     */
    private int oneEuro = 100;
    private int twoEuros = 200;
    private int oneCent = 1;
    private int twoCents = 2;
    private int fiveCents = 5;
    private int tenCents = 10;
    private int twentyCents = 20;
    private int fiftyCents = 50;

    public String returnChange(int x, int y){
        int returnedAmount = x - y;
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
