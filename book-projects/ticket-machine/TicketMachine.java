public class TicketMachine
{
    private int price;
    private int balance;
    private int total;

    public TicketMachine(int ticketPrice)
    {
        if(ticketPrice >= 0){
            price = ticketPrice;
        } else {
            price = 320; // Assignment statement
        }
        balance = 0;
        total = 0;
    }

    public int getPrice()
    {
        return price;
    }

    public int getBalance()
    {
        return balance;
    }

    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    public void issueTicket()
    {

        printTicket();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = balance-price;
    }

    private void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The HTW Berlin Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();
    }

    public int refundBalance(){

        int refund = balance;
        balance = 0;
        return refund;
    }
}
