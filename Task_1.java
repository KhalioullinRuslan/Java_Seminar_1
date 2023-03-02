// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.print("Ваше имя: ");
        Scanner in = new Scanner(System.in, "Cp866");
        String name = in.nextLine();
        System.out.println("Привет, " + name + "!");
        in.close();
    }
}