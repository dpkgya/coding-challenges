import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamSortByName {
    public static void main(String[] args) {

        List<Person> listPersons = new ArrayList<>();
        listPersons.add(new Person("Deepak", 30, 100));
        listPersons.add(new Person("Hari", 31, 101));
        listPersons.add(new Person("Subash", 32, 102));
        listPersons.add(new Person("Mohan", 33, 103));
        listPersons.add(new Person("Neha", 34, 104));

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareToIgnoreCase(p2.getName());
            }
        };

        Collections.sort(listPersons, comparator);

        for (Person persons : listPersons) {
            System.out.print(persons.getRollno()+" ");
            System.out.print(persons.getName()+" ");
            System.out.print(persons.getAge());
            System.out.println();
        }

    }
}
