package Pertemuan9;

public class Halting {
    public static void main(String[] args) {
        int hasil = sum(5, 10);
        System.out.println(hasil);
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}