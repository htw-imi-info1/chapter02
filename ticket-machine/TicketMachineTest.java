
public class TicketMachineTest
{

    public TicketMachineTest()
    {

    }
    public void testEmptyMachine(){
        TicketMachine tm = new TicketMachine(200);
        tm.insertMoney(200); 
        tm.printTicket();
        System.out.println("Empty Machine returned: "+tm.emptyMachine());
        System.out.println("Total: "+tm.getTotal());
        
    }
    
    public void testEmptyMachine2(){
        TicketMachine tm = new TicketMachine(200);
        tm.insertMoney(200); 
        tm.printTicket();
        System.out.println("Empty Machine returned: "+tm.emptyMachine());
        System.out.println("Total: "+tm.getTotal());
        tm.insertMoney(200); 
        tm.printTicket();
        System.out.println("The mean should be computed correctly, that is, 160: "+tm.getMean());
    }
    
    public void testRemainingBalance(){
        TicketMachine tm = new TicketMachine(200);
        tm.insertMoney(50); 
        tm.printTicket();
        
    }
    public void testMean()
    {
        TicketMachine tm = new TicketMachine(200);
        tm.insertMoney(200); // price is now 160
        tm.printTicket();
        tm.setDiscount(0.5);
        tm.insertMoney(200); // price is now 100
        tm.printTicket();
        tm.setDiscount(0.0); // price is now 200
        tm.insertMoney(200);
        tm.printTicket();
        System.out.println("Number of tickets sold:"+ tm.getTicketCounter());
        System.out.println("Total: " + tm.getTotal());
        System.out.println("Mean of Prices: " + tm.getMean());
        
        
    }
    public void  testDiscount()
    {
        TicketMachine tm = new TicketMachine(200);
        tm.insertMoney(200);
        tm.printTicket();

        System.out.println("should get 40 back: "+tm.refundBalance());
      
        tm.setDiscount(0.5);
        tm.insertMoney(200);
        tm.printTicket();

        System.out.println("should get 100 back: "+tm.refundBalance());

        tm.setDiscount(0.2);
        tm.insertMoney(200);
        tm.printTicket();

        System.out.println("should get 40 back: "+tm.refundBalance());

    }
    
    public void  testDiscount2()
    {
        TicketMachine2 tm = new TicketMachine2(200);
        tm.insertMoney(200);
        tm.printTicket();

        System.out.println("should get 40 back: "+tm.refundBalance());
      
        tm.setDiscount(0.5);
        tm.insertMoney(200);
        tm.printTicket();

        System.out.println("should get 100 back: "+tm.refundBalance());

        tm.setDiscount(0.2);
        tm.insertMoney(200);
        tm.printTicket();

        System.out.println("should get 40 back: "+tm.refundBalance());

    }
}
