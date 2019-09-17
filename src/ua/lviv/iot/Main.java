package ua.lviv.iot;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        ArrayList<Screen> reader1 = reader.reader("C:\\Users\\nazar\\IdeaProjects\\Sort\\src\\ua\\lviv\\iot\\test.txt");
        Screen[] item = reader1.toArray(new Screen[reader1.size()]);

        Manager manager = new Manager();

        long startTime = System.nanoTime();
        Screen[] item2 = manager.insertionSort(item);
        long stopTime = System.nanoTime();
        long time = stopTime-startTime;
        System.out.println("Insertion Sort");
        System.out.println("Insertion Sort Time: " + time);
        System.out.println("Insertion Sort comparison:" + Manager.insertionComparison);
        System.out.println("Insertion Sort swap:" + Manager.insertionSwap);
        for (Screen a : item2
        ) {
            System.out.println(a.toString());
        }

        System.out.println("//////////////////////////////////////////////");

        long startTime1 = System.nanoTime();
        manager.mergeSort(item, item.length);
        long stopTime1 = System.nanoTime();
        long time1 = stopTime1-startTime1;
        System.out.println("Merge Sort");
        System.out.println("Merge Sort Time: " + time1);
        System.out.println("Merge Sort comparison: " + Manager.mergeComparison);
        System.out.println("Merge Sort swap: " + Manager.mergeSwap);
        for (Screen a : item
        ) {
            System.out.println(a.toString());
        }
    }
}
