package main;

class SpecialString {
    String str;
    SpecialString(String str) {
        this.str = str;
    }
}

public class Question018 {
    public static void main(String[] args) {
        System.out.println(new String("Java"));
        System.out.println(new StringBuilder("Java"));
        System.out.println(new SpecialString("Java"));
    }
}