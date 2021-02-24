import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LiveRegisterDirectory
{
    LiveRegisterDirectory()
    {
        try
        {
            File file = new File("all_persons_under_25.csv");
            Scanner in = new Scanner(file);
            ArrayList<Person> list = new ArrayList<>();

            String[] temp = new String[6];
            in.useDelimiter(",");

            for (int i = 0; i < 10; i++) 
            {
                for (int j = 0; j < 6; j++)
                {
                    temp[j] = in.next();
                }
                Person p = new Person(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5]);
                list.add(p);
                in.nextLine();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args)
    {
        LiveRegisterDirectory directory = new LiveRegisterDirectory();

        View view = new View();

        view.init();
    }
}
