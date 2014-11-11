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
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // how many tickets have been issued
    private int ticketCount;
    // the discount 
    private double discount = 0.2;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost,double newDiscount)
    {
        if (cost > 0){
            price = cost;
        }
        else{
            price = 260; // einzelticket bvg als sinnvoller default
        }
        balance = 0;
        total = 0;
        ticketCount = 0;
        discount = newDiscount;
    }

    public void setDiscount(double newDiscount){
        discount = newDiscount;
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
        balance = balance + amount;
    }

    /**
     * return remaining balance.
     */
    public int refundBalance(){
        int balanceToReturn = balance;
        balance = 0;
        return balanceToReturn;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        int price = getDiscountedPrice();
        if (balance >= price){
            issueTicket(price);
        }
        else {
            printErrorMessage();
        }
    }

    public int getDiscountedPrice(){
        int saving = (int)(price * discount);     
        int discountedPrice = price - saving;
        return discountedPrice;
    }

    public void issueTicket(int price){

        ticketCount = ticketCount + 1;

        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("# Ticket no " + ticketCount );
        System.out.println("##################");
        System.out.println();
        // Update the total collected with the balance.
        total = total + price;
        // Clear the balance.
        balance = balance - price;
    }

    public void printErrorMessage(){
        System.out.println("Es ist nicht genug Geld eingeworfen worden");
        System.out.println("Balance: "+balance);
    }
}
