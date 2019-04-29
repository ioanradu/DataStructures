package arrayList;

public class Main {
    public static void main(String[] args) {
        MyArray ma = new MyArray();


        ma.showArray();
        ma.add(15);
        ma.showArray();
        ma.add(52);
        ma.showArray();
        ma.add(4);
        ma.showArray();
        ma.add(53);
        ma.showArray();
        ma.add(12);
        ma.showArray();
        ma.add(14);
        ma.showArray();
        ma.add(16);
        ma.showArray();
        ma.add(50);
        ma.showArray();
        ma.add(10);
        ma.showArray();
        ma.setAt(10,99);
        System.out.println(ma.getAt(10));

        ma.removeAt(3);
        ma.showArray();


    }
}
