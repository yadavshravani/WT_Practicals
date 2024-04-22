public class Dilkehtahai {
    public static void main(String[] args) {
        int n=8;
        for (int i =0; i<n; i++)
        {
            Soach obj = new Soach();
            obj.start();
        }
    }
}
//Second class
import javax.swing.tree.TreeCellEditor;
import java.sql.SQLOutput;

public class Soach extends Thread{
    public void run()
    {
        try
        {
        System.out.println("Hi current::"+Thread.currentThread());
            System.out.println("Hi current Id::"+Thread.currentThread().getId());
            System.out.println("Hi current Name::"+Thread.currentThread().getName());
            System.out.println("Hi current Priority::"+Thread.currentThread().getPriority());
            System.out.println("Hi current ThreadGroup::"+Thread.currentThread().getThreadGroup());
    }
        catch (Exception exception)
        {
            System.out.println("Durghatna="+exception);
        }
        finally {
            System.out.println("Total:"+ Thread.activeCount());
        }
        }
}
//Third Class
public class ZindahuMai extends Soach {
    public static void main(String[] args) {
        ZindahuMai zindahuMai = new ZindahuMai();
        zindahuMai.run();
    }
}
