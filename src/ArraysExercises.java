import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] person;
        person = new Person[]{new Person("Peter"), new Person("Stewie"), new Person("Brian")};

        Person[] newArr = addPerson(person, new Person("Meg"));
        System.out.println(Arrays.toString(newArr));
        for (Person update : newArr) {
            System.out.println(update.getName());
        }


    }

    public static Person[] addPerson(Person[] person, Person obj  ) {
        Person[] newArr;
        newArr = new Person[person.length+1];
        for (int i = 0; i < person.length; i++) {
            newArr[i] = person[i];
        }
        newArr[person.length] = obj;
        return newArr;
    }



}
