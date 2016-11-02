
public class TicketMachineTest
{

    public TicketMachineTest()
    {

    }

    public void  testDiscount()
    {
        TicketMachine tm = new TicketMachine(200);
        tm.insertMoney(300);
        tm.printTicket();

        System.out.println("should get 140 back"+tm.refundBalance());
      
        tm.setDiscount(0.5);
        tm.insertMoney(300);
        tm.printTicket();

        System.out.println("should get 200 back"+tm.refundBalance());

    }
}
