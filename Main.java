package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    void p(){}
    public static void outofmemory() {
        Integer[] error = new Integer[5000 * 500 * 500];
    } //OutOfMemoryError из-за того что у нас огромный массив пытается инициализироваться
    public static void outofmemory_2() {
        int index = 1;
        List<byte[]> list = new ArrayList<>();
        while (true) {
            byte[] b = new byte[1000000];
            list.add(b);
            Runtime rt = Runtime.getRuntime();
            System.out.printf("[%d] free memory: %s%n", index++, rt.freeMemory());
        }
    } // добавили слишком много значений в список
    public static void outofmemory_3() {
        Map<Long, Long> map = new HashMap<>();
        for (long i = 0l; i < Long.MAX_VALUE; i++) {
            map.put(i, i);
        }
    } //Лимит сборщика мусора
    public static void stackoverflow(int num){

            System.out.println("Number: " + num);
            if (num == 0)
                return;
            else
                stackoverflow(++num);
        } // рекурсивный пример для перегрузки стэка
    public static void stackoverflow_2(){
        stackoverflow_2();
    } // повторение одного и того же метода
    public static void stackoverflow_3(){
        stackoverflow_2();
    } // не придумал третий вариант, метод вызывающий метод с повторением одинаковых методов)

    public static void main(String[] args) {
	    stackoverflow_3();
    }
}
