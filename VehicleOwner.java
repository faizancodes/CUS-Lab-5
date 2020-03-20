
public class VehicleOwner
{

    int vehicleID;
    double residencyTime;

    public VehicleOwner(int id, double time)
    {
        vehicleID = id;
        residencyTime = time;
    }

    public int getVehicleID()
    {
        return vehicleID;
    }

    public double getResidencyTime()
    {
        return residencyTime;
    }


}