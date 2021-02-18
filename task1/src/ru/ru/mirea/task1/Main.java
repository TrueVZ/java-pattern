package ru.mirea.task1;

public class Main {
    public static void main(String[] args) {
        Comparator myComparator = (o1, o2, n) -> ((o1 - o2) % n) == 0 ;
        System.out.println(myComparator.compare(32, -10, 7));
    }
}
