package org.cydeo.java11;

public class StringMethodDemo {
    public static void main(String[] args) {
String str="ahmet\nmehmet\nfatma\nadem";
str.lines().forEach(System.out::println);
    }
}
