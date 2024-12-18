
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student("John", 22, 4.6);

        try(FileOutputStream fileOutputStream = new FileOutputStream("student.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(student);
                System.out.println("Объект сериализован");
        }

        try(FileInputStream fileInputStream = new FileInputStream("student.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            student = (Student)objectInputStream.readObject();
            System.out.println("Объект десериализован");
        }

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGPA());

    }
}