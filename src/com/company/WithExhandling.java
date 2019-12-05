package com.company;

public class WithExhandling {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 0, 6};
        try {
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2] / 0);
            System.out.println(arr[3]);
            System.out.println(arr[4]);
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic  Mistake");
            System.out.println(ae.getMessage());
        } catch (ArrayIndexOutOfBoundsException ae2) {
            System.out.println("Вышли за пределы массива");
            System.out.println(ae2.getMessage());
        } catch (Exception ae3) {
            System.out.println("Другая ошибка");
            System.out.println(ae3.getMessage());

        }
        finally {
            System.out.println("Конечный итог");
        }
    }
}
