package org.example;


import java.awt.*;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String name;

        System.out.println("Welcome to Grade Book: ");
        System.out.println("Please enter student name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello " + name);

    }
}