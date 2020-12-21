# -LinkedList---Generic-implementation
A generic implementation of 'MyLinkedList <E<>>', supports the operations of:<br />
* getHead - returns the NodeList<E> of the begining of the list<br />
* setHead - set a new NodeList<E> to the begining of the list<br />
* getTail - returns the NodeList<E> of the end of the list<br />
* setTail - set a new NodeList<E> to the end of the list<br />
* constructor for initializing an empty list<br />
* add - creates a new MyLinkedList <E> and put it in the end of the list<br />
* remove - deletes the head of the list and returns the deleted value<br />
* reverse - reverse the list 
<br /><br />
The 'NodeList <E>' class contains get and set functions for the value of the Node, and for the pointer to the next Node.
<br /><br />
In addition, the class 'EmptyListException' is an extension of 'Exception' which returns an error message when an attempt is made to erase an element from an empty list.<br /><br />  
The ListsComperator class contains a generic function Max, which get a generic MyLinkedList<E> as an argument, when E implement 'Comparable' interface,<br />
and returns the biggest item in the list, according to the implementation of the 'compareTo' function of E.<br />
These features are demonstrated through the class 'Person implements Comparable <Person>' in Q1.java file. 
  
  
