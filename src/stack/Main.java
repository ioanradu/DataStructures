package stack;

public class Main {
    public static void main(String[] args) {
        MyArrayStack ms = new MyArrayStack();
        ms.push(7);
        ms.push(11);
        ms.push(13);
        ms.push(14);
        ms.push(15);
        ms.push(16);
        ms.push(17);
        ms.push(18);
        ms.push(19);
        ms.push(20);
        ms.push(21);

        ms.showStack();

        System.out.println("Ultimul element din stiva este: " + ms.peek());
        ms.push(25);
        ms.push(35);
        ms.showStack();
        System.out.println("Ultimul element din stiva este: " + ms.peek());

        System.out.println("Acest element s-a sters " + ms.pop());
        System.out.println("Acest element s-a sters " + ms.pop());
        System.out.println("Acest element s-a sters " + ms.pop());
        System.out.println("Acest element s-a sters " + ms.pop());
        ms.showStack();

        MyLinkedListStack ml = new MyLinkedListStack();
        ml.push(15);
        ml.push(16);
        ml.push(17);
        ml.push(18);
        ml.push(19);
        ml.push(20);

        ml.showQueue();
        System.out.println("Primul element este: " + ml.peek());

        System.out.println("Elementul care va fi sters este : " + ml.pop());
        System.out.println("Elementul care va fi sters este : " + ml.pop());
        System.out.println("Elementul care va fi sters este : " + ml.pop());

        ml.showQueue();
    }

}

