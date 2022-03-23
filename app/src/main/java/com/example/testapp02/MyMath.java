package com.example.testapp02;

public class MyMath {

    public String add(String a, String b) {
        String res = "";
        int result;

        if ( (!a.isEmpty()) || (!b.isEmpty()) ) {

            if (a.matches("[a-zA-Z]+") || b.matches("[a-zA-Z]+")) {
                return "Вы опракинули буквы";
            }

            if (a.contains(".") || b.contains(".") ) {
                return "Вы опракинули точку";
            }

            int first = Integer.parseInt(a.trim());
            int second = Integer.parseInt(b.trim());
            result = first + second;
            res = String.valueOf(result);

        } else {
            return "Вы опракинули нулевое значение";
        }
        return res;

    }

    public String div(String a, String b) {
        int first = Integer.parseInt(a.trim());
        int second = Integer.parseInt(b.trim());
        if (second == 0) {
            return "на ноль делить нельзя!";
        } else {
            return String.valueOf(first/second);
        }

    }
}
