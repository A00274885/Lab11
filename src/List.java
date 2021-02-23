import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;

public class List
{
    List()
    {
        LinkedList<Double> list = new LinkedList<Double>();

        list.add(2.3);
        list.add(4.1);
        list.add(5.4);
        list.add(8.4);
        list.add(9.2);
        Iterator<Double> it = list.iterator();

    while(it.hasNext())
    {
        System.out.println(it.next());
    }

    }

    public static void main(String[] args)
    {
    List list = new List();
    }
}

