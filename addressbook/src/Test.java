import com.aashi.learning.person.Person;

public class Test {

    public static void main(String[] args){
        Person aashi = new Person();
        aashi.setFirstName("Aashi");
        aashi.setLastName("Rai");
        aashi.setAge(15);
        aashi.abc = 12;
        Person.shared = 11;
        System.out.println(aashi);
        Person archna = new Person("Archna","Kumari",45);
        // if I change it here, and not above, the aashi object will not print with changed shared.
        //to show the changed shared of aashi, print it after this statement
        //Person.shared = 11;
        System.out.println(archna);
        Person akhilesh = new Person("Akhilesh","Rai",48);
        System.out.println(akhilesh);


        Person aashi_double_role = new Person("Aashi", "Rai", 15);
        System.out.println(aashi_double_role);

        //comparison...
        System.out.println(aashi.equals(aashi_double_role));
        //class name Object
    }
}
