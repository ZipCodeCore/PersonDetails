package com.zipcodewilmington;

//import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }


         // while `counter` is less than length of array
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        // create a `counter`

        public String whileLoop() {
            String result = "";

            int i = 0;
        while (i < personArray.length){
            Person currentPerson = personArray[i];
            String newString = currentPerson.toString();
            result += newString;
            i++;
        }
        return result;

            }


    // identify initial value
    // identify terminal condition
    // identify increment
    // use the above clauses to declare for-loop signature
    // begin loop
    // use `counter` to identify the `current Person` in the array
    // get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable
    // end loop

    public String forLoop() {
        String result = "";
        String counter = "currentPerson";

     for (int i = 0; i < personArray.length; i++){
         Person currentPerson = personArray[i];             //     this one also works !!!
         String newString = currentPerson.toString();           // enves de las dos 54+55
                                                        // String currentPerson = personArray[i].toString();
         result += newString; //

     }
        return result;
    }



    public String forEachLoop() {

        /*identify array's type
         identify array's variable-name

          use the above discoveries to declare for-each-loop signature
         begin loop
           String peps = currentPerson.toString();
                 get `string Representation` of `currentPerson`
            append `stringRepresentation` to `result` variable*/


        String result = "";

            for (Person currentPerson : personArray){

            result += currentPerson;

        }
        return result;
    }




    public Person[] getPersonArray() {
        return personArray;
    }




}



