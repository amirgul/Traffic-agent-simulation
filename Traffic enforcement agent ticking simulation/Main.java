import java.util.ArrayList;
import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<ParkingTicket> tickets = new ArrayList<ParkingTicket>();
        ParkedCar[] street = new ParkedCar[20];
        for(int i = 0; i<20 ; i++)
            street[i] = null;
        Random x = new Random();
        for(int hour = 0; hour <24; hour++)
        {
            PoliceOfficer pol = null;
            for(int minute = 0; minute < 60; minute = minute+5)
            {
                if(x.nextInt(100)>= 95)
                    pol = new PoliceOfficer();
                else
                    pol = null;
                for(int i= 0 ;i<20 ; i++)
                {
                    int dice = x.nextInt(100);
                    if (street[i] == null)
                    {

                        if (dice >= 80)
                            street[i] = new ParkedCar();

                    } else {
                        if (dice >= 91)
                            street[i] = null;
                        else
                        {
                            street[i].adjustMeter(5);
                            if(pol != null)
                            {
                                if(street[i]. expiredMeter())
                                    tickets.add(pol.issueTicket(street[i]));
                            }
                        }

                    }
                }
            }
        }
        System.out.println("Total number of parking tickets generated: " + tickets.size());
        System.out.println("------------------------------------------------------");
        for(Object ticket: tickets)
            System.out.println(ticket);


    }
}
