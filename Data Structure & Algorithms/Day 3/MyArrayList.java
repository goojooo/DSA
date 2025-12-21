import java.util.Scanner;
import java.util.Arrays;

public class MyArrayList<T> {

    private Object[] arr;
    private int size;

    // Constructor
    public MyArrayList() {
        arr = new Object[10]; // initial capacity
        size = 0;
    }

    // Add method
    public void add(T element) {
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[size++] = element;
    }

    // toString method
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(arr, size));
    }

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }
}
