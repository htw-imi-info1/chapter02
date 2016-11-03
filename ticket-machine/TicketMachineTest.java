
public class TicketMachineTest
{

    public TicketMachineTest()
    {

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
