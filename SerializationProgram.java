package JavaProgram;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationProgram {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            fos=new FileOutputStream("D:/FILEIO/student1.txt");
            oos=new ObjectOutputStream(fos);
            Student s1=new Student();
            s1.name="Chinal";
            s1.rollNo=107;
            oos.writeObject(s1);
            System.out.println("serialization completed");
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        finally{
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
