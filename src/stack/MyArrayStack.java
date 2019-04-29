package stack;

public class MyArrayStack {
    public static final int SEGMENT = 8; // se prefara a fi declarate inaintea celorlalte tipuri de date
    int[] data;
    int size;

    MyArrayStack(){
        data = new int[SEGMENT];
        size = 0;
    }

    public void push(int value){ // insereaza in stiva
        if(data.length == size){
            increaseCapacity();
        }
        data[size] = value;
        size++;
    }

    public void showStack(){ // afiseaza stiva
        System.out.println("the size is: " + size + " / " + data.length + " ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void increaseCapacity() {
        int[] b = new int[data.length + SEGMENT];
        for (int i = 0; i < data.length; i++) {
            b[i] = data[i];
        }
        data = b;
    }

    public int peek(){ //returneaza valoarea celui mai de sus element, nu il elimina

        return data[size - 1];
    }

    public int pop(){ // sterge ultimul element din stiva
        int value = data[size - 1];
        data[size - 1] = 0;
        size--; // dupa ce s-a sters scadem cu o unitate index-ul
        return value;
    }
}

