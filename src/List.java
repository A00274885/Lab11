import java.util.*;

public class List
{
    List()
    {
        boolean inIteration = true;
        int listPosition = 0;
        Scanner input = new Scanner(System.in);
        LinkedList<Double> list = new LinkedList<Double>();

        list.add(2.3);
        list.add(4.1);
        list.add(5.4);
        list.add(8.4);
        list.add(9.2);

    while(inIteration)
    {
        System.out.println("1. Next");
        System.out.println("2. Previous");
        System.out.println("3. close");

        int choice = input.nextInt();

        switch (choice)
        {
            case 1:
                if(list.listIterator(listPosition).hasNext())
                {
                    System.out.println(list.listIterator(listPosition).next());
                    listPosition++;
                }
                else
                    System.out.println("End of the list");
                break;
            case 2:
                if(list.listIterator(listPosition).hasPrevious())
                {
                    System.out.println(list.listIterator(listPosition).previous());
                    listPosition--;
                }
                else
                    System.out.println("You are at the start of the list");
                break;
            case 3:
                inIteration = false;
                break;
        }

    }

    }

    public static void main(String[] args)
    {
        List list = new List();
    }
}

