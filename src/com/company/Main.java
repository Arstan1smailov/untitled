package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> list1 = new ArrayList<>();
        while (list1.size() < 5) {
            System.out.println("Введите что то:");
            Scanner scanner = new Scanner(System.in);
            list1.add(scanner.nextLine());
        }
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>();
        while (list2.size() < 5) {
            System.out.println("Введите что то:");
            Scanner scanner = new Scanner(System.in);
            list2.add(scanner.nextLine());
        }
        System.out.println(list2);
        ArrayList<String> list3 = new ArrayList<>();
        list3.add(list1.get(0));
        list3.add(list2.get(4));
        list3.add(list1.get(1));
        list3.add(list2.get(3));
        list3.add(list1.get(2));
        list3.add(list2.get(2));
        list3.add(list1.get(3));
        list3.add(list2.get(1));
        list3.add(list1.get(4));
        list3.add(list2.get(0));
        System.out.println(list3);
        Collections.sort(list3, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        Collections.reverse(list3);
        System.out.println(list3);
    }
}
