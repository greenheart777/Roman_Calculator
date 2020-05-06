package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static String var;
    public static String[] words;
    public static String result_r = "";
    public static int a, b, result, pr1, pr2;

    /* pr1 и pr2 испольуются для проверки на вид системы счисления
    * Если арабская, то 1.
    * Если римская, то 2.
    * */

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу “Калькулятор”");
        System.out.println("   Калькулятор умеет работать как с арабскими (1,2,3,4,5…10), так и с римскими (I,II,III,IV,V…X) числами.");
        System.out.println("  Напишите внизу одну из выражений: a + b, a - b, a * b, a / b");

	    Scanner myVar = new Scanner(System.in);
        var = myVar.nextLine();
        words = var.split("\\s");

            try {
                Proverka.prov();
                if (pr1 != pr2){
                    throw new Exception();
                }
                Rome.rome();
                if (a % 1 != 0 | b % 1 != 0){
                    throw new Exception();
                }
                if ((a > 10  && a < 0) | (b > 10  && b < 0)){
                    throw new Exception();
                }

                calculate();
                Rome.obratno();

                if (pr1 == 1) {
                    System.out.println("Результат: " + result_r + "(" + result + ")");
                }
                if (pr1 == 2) {
                    System.out.println("Результат: " + result + "(" + result_r + ")");
                }


            } catch(Exception ex){
                System.out.println("ОШИБКА! ПРОЧИТАЙ ЗАМЕТКУ:");
                System.out.println("1) Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числа");
                System.out.println("2) Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
                System.out.println("3) Калькулятор умеет работать только с целыми числами.");
                System.out.println("4) Калькулятор умеет работать только с арабскими или римскими цифрами одновременно.");
                System.out.println("");
                System.out.println("ПОПРОБУЙ ЗАНОВО ВВЕСТИ");
            }

    }

    private static void calculate(){
        if (words[1].equals("+")){
            result = a+b;
        }
        if (words[1].equals("-")){
            result = a-b;
        }
        if (words[1].equals("*")){
            result = a*b;
        }
        if (words[1].equals("/")){
            result = a/b;
        }
    }
}
