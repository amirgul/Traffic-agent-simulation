public class ParkingTicket
{
    String officer = "Officer badge number";
    String car = "Parked car information";
    String fine = "Fine";

    public ParkingTicket(PoliceOfficer policeOfficer, ParkedCar parkedCar)
    {
        officer = officer + policeOfficer.getBadgeNumber();
        car = car + parkedCar.toString();
        fine = fine + parkedCar.getFine();
    }
    public String toString()
    {
        return car + " " + fine + " " + officer;
    }
}
