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
    private int balance = 0;
    // The total amount of money collected by this machine.
    private int total = 0;
    // number of tickets that have been issued
    private int count = 0;

    double savings = 0;
    int discountedPrice = 0;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int price)
    {
        double discount = 0.2;
        savings = price * discount;
        discountedPrice = (int)(price - savings);
        if (price < 0){
            System.out.println("please provide a positive Ticket price");
            price = 0;          
        }
        else{
            this.price = price;
        }
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
        if (amount > 0){
            balance = balance + amount;
        }else{
            System.out.println("Please insert an amount > 0");
        }
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        if(balance < discountedPrice){
            System.out.println("please insert more money first.");
            System.out.println("please insert: "+(discountedPrice-balance)+" more cents.");
        } else {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + discountedPrice + " cents.");
            System.out.println("##################");
            System.out.println();
            count++;
            // Update the total collected with the balance.
            total = total + discountedPrice;
            // Clear the balance.
            balance = balance - discountedPrice;
        }
    }

    public int refundBalance(){
        int refund = balance;
        balance = 0;
        return refund;
    }

    public static TicketMachine test(){
        TicketMachine bvg = new TicketMachine(200);
        bvg.insertMoney(400);
        bvg.printTicket();
        bvg.printTicket();
        System.out.println("Change:"+bvg.refundBalance()+" cents");
        System.out.println("Ticket count"+bvg.count);
        return bvg;
    }
}
