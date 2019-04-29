package arrayList;

public class MyArray {

    public static final int SEGMENT = 8;
    public int[] a;
    public int size;

    MyArray() {
        this.a = new int[SEGMENT];
        size = 0;
    }

    public void showArray() {
        System.out.println("the size is:" + size + " / " + a.length + " ");

        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void add(int value) {
        if (a.length == size) {
            increaseCapacity();
        }
        a[size] = value;
        size++;
    }

    public void increaseCapacity() {
        int[] b = new int[a.length + SEGMENT];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        a = b;
    }

    public void setAt(int index, int value) {
        a[index] = value;
    }

    public int getAt(int index) {
        return a[index];
    }

    public void removeAt(int index) {  // shiftare, daca vreau sa sterg al doilea sau oricare element dintr-un array
        for (int i = index; i < size; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = 0;
        size--;
    }

}

