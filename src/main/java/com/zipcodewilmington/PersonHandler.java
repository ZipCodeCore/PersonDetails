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


        // just another attempt
        String result = "";
        int i = 0;

        while (i < this.personArray.length) {
            Person currentPerson = personArray[i]; // notice the Person class used here...
            result = result + currentPerson;
            i++;
        }
        return result;



//        // create empty string which we can place
//        String result = "";
//        // create a `counter`
//        int counter = 0;
//        // while `counter` is less than length of array
//        while (counter < this.personArray.length) {
//            // begin loop
//            Person currentPerson = personArray[counter];            // currentPerson variable is the current position in the personArray
//            String strCurrentPerson = currentPerson.toString();   // create variable to save currentPerson.toString();
//            result = result + strCurrentPerson;                           // adding strCurrentPerson to result
//            counter++;
//        }
//        // use `counter` to identify the `current Person` in the array
//        // get `string Representation` of `currentPerson`
//        // append `stringRepresentation` to `result` variable
//
//        // end loop
//        return result;
    }


    public String forLoop() {

        // just another attempt
        String result = "";

        for (int i = 0; i < personArray.length; i++) {
            result = result + personArray[i];

        }

        return result;


//
//        String result = "";
//        int counter;
//        // identify initial value
//        // identify terminal condition
//        // identify increment
//        for (counter = 0; counter < personArray.length; counter++) {
//            Person currentPerson = personArray[counter];
//            String strCurrentPerson = currentPerson.toString();
//            result += strCurrentPerson;
//
//        }
//        // use the above clauses to declare for-loop signature
//        // begin loop
//        // use `counter` to identify the `current Person` in the array
//        // get `string Representation` of `currentPerson`
//        // append `stringRepresentation` to `result` variable
//        // end loop
//
//        return result;
    }


    public String forEachLoop() {

        // just another attempt
        String result = "";
        int i = 0;

        for (Person person : personArray) {
            result = result + personArray[i];
            i++;
        }

        return result;




//        String result = "";
//
//        // identify array's type -- Person
//        // identify array's variable-name -- personArray
//        // use the above discoveries to declare for-each-loop signature
//
//        // SO, FOR EACH LOOPS WILL PERFORM THE CODE ON EVERY THING IN THE SET--ITLL GO THROUGH EVERY SINGLE ONE
//        for (Person person : personArray) {    // for each currentPerson in personArray do something
//
//            String strCurrentPerson = person.toString();
//
//            result += strCurrentPerson;
//        }


        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

//        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}