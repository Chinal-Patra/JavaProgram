package JavaProgram;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationProgram {
    public static void main(String[] args) {
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try {
            fis=new FileInputStream("D:/FILEIO/student1.txt");
            ois=new ObjectInputStream(ois);
            Student s1=(Student)ois.readObject();
            System.out.println(s1.name);
            System.out.println(s1.rollNo);
        } catch (IOException | ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        finally{
            try {
                fis.close();
                ois.close();
            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
