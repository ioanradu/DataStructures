package queue;

public class MyArrayQueue {

    public static final int SEGMENT = 8;
    int[] a;
    int size;

    MyArrayQueue() {
        a = new int[SEGMENT];
        size = 0;
    }

    public void push(int value) { // insereaza in stiva
        if (a.length == size) {
            increaseCapacity();
        }
        a[size] = value;
        size++;
    }

    public void showStack() { // afiseaza stiva
        System.out.println("the size is: " + size + " / " + a.length + " ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void increaseCapacity() {
        int[] b = new int[a.length + SEGMENT];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        a = b;
    }

    public int peek() { //returneaza valoarea celui mai de sus element, nu il elimina
        return a[size - 1];
    }

    public int pop() { // stege primul element din queue
        if(size == 0){
            return 0;
        }
        int value = a[0];
        for (int i = 0; i < size; i++) {
            //a[i-1] = a[i];
            a[i] = a[i + 1];
        }
        a[a.length - 1] = 0;
        size--;
        return value;
    }

}
