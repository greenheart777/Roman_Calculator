package com.company;

public class Rome {
    public static void rome() {
        if (Main.words[0].equals("I") | Main.words[0].equals("i") | Main.words[0].equals("1")) {
            Main.a = 1;
        }
        if (Main.words[0].equals("II") | Main.words[0].equals("ii") | Main.words[0].equals("2")) {
            Main.a = 2;
        }
        if (Main.words[0].equals("III") | Main.words[0].equals("iii") | Main.words[0].equals("3"))
            Main.a = 3;
        if (Main.words[0].equals("IV") | Main.words[0].equals("iv") | Main.words[0].equals("4"))
            Main.a = 4;
        if (Main.words[0].equals("V") | Main.words[0].equals("v") | Main.words[0].equals("5"))
            Main.a = 5;
        if (Main.words[0].equals("VI") | Main.words[0].equals("vi") | Main.words[0].equals("6"))
            Main.a = 6;
        if (Main.words[0].equals("VII") | Main.words[0].equals("vii") | Main.words[0].equals("7"))
            Main.a = 7;
        if (Main.words[0].equals("VIII") | Main.words[0].equals("viii") | Main.words[0].equals("8"))
            Main.a = 8;
        if (Main.words[0].equals("IX") | Main.words[0].equals("ix") | Main.words[0].equals("9"))
            Main.a = 9;
        if (Main.words[0].equals("X") | Main.words[0].equals("x") | Main.words[0].equals("10"))
            Main.a = 10;

            if (Main.words[2].equals("I") | Main.words[2].equals("i") | Main.words[2].equals("1")) {
                Main.b = 1;
            }
            if (Main.words[2].equals("II") | Main.words[2].equals("ii") | Main.words[2].equals("2")) {
                Main.b = 2;
            }
            if (Main.words[2].equals("III") | Main.words[2].equals("iii") | Main.words[2].equals("3"))
                Main.b = 3;
            if (Main.words[2].equals("IV") | Main.words[2].equals("iv") | Main.words[2].equals("4"))
                Main.b = 4;
            if (Main.words[2].equals("V") | Main.words[2].equals("v") | Main.words[2].equals("5"))
                Main.b = 5;
            if (Main.words[2].equals("VI") | Main.words[2].equals("vi") | Main.words[2].equals("6"))
                Main.b = 6;
            if (Main.words[2].equals("VII") | Main.words[2].equals("vii") | Main.words[2].equals("7"))
                Main.b = 7;
            if (Main.words[2].equals("VIII") | Main.words[2].equals("viii") | Main.words[2].equals("8"))
                Main.b = 8;
            if (Main.words[2].equals("IX") | Main.words[2].equals("ix") | Main.words[2].equals("9"))
                Main.b = 9;
            if (Main.words[2].equals("X") | Main.words[2].equals("x") | Main.words[2].equals("10"))
                Main.b = 10;
    }
    public static void obratno(){
        if (Main.result >= 1 && Main.result <= 9) {
            if (Main.result == 1) Main.result_r += "I";
            if (Main.result == 2) Main.result_r += "II";
            if (Main.result == 3) Main.result_r += "III";
            if (Main.result == 4) Main.result_r += "IV";
            if (Main.result == 5) Main.result_r += "V";
            if (Main.result == 6) Main.result_r += "VI";
            if (Main.result == 7) Main.result_r += "VII";
            if (Main.result == 8) Main.result_r += "VIII";
            if (Main.result == 9) Main.result_r += "IX";
        }
        if (Main.result >= 10 && Main.result <= 19) {
            Main.result_r += "X";
            if (Main.result % 10 == 1) Main.result_r += "I";
            if (Main.result % 10 == 2) Main.result_r += "II";
            if (Main.result % 10 == 3) Main.result_r += "III";
            if (Main.result % 10 == 4) Main.result_r += "IV";
            if (Main.result % 10 == 5) Main.result_r += "V";
            if (Main.result % 10 == 6) Main.result_r += "VI";
            if (Main.result % 10 == 7) Main.result_r += "VII";
            if (Main.result % 10 == 8) Main.result_r += "VIII";
            if (Main.result % 10 == 9) Main.result_r += "IX";
        }
        if (Main.result >= 20 && Main.result <= 29) {
            Main.result_r += "XX";
            if (Main.result % 20 == 1) Main.result_r += "I";
            if (Main.result % 20 == 2) Main.result_r += "II";
            if (Main.result % 20 == 3) Main.result_r += "III";
            if (Main.result % 20 == 4) Main.result_r += "IV";
            if (Main.result % 20 == 5) Main.result_r += "V";
            if (Main.result % 20 == 6) Main.result_r += "VI";
            if (Main.result % 20 == 7) Main.result_r += "VII";
            if (Main.result % 20 == 8) Main.result_r += "VIII";
            if (Main.result % 20 == 9) Main.result_r += "IX";
        }
        if (Main.result >= 30 && Main.result <= 39) {
            Main.result_r += "XXX";
            if (Main.result % 30 == 1) Main.result_r += "I";
            if (Main.result % 30 == 2) Main.result_r += "II";
            if (Main.result % 30 == 3) Main.result_r += "III";
            if (Main.result % 30 == 4) Main.result_r += "IV";
            if (Main.result % 30 == 5) Main.result_r += "V";
            if (Main.result % 30 == 6) Main.result_r += "VI";
            if (Main.result % 30 == 7) Main.result_r += "VII";
            if (Main.result % 30 == 8) Main.result_r += "VIII";
            if (Main.result % 30 == 9) Main.result_r += "IX";
        }
        if (Main.result >= 40 && Main.result <= 49) {
            Main.result_r += "XL";
            if (Main.result % 40 == 1) Main.result_r += "I";
            if (Main.result % 40 == 2) Main.result_r += "II";
            if (Main.result % 40 == 3) Main.result_r += "III";
            if (Main.result % 40 == 4) Main.result_r += "IV";
            if (Main.result % 40 == 5) Main.result_r += "V";
            if (Main.result % 40 == 6) Main.result_r += "VI";
            if (Main.result % 40 == 7) Main.result_r += "VII";
            if (Main.result % 40 == 8) Main.result_r += "VIII";
            if (Main.result % 40 == 9) Main.result_r += "IX";
        }
        if (Main.result >= 50 && Main.result <= 59) {
            Main.result_r += "XL";
            if (Main.result % 50 == 1) Main.result_r += "I";
            if (Main.result % 50 == 2) Main.result_r += "II";
            if (Main.result % 50 == 3) Main.result_r += "III";
            if (Main.result % 50 == 4) Main.result_r += "IV";
            if (Main.result % 50 == 5) Main.result_r += "V";
            if (Main.result % 50 == 6) Main.result_r += "VI";
            if (Main.result % 50 == 7) Main.result_r += "VII";
            if (Main.result % 50 == 8) Main.result_r += "VIII";
            if (Main.result % 50 == 9) Main.result_r += "IX";
        }
        if (Main.result >= 60 && Main.result <= 69) {
            Main.result_r += "XL";
            if (Main.result % 60 == 1) Main.result_r += "I";
            if (Main.result % 60 == 2) Main.result_r += "II";
            if (Main.result % 60 == 3) Main.result_r += "III";
            if (Main.result % 60 == 4) Main.result_r += "IV";
            if (Main.result % 60 == 5) Main.result_r += "V";
            if (Main.result % 60 == 6) Main.result_r += "VI";
            if (Main.result % 60 == 7) Main.result_r += "VII";
            if (Main.result % 60 == 8) Main.result_r += "VIII";
            if (Main.result % 60 == 9) Main.result_r += "IX";
        }
        if (Main.result >= 70 && Main.result <= 79) {
            Main.result_r += "XL";
            if (Main.result % 70 == 1) Main.result_r += "I";
            if (Main.result % 70 == 2) Main.result_r += "II";
            if (Main.result % 70 == 3) Main.result_r += "III";
            if (Main.result % 70 == 4) Main.result_r += "IV";
            if (Main.result % 70 == 5) Main.result_r += "V";
            if (Main.result % 70 == 6) Main.result_r += "VI";
            if (Main.result % 70 == 7) Main.result_r += "VII";
            if (Main.result % 70 == 8) Main.result_r += "VIII";
            if (Main.result % 70 == 9) Main.result_r += "IX";
        }
        if (Main.result >= 80 && Main.result <= 89) {
            Main.result_r += "XL";
            if (Main.result % 80 == 1) Main.result_r += "I";
            if (Main.result % 80 == 2) Main.result_r += "II";
            if (Main.result % 80 == 3) Main.result_r += "III";
            if (Main.result % 80 == 4) Main.result_r += "IV";
            if (Main.result % 80 == 5) Main.result_r += "V";
            if (Main.result % 80 == 6) Main.result_r += "VI";
            if (Main.result % 80 == 7) Main.result_r += "VII";
            if (Main.result % 80 == 8) Main.result_r += "VIII";
            if (Main.result % 80 == 9) Main.result_r += "IX";
        }
        if (Main.result >= 90 && Main.result <= 99) {
            Main.result_r += "XL";
            if (Main.result % 90 == 1) Main.result_r += "I";
            if (Main.result % 90 == 2) Main.result_r += "II";
            if (Main.result % 90 == 3) Main.result_r += "III";
            if (Main.result % 90 == 4) Main.result_r += "IV";
            if (Main.result % 90 == 5) Main.result_r += "V";
            if (Main.result % 90 == 6) Main.result_r += "VI";
            if (Main.result % 90 == 7) Main.result_r += "VII";
            if (Main.result % 90 == 8) Main.result_r += "VIII";
            if (Main.result % 90 == 9) Main.result_r += "IX";
        }
        if (Main.result == 100) {
            Main.result_r += "C";
        }
    }
}
