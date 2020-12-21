public class MyLinkedList <E> {

    protected NodeList<E> head;
    protected NodeList<E> tail;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public NodeList<E> getHead(){
        return this.head;
    }

    public NodeList<E> getTail(){
        return this.tail;
    }

    public void setHead(NodeList<E> h){
        this.head = h;
    }

    public void setTail(NodeList<E> t){
        this.tail = t;
    }

    public void add(E data){
        NodeList<E> n1 = new NodeList<E>(data);
        if (this.isEmpty()){  // if list is empty
            this.head = n1;
            this.tail = n1;
        }
        else {
            if (this.length() == 1){ // list is not empty and has 1 node
                this.head.setNext(n1);
                this.tail = n1;
            }
            else{ // list is not empty and has more than 1 nodes
                this.tail.setNext(n1);
                this.tail = n1;
            }
        }
    }

    public E remove () throws EmptyListException {
        NodeList<E> n1 = this.head;
        if (this.isEmpty()) { // if list is empty
            throw new EmptyListException("Cannot remove from empty list!!!");
        }
        else{
            if(this.length() == 1){ // list is not empty and has 1 node
                this.head = null;
                this.tail = null;
            }
            else{ // list is not empty and has more than 1 nodes
                this.head = this.head.getNext();
            }
        }
        return n1.getData();
    }

    public String toString(){
        NodeList<E> curr = this.head;
        String str = "";
        while (curr != null){
            str += curr.getData().toString()+" -> ";
            curr = curr.getNext();
        }
        return str;
    }

    public MyLinkedList<E> reverse(){
        MyLinkedList<E> output = new MyLinkedList<>();
        output.setTail(this.head);
        NodeList<E> prev = null;
        NodeList<E> current = this.head;
        NodeList<E> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.head = prev;

        output.setHead(this.head);

        return output;
    }

    private boolean isEmpty(){
        boolean res = false;
        if (this.head == null)
            res = true;
        return res;
    }

    private int length(){
        int count = 0;
        NodeList<E> curr = this.head;
        while (curr != null){
            count++;
            curr = curr.getNext();
        }
        return count;
    }

}


