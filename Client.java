
public class Client
{
    int jobID;
    double jobDuration;

    public Client(int id, double duration)
    {
        jobID = id;
        jobDuration = duration;
    }

    public int getJobID()
    {
        return jobID;
    }

    public double getJobDuration()
    {
        return jobDuration;
    }


}