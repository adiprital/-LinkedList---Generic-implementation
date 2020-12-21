import javax.swing.*;

public class Q1 {
    public static void main(String[] args) throws EmptyListException {

        /* Q1.c */
        System.out.println("Q1.c:\n");
        MyLinkedList<String> i1 = new MyLinkedList<>();
        String str = null;
        int count = 0;
        while (count < 6){
            str = JOptionPane.showInputDialog("Enter something: ");
            if (str == null)
                break;
            i1.add(str);
            count++;
        }
        if (str != null) {
            System.out.println(i1.toString());
            MyLinkedList<String> i2 = i1.reverse();
            System.out.println(i2.toString());
        }



        /* Q1.e */
        System.out.println("\n\nQ1.e:\n");
        MyLinkedList<Person> pList = new MyLinkedList<>();
        Person p1 = new Person("Chris Hemsworth", 1983, "123456");
        Person p2 = new Person("Brad pitt", 1963, "654321");
        Person p3 = new Person("George Clooney", 1961, "32123");
        Person p4 = new Person("Richard Gere", 1949, "12321");

        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        pList.add(p4);

        ListsComperator compare = new ListsComperator();
        Person pMax = compare.max(pList);
        System.out.println(pMax);

    }

}
