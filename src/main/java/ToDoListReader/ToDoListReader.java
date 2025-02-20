package ToDoListReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class ToDoListReader {
    public static void main(String[] args) {
        String fileName = Paths.get("src/main/java/ToDoListReader/tasks.txt").toString(); // Имя файла

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String task;
            System.out.println("Список задач:");
            while ((task = reader.readLine()) != null) {
                System.out.println("- " + task);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}