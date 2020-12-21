public class Person implements Comparable <Person> {
    protected String name;
    protected int birthYear;
    protected String id;

    public Person(String n, int y, String i){
        this.name = n;
        this.birthYear = y;
        this.id = i;
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    @Override
    public int compareTo(Person p) {
        int year1 = this.birthYear;
        int year2 = p.getBirthYear();
        int res;
        if ( year1 > year2){
            res = -1;
        } else {
            if ( year1 < year2){
                res = 1;
            }
            else
                res = 0;
        }
        return res;
    }

    public String toString(){
        return "My name is: "+this.name+", i was born in: "+this.birthYear+", my ID number is: "+this.id;
    }

}
