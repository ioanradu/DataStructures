package arrayList;

public class SimpleArrayCopy {
    public static void main(String[] args) {

        int[] a = {3, 5, 13};
        int[] b = new int[4];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];

        }

        b[3] = 20; //sau [b.length - 1] pt ultima valoare

        a = b;

        for (int i = 0; i < b.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
