import java.util.Random;

public class ParkingMeter
{
    int timeLeft = 0;


    public ParkingMeter()
    {
        timeLeft = (new Random()).nextInt(100);
    }

    public boolean isExpired()
    {
       return timeLeft < 0;
    }
    public void remove(int x)
    {
        timeLeft = timeLeft - x;
    }
    public String getFine()
    {
        if(timeLeft >-60)
            return "$25";
        int fine = 25 + -10 * (timeLeft/60);
        return "$" + fine;

    }
}
