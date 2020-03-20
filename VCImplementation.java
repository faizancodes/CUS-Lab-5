import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class VCImplementation
{
    public static void main(String[] args)
    {
        String role = "";
        ArrayList<Client> clients = new ArrayList<Client>();

        while (!role.equals("D"))
        {
            Scanner in = new Scanner(System.in);

            System.out.print("\nA = Client\nB = Vehicle Owner\nC = Vehicular Cloud Manager\nD = Exit\nSelect Role: ");
            role = in.nextLine();
            
            if (role.equals("A"))
            {
                in = new Scanner(System.in);
                System.out.print("\nA = Submit a job\nB = Exit\nSelect: ");
                
                String choice = in.nextLine();
                System.out.println(choice);

                if (choice.equals("A"))
                {
                    in = new Scanner(System.in);
                    System.out.print("\nEnter Job ID: ");
                    int id = in.nextInt();
                    
                    in = new Scanner(System.in);
                    System.out.print("Enter Job Duration: ");
                    double duration = in.nextDouble();

                    Client client = new Client(id, duration);
                    
                    clients.add(client);

                    System.out.println(id);
                    System.out.println(duration);

                }
                
            }

            else if (role.equals("B"))
            {
                in = new Scanner(System.in);
                System.out.print("\nEnter your Vehicle ID: ");
                int choice = in.nextInt();

                in = new Scanner(System.in);
                System.out.print("Enter the residency time for your vehicle: ");
                double duration = in.nextDouble();

                System.out.println(choice);
                System.out.println(duration);
            }

            else if (role.equals("C"))
            {

            }

            else 
            {

            }

        }

        
    

    }
}