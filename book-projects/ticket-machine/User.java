public class User
{

    public void useTicketMachine(){

        TicketMachine ticketMa1 = new TicketMachine(320);
        // example for actual parameter: 400
        ticketMa1.insertMoney(400);
        int myMoney = 400;
        // another example for an actual parameter: myMoney
        ticketMa1.insertMoney(myMoney);

    }

    public void showSomeProblems(){
        TicketMachine ticketMa1 = new TicketMachine(320);
        ticketMa1.issueTicket();
        ticketMa1.getBalance();
        // returned int 0
    }
}
