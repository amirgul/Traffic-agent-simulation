import java.util.Random;

public class PoliceOfficer
{
    private int badgeNumber;
    public PoliceOfficer()
    {
        badgeNumber = (new Random().nextInt(20));
    }
    public int getBadgeNumber()
    {
        return badgeNumber;

    }
    public ParkingTicket issueTicket(ParkedCar parkedCar)
    {
        return new ParkingTicket(this, parkedCar);
    }
}
