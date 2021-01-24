package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("a", 3),
                new Job("b", 2),
                new Job("c", 1)
        );
        System.out.println("Стандартный вывод");
        System.out.println(jobs);

        System.out.println("Сортировка по приоритету");
        Collections.sort(jobs);
        System.out.println(jobs);

        System.out.println("Сортировка по имени");
        jobs.sort(new SortByNameJob());
        System.out.println(jobs);
    }
}