package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while (counter < personArray.length) {
            // begin loop
            Person currentPerson = personArray[counter];
            String strCurrentPerson = currentPerson.toString();
            result += strCurrentPerson;
            counter++;
        }
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        int counter = 0;
        // identify initial value
        // identify terminal condition
        // identify increment
        for(counter = 0; counter < personArray.length; counter++ ) {
         Person currentPerson = personArray[counter];
         String strCurrentPerson = currentPerson.toString();
         result += strCurrentPerson;


        }
        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";

        // identify array's type -- Person
        // identify array's variable-name -- personArray
        // use the above discoveries to declare for-each-loop signature
        for (Person person : personArray) {


            String strCurrentPerson = person.toString();
            result += strCurrentPerson;
        }




        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}