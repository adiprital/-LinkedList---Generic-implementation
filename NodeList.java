public class NodeList <E>{

    protected E data;
    protected NodeList<E> next;

    public NodeList (E d){
        this.data = d;
        this.next = null;
    }

    public NodeList (E d, NodeList<E> n){
        this.data = d;
        this.next = n;
    }


    public void setData(E d){
        this.data = d;
    }

    public void setNext (NodeList<E> n){
        this.next = n;
    }

    public E getData(){
        return data;
    }

    public NodeList<E> getNext(){
        return next;
    }

}
