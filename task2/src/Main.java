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

        if(first > second && first > third) {
            greatest = first;
        }
        if(second > third && second > first) {
            greatest = second;
        }
        if(third > first && third > second) {
            greatest = third;
        }

        average = (first + second + third) / 3;


        if(first < second && first < third) {
            smallest = first;
        }
        if(second < third && second < first) {
            smallest = second;
        }
        if(third < first && third < second) {
            smallest = third;
        }
        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}