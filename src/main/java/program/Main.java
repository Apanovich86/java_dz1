package program;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Задание 1
//        Выведите на экран надпись "Your time is limited, so
//        don’t waste it living someone else’s life" Steve Jobs на разных
//        строках. Пример вывода:
//“Your time is limited,
//        so don’t waste it
//        living someone else’s life”
//        Steve Jobs

//        String text= " \"Your time is limited,\n"+
//                       "\tso don’t waste it\n"+
//                        "\t\tliving someone else’s life\"\n"+
//                              "\t\t\tSteve Jobs";
//        System.out.println(text);

//        Задание 2
//        Пользователь вводит с клавиатуры два числа. Первое
//        число — это значение, второе число процент, который
//        необходимо посчитать. Например, мы ввели с клавиатуры
//        50 и 10. Требуется вывести на экран 10 процентов от 50.
//        Результат: 5

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введіть число: ");
//        int num = in.nextInt();
//        System.out.print("Введіть процент: ");
//        int percent = in.nextInt();
//        System.out.printf("Результат: %d \n", num*percent/100);
//        in.close();

//        Задание 3
//        Пользователь вводит с клавиатуры три цифры. Необходимо создать число, содержащее эти цифры. Например,
//                если с клавиатуры введено 7, 3, 8, тогда нужно сформировать число 738

//                Scanner in = new Scanner(System.in);
//        System.out.print("Введіть перше число: ");
//        int num1 = in.nextInt();
//        System.out.print("Введіть друге число: ");
//        int num2 = in.nextInt();
//        System.out.print("Введіть третє число: ");
//        int num3 = in.nextInt();
//        System.out.printf("Результат: %d%d%d \n", num1,num2,num3);
//        in.close();

//        Задание 4
//        Пользователь вводит шестизначное число. Необходимо
//        поменять в этом числе первую и шестую цифры, а также
//        вторую и пятую цифры.
//        Например, 723895 должно превратиться в 593827.
//        Если пользователь ввел не шестизначное число требуется вывести сообщение об ошибке.

//        int a, fist, two, five, six, osn;
//        System.out.print("Введіть 6-значне число:");
//        Scanner scanner = new Scanner(System.in);
//        a = scanner.nextInt();
//        if (a % 1000000 == a) {
//            six = a % 10;
//            five = (a % 100) / 10;
//            fist = (a % 1000000) / 100000;
//            two = (a % 100000) / 10000;
//            osn = (a % 10000) / 100;
//            System.out.println("Результат: " + six + five + osn + two + fist);
//        }else System.out.println("Введено не 6-значне число!");

//        Задание 5
//        Пользователь вводит с клавиатуры номер месяца (от
//        1 до 12). В зависимости от полученного номера месяца
//        программа выводит на экран надпись: Winter (если введено
//                значение 1,2 или 12), Spring (если введено значение от 3
//                до 5), Summer (если введено значение от 6 до 8), Autumn
//                (если введено значение от 9 до 11).
//                Если пользователь ввел значение не в диапазоне от 1
//        до 12 требуется вывести сообщение об ошибке.

//        int a;
//        System.out.print("Введіть номер місяця:");
//        Scanner scanner = new Scanner(System.in);
//        a = scanner.nextInt();
//        if(a==1||a==2||a==12){
//            System.out.println("Winter");
//        }
//        else if(a==3||a==4||a==5){
//            System.out.println("Spring");
//        }
//        else if(a==6||a==7||a==8){
//            System.out.println("Summer");
//        }
//        else if(a==9||a==10||a==11){
//            System.out.println("Autumn");
//        }
//        else if(a<1||a>12){
//            System.out.println("Помилка: ви ввели значення не в діапазоні від 1 до 12");
//        }

//        Задание 6
//        Пользователь вводит с клавиатуры количество метров. В зависимости от выбора пользователя программа
//        переводит метры в мили, дюймы или ярды.

//        int count;
//        int choice;
//        System.out.print("Введіть кількість метрів:");
//        Scanner scanner = new Scanner(System.in);
//        count = scanner.nextInt();
//        System.out.print("Виберіть одиницю вимірювання, в яку перевести: 1 - милі, 2 - дюйми, 3 - ярди: ");
//        choice = scanner.nextInt();
//        switch (choice){
//            case 1:
//                System.out.print(count*0.00062);
//                break;
//            case 2:
//                System.out.print(count*39.37);
//                break;
//            case 3:
//                System.out.print(count*1.09);
//                break;
//        }

//        Задание 7
//        Пользователь вводит с клавиатуры два числа. Нужно
//        показать все нечетные числа в указанном диапазоне. Если
//        границы диапазона указаны неправильно требуется произвести нормализацию границ. Например, пользователь
//        ввел 20 и 11, требуется нормализация, после которой
//        начало диапазона станет равно 11, а конец 20.

//        int num1, num2;
//        System.out.print("Введіть перше число:");
//        Scanner scanner = new Scanner(System.in);
//        num1 = scanner.nextInt();
//        System.out.print("Введіть друге число:");
//        scanner = new Scanner(System.in);
//        num2 = scanner.nextInt();
//        if(num1<num2){
//        for (int i = num1; i < num2; i++){
//            if(i%2!=0){
//                System.out.print(i+" ");
//            }
//        }
//        }
//        else if(num1>num2){
//            for (int i = num2; i < num1; i++){
//                if(i%2!=0){
//                    System.out.print(i+" ");
//                }
//            }
//        }

//        Задание 8
//        Показать на экран таблицу умножения в диапазоне,
//                указанном пользователем. Например, если пользователь
//        указал 3 и 5, таблица может выглядеть так:
//        3*1 = 3 3*2 = 6 3*3 = 9 ………… 3* 10 = 30
//……………………………………………………
//        5*1 = 5 5 *2 = 10 5 *3 = 15 ………….

//        int num1, num2;
//        System.out.print("Введіть перше число:");
//        Scanner scanner = new Scanner(System.in);
//        num1 = scanner.nextInt();
//        System.out.print("Введіть друге число:");
//        scanner = new Scanner(System.in);
//        num2 = scanner.nextInt();
//        for (int i = num1; i <= num2; i++) {
//            for (int j=1; j<=10; j++) {
//                System.out.print(i+"*"+j+"="+i * j+"\n");
//            }
//        }

//        Задание 9
//        В одномерном массиве, заполненном случайными
//        числами, определить минимальный и максимальный
//        элементы, посчитать количество отрицательных элементов, посчитать количество положительных элементов, посчитать количество нулей. Результаты вывести
//        на экран.

//        int n;
//        int min=0, max=0, countNegativeNumb=0, countPositiveNumb=0, countZero=0;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Вкажіть розмір масива:");
//        n = Integer.parseInt(in.next());
//        Integer array[] = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = getRandomNumber(-25, 25);
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i] + " ");
//            if(array[i]<min){
//                min=array[i];
//            }
//            if(array[i]>max){
//                max=array[i];
//            }
//            if(array[i]<0){
//                countNegativeNumb++;
//            }
//            if(array[i]>0){
//                countPositiveNumb++;
//            }
//            if(array[i]==0){
//                countZero++;
//            }
//        }
//        System.out.print("\nMin: "+min+"\nMax: "+max+"\nCountNegativeNumb: "+countNegativeNumb+"\ncountPositiveNumb: "+countPositiveNumb+"\ncountZero: "+countZero);

//        Задание 10
//        Есть одномерный массив, заполненный случайными
//        числами. На основании данных этого массива нужно:
//■ Создать одномерный массив, содержащий только
//        четные числа из первого массива;
//■ Создать одномерный массив, содержащий только
//        нечетные числа из первого массива;
//■ Создать одномерный массив, содержащий только
//        отрицательные числа из первого массива;
//■ Создать одномерный массив, содержащий только
//        положительные числа из первого массива.

//        int n;
//        int countPairedElements = 0, countOddElements=0, countNegativeNumb=0, countPositiveNumb=0;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Вкажіть розмір масива:");
//        n = Integer.parseInt(in.next());
//        int array[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = getRandomNumber(-25, 25);
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i] + " ");
//            if (array[i] % 2 == 0) {
//                countPairedElements++;
//            }
//            if (array[i] % 2 != 0) {
//                countOddElements++;
//            }
//            if (array[i] < 0) {
//                countNegativeNumb++;
//            }
//            if (array[i] > 0) {
//                countPositiveNumb++;
//            }
//        }
//        int [] mas2 = new int[countPairedElements];
//        int index1 = 0;
//        for (int i = 0; i < n; i++) {
//            if(array[i]%2 == 0){
//                mas2[index1] = array[i];
//                index1++;
//            }
//        }
//        System.out.println("\nМасив з парними елементами: "+Arrays.toString(mas2));
//
//        int [] mas3 = new int[countOddElements];
//        int index2 = 0;
//        for (int i = 0; i < n; i++) {
//            if(array[i]%2 != 0){
//                mas3[index2] = array[i];
//                index2++;
//            }
//        }
//        System.out.println("Масив з непарними елементами: "+Arrays.toString(mas3));
//
//        int [] mas4 = new int[countNegativeNumb];
//        int index3 = 0;
//        for (int i = 0; i < n; i++) {
//            if(array[i]<0){
//                mas4[index3] = array[i];
//                index3++;
//            }
//        }
//        System.out.println("Масив з від'ємними елементами: "+Arrays.toString(mas4));
//
//        int [] mas5 = new int[countPositiveNumb];
//        int index4 = 0;
//        for (int i = 0; i < n; i++) {
//            if(array[i]>0){
//                mas5[index4] = array[i];
//                index4++;
//            }
//        }
//        System.out.println("Масив з додатніми елементами: "+Arrays.toString(mas5));

//        Задание 11
//        Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
//        Метод принимает в качестве параметра: длину линии,
//        направление, символ.

        //lineOfSymbols(8, false, '*');

//        Задание 12
//        Напишите метод, сортирующий массив по убыванию
//        или возрастанию в зависимости от выбора пользователя.

//        int n;
//        int choice = 0;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Вкажіть розмір масива:");
//
//        n = Integer.parseInt(in.next());
//        Integer array[] = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = getRandomNumber(5, 25);
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.print("\nЗробіть вибір: 1 - Сортування по зростанню; 2 - Сортування по спаданню");
//        Scanner scanner = new Scanner(System.in);
//        choice = scanner.nextInt();
//        switch (choice) {
//            case 1:
//                System.out.print("\nСортування по зростанню:");
//                for (int i = array.length - 1; i > 0; i--) {
//                    for (int j = 0; j < i; j++) {
//                        if (array[j] > array[j + 1]) {
//                            int tmp = array[j];
//                            array[j] = array[j + 1];
//                            array[j + 1] = tmp;
//                        }
//                    }
//                }
//                for (int i = 0; i < n; i++) {
//                    System.out.print(array[i] + " ");
//                }
//                break;
//            case 2:
//                System.out.print("\nСортування по спаданню:");
//                Arrays.sort(array, Collections.reverseOrder());
//                for (int i = 0; i < n; i++) {
//                    System.out.print(array[i] + " ");
//                }
//                break;
//        }
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    static void lineOfSymbols(int length, Boolean horizontal, char symb) {
        for (int i = 0; i < length; i++) {
                if (horizontal == true) {
                    System.out.print(symb);
                }
                else if(horizontal==false){
                    System.out.print(symb+"\n");
                }
            }
        }
}
