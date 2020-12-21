/* An object that contains the function max, which get a generic list as an arguments
and returns the maximum object in this list, by using compareTo function.*/
public class ListsComperator {

    public ListsComperator(){
    }

    public  <E extends Comparable<E>> E max(MyLinkedList<E> list){
        NodeList<E> curr = list.getHead();
        NodeList<E> max = list.getHead();
        while (curr != null){
            int curr_res;
            if (curr.getNext() != null){
                curr_res = max.getData().compareTo(curr.getNext().getData());
                if (curr_res < 0) {
                    max = curr.getNext();
                }
                if ( curr_res > 0){
                    max = curr;
                }
                if (curr_res == 0){
                    max = curr;
                }
            }
            curr = curr.getNext();
        }
        return max.getData();
    }
}
