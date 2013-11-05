/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price = 0;
    // The amount of money entered by a customer so far.
    private int balance;
    // The sum of money for all tickets issued
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int price)
    {
        if (price < 0)
            System.out.println("needs a positive price");
        else
            this.price = price;
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
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        if (amount > 0)
          balance = balance + amount;
        else
          System.out.println("Bitte geben Sie einen positiven Betrag ein");
    }

    /**
     * refund the balance (Wechselgeld)
     * to be called after issuing a ticket.
     */
    public int refundBalance(){
        int refund = balance;
        balance = 0;
        return refund;
    }
    
    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        if (balance < price){
            System.out.println("Es wurde nicht genug Geld eingeworfen");
            return;
        }
        
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + price;
        // Clear the balance.
        balance = balance - price;
    }
}
