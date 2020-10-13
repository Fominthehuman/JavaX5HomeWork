package HomeWork2;

import java.util.Scanner;

public class Main {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main(); //создание экземпляра и помещение ссылки на экземпляр в переменную
        main.startFirstTask();  //теперь через main есть доступ к методу

    }

    public void startFirstTask() {
        //первое задание
        System.out.println("1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.\n" +
                "   Введите число:");
        int number = in.nextInt();
        System.out.println("   Последняя цифра: " + number % 10);

        startSecondTask();
    }

    public void startSecondTask() {
        //второе задание
        System.out.println("\n2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа\n" +
                "   Введите число:");
        int number = in.nextInt();
        int sum = 0;
        int numblen = 0;
        // другой способ нахождения длины числа: int numblen = ((number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5)));
        while (number > 0) {
            sum += number % 10;
            number /= 10;
            numblen++;
        }
        System.out.println("   Длина числа: " + numblen);
        System.out.println("   Сумма цифр: " + sum);

        startThirdTask();
    }

    public void startThirdTask() {
        //третье задание
        System.out.println("\n3. Ввести число N в консоли. Если >0, то вывести N+1, иначе N\n" +
                "   Введите число:");
        int n = in.nextInt();
        if (n > 0) {
            System.out.println("   N+1: " + (n + 1));
        } else {
            System.out.println("   N: " + (n));
        }

        startFourthTask();
    }

    public void startFourthTask() {
        //четвертое задание
        System.out.println("\n4. Ввести число N в консоли. Если >0, то вывести N+1. Если <0, то вывести N-1. Если =0, то вывести N=10.\n" +
                "   Введите число:");
        int n = in.nextInt();
        if (n > 0) {
            System.out.println("   N+1: " + (n + 1));
        } else if (n < 0) {
            System.out.println("   N-2: " + (n - 2));
        } else {
            n = 10;
            System.out.println("   N=10: " + (n));
        }

        startFifthTask();
    }

    public void startFifthTask() {
        //пятое задание
        System.out.println("\n5. Ввести 3 числа.\n");
        int max;
        int[] array = new int[3];
        max = array[0];

        for (int i = 0; i < 3; i++) {
            System.out.println("   Введите число " + (i + 1) + ":");
            array[i] = in.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("   Наибольшее число: " + max);

        startSixthTask();
    }

    public void startSixthTask() {
        //шестое задание
        System.out.println("\n6. Ввести целое число.\n" +
                "   Введите число:");
        int number = in.nextInt();

        if (number == 0) {
            System.out.println("   Введенное число = 0");
            startSeventhTask();
        }

        if ((number % 2) == 0) {
            System.out.print("\n   Число " + number + " четное ");
        } else {
            System.out.print("\n   Число " + number + " нечетное ");
        }
        if (number > 0) {
            System.out.print("и положительное");
        } else {
            System.out.print("и отрицательное");
        }

        startSeventhTask();
    }

    public void startSeventhTask() {
        //седьмое задание
        System.out.println("\n7. Выберете город для звонка.\n" +
                "   Варианты: Москва(905)-4.15руб/мин, Ростов(194)-1.98руб/мин, Краснодар(491)-2.69руб/мин, Киров(800)-5руб/мин.\n" +
                "   Введите код города:");
        int code = in.nextInt();
        System.out.println("Введите длительность звонка: ");
        double minutes = in.nextInt();
        double cost = 0;
        switch (code) {
            case 905:
                System.out.println("Стоимость " + minutes + " минут звонка в Москву: " + (cost = 4.15 * minutes) + " рублей");
                break;
            case 194:
                System.out.println("Стоимость " + minutes + " минут звонка в Ростов: " + (cost = 1.98 * minutes) + " рублей");
                break;
            case 491:
                System.out.println("Стоимость " + minutes + " минут звонка в Краснодар: " + (cost = 2.69 * minutes) + " рублей");
                break;
            case 800:
                System.out.println("Стоимость " + minutes + " минут звонка в Киров: " + (cost = 5 * minutes) + " рублей");
                break;
            default:
                System.out.println("Код города не найден, повторите ввод");
                startSeventhTask();
        }

        startEighthTask();
    }

    public void startEighthTask() {
        //восьмое задание
        System.out.println("\n8. Дан массив: ");
        int[] array = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nРазмер массива: " + array.length);
        int arrayLength = array.length;

        int max = 0;
        int sum = 0;
        int plusElements = 0;
        int sumMinus = 0;
        float average = 0;
        int avj = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < 0) {
                avj++;
                average += array[i];
            }
            if (array[i] > 0) {
                sum += array[i];
                plusElements++;
            }
            int sMj = array[i];
            sMj = sMj % 2;
            if (sMj == 0 && array[i] < 0) {
                sumMinus += array[i];
            }

        }

        average /= avj;

        System.out.println("Максимальное число в массиве: " + max);
        System.out.println("Сумма положительных чисел в массиве: " + sum);
        System.out.println("Количество положительных чисел в массиве: " + plusElements);
        System.out.println("Сумма четных отрицательных чисел в массиве: " + sumMinus);
        System.out.println("Среднее арифметическое отрицательных чисел: " + average);

        startNinthTask();
    }

    public void startNinthTask() {
        //девятое задание
        System.out.println("\n9. Дан массив: ");
        int[] array1 = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\nРазмер массива: " + array1.length);
        int array1Length = array1.length;

        int[] array2 = new int[array1Length];
        for (int i = array1Length - 1, j = 0; i > -1; i--, j++) { // изначально было i>0; i--, но при этом не записывалось последнее 15
            array2[j] = array1[i];
            //System.out.println(ninth2[j]);
        }

        System.out.println("\nЭлементы массива в обратном порядке: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        startFinalTask();
    }

    public void startFinalTask() {
        //десятое задание
        System.out.println("\n\n10. Дан массив: ");
        int[] array = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nРазмер массива: " + array.length);
        int arrayLength = array.length - 1;

        int swaps = 0;
        for (int i = arrayLength; i >= 0; i--) {
            if (array[i] == 0) {
                array[i] = array[arrayLength - swaps];
                array[arrayLength - swaps] = 0;
                swaps++;
            }
        }

        System.out.println("\nПеремещаем нули в конец массива: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

