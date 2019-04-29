package queue;

public class MyLinkedListQueue {
    Node bottom;
    Node top;

    // introducere elemente in stiva
    public void push(int value){
        Node newNode = new Node(value);// creem un nod
        if(bottom == null){ // daca nu exista nici un nod
            bottom = newNode; // atribuim un nod
            top = bottom;// daca exista un singur nod atunci top = bottom
        } else {
            top.next = newNode;
            top = top.next;
        }
    }

    public void showQueue(){
        Node n = bottom;
        while (n != null) {
            System.out.print(n.info + " ");
            n = n.next;
        }
        System.out.println();
    }

    public int peek(){
        return bottom.info;
    }

    public int pop(){
        int value = bottom.info;
        bottom = bottom.next;

        return value;
    }
}
