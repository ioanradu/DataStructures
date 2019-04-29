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


    }

}
