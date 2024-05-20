import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;

        if (first > second && first > third) {
            greatest = first;
        } else if (first < second && first < third) {
            smallest = first;
        } else {
            average = first;
        }

        if (third > second && third > first) {
            greatest = third;
        } else if (third < second && first < third) {
            smallest = third;
        } else {
            average = third;
        }

        if (second > third && second > first) {
            greatest = second;
        } else if (second < first && second < third) {
            smallest = second;
        } else {
            average = second;
        }

        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}