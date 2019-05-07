package queue;

public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue mq = new MyLinkedListQueue();
        mq.push(1);
        mq.push(2);
        mq.push(3);
        mq.push(4);
        mq.push(5);
        mq.push(6);

        mq.showQueue();
        System.out.println("Prima valoare (introdusa) din coada este: " + mq.peek());
        System.out.println("Elementul care va fi sters este: " + mq.pop());
        System.out.println("Elementul care va fi sters este: " + mq.pop());
        mq.showQueue();

        MyArrayQueue ma = new MyArrayQueue();
        ma.push(7);
        ma.push(8);
        ma.push(9);
        ma.push(10);
        ma.push(11);
        ma.push(12);
        ma.push(13);
        ma.push(14);
        ma.push(15);

        ma.showStack();
        System.out.println("Ultimul element din stiva: " + ma.peek());
        System.out.println("Elementul care va fi sters: " + ma.pop());
        ma.showStack();
        System.out.println("Elementul care va fi sters: " + ma.pop());
        ma.showStack();
    }
}