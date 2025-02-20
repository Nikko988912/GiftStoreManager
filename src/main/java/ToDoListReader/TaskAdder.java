package ToDoListReader;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class TaskAdder {
    public static void main(String[] args) {
        String fileName = Paths.get("src/main/java/ToDoListReader/tasks.txt").toString();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите новую задачу: ");
        String newTask = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName, true)) { // true - добавление в конец файла
            writer.write(newTask + "\n");
            System.out.println("Задача успешно добавлена!");
        } catch (IOException e) {
            System.out.println("Ошибка при добавлении задачи: " + e.getMessage());
        }

        scanner.close();
    }
}