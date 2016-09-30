package exercises;

import objects.Animal;
import objects.Customer;
import objects.Employee;
import objects.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by nxtlvl on 9/30/2016.
 */
public class MyCollecton {

    public static void variables(){
        /* -----INTRODUCING CODING BASICS----- */

        int firstNum, secondNum;
        float resultNum;
        byte byteVariable = 109;
        long largeDecimalVariableUpTo = 8732768487638648319L;
        long largeDecimalVariableFrom = -8737483298974632746L;
        double doubleVariables = 81273.2138;
        char singleChar = '\u0041';
        boolean isTrueOrFalse = true;
        //int firstNum= 8767648;
        long firstLong = 947676275248L;

        String myFirstWord = "That's Me!";

        firstNum = 98;
        secondNum = 64;

        resultNum = firstNum * secondNum;
        firstLong = firstNum;

        System.out.println(myFirstWord);
        //System.out.println(byteVariable);
        System.out.println(largeDecimalVariableFrom); //Given value is too large.
        //System.out.println(largeDecimalVariableUpTo); //Given value is too large.
        //System.out.println(doubleVariables);
        System.out.println(isTrueOrFalse);
        System.out.println(firstLong);

    }

    public static void encapsulation(){
        /* -----ENCAPSULATION----- */

        /*Person person = new Person();
        person.setFirstName("Daniel April");
        String fName = person.getFirstName();

        person.setLastName("Tingal");
        String lName = person.getLastName();

        System.out.println(fName + " " + lName);*/
    }

    public static void inheritance(){
        /*-----INHERITANCE-----*/

        Employee employee = new Employee();
        employee.setFirstName("Daniel April");
        //String fName = person.getFirstName();

        employee.setLastName("Tingal");
        //String lName = person.getLastName();

        //System.out.println(fName);

        String introduce = employee.introduceYourself();
        System.out.println(introduce);
    }

    public static void homeWork(){
         /*TODO Create an animal class with 3 properties and getters and setters(different datatype: int, String, boolean)*/

        Animal myPet = new Animal();
            myPet.setAnimalType("Birds");
            String type = myPet.getAnimalType();

            myPet.setEggsLay(9);
            int eggsLay = myPet.getEggsLay();

            myPet.setAnimalDoLayEggs(true);
            boolean doLayEggs = myPet.isAnimalDoLayEggs();

        System.out.println("Type of Animal: " + type);
        System.out.println("Animal lay eggs: " + doLayEggs);
        System.out.println("Eggs laid: " + eggsLay);
    }

    public static void overRiding(){
        /* -----OVERRIDING----- */
        /*Person person = new Person();
        person.setFirstName("Daniel");
        person.setLastName("Tingal");
        String introduceSelf = person.introduceYourself();
        System.out.println(introduceSelf);
        */
        Employee employee = new Employee();
        employee.setFirstName("April");
        employee.setLastName("Docallos");
        employee.setCompanyName("CITE");
        String introduceEmployee = employee.introduceYourself();
        System.out.println(introduceEmployee);

        Customer customer = new Customer();
        customer.setFirstName("Dani El");
        customer.setLastName("Green");
        customer.setCustomer("Regular customer");
        String introduceCustomer = customer.introduceYourself();
        //System.out.println(introduceCustomer);

        /* -----OVERLOADING----- */
        String food = customer.productType("Chicken curry");
        System.out.println(introduceCustomer + " " + food);
    }

    public static void constructor(){
        /* -----CONSTRUCTOR----- */
        /*Person person1 = new Person("Daniel","Docallos");*/
    }

    public static void condition(){
        /* -----CONDITION----- */

        String name = "Daniel";

        if (name == "April") {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void loops(){
        /* -----while Loop-----*/
        int n1 = 1;
        while (n1 < 7) {
            System.out.print("[" + n1 + "]");
            n1++;
        }
        int n = 1;
        int sum = 0;
        while (n <= 6){
            sum += n;
            n++;
        }
        System.out.println(sum);

        /* -----DO-WHILE Loop */
        int m = 1;
        do{
            System.out.print("[" + m + "]");
            m++;
        }while(m < 7);

        /* -----FOR Loop----- */
        int in = 1;
        for(in = 1; in < 7; in++){
            System.out.print("[" + in + "]");
        }

        int i = 1;
        int sumMore = 0;
        for (i = 1; i <= 6; i++){
            sumMore += i;
        }
        System.out.println(sumMore);
    }

    public static void arrayExample(){
        /* -----Array----- */
        String[] myInstructor = {"Niel","Bert","Rad"};
        for( int i = 0; i < 3; i++){
            if(myInstructor[i] == "Bert"){
                myInstructor[i] = "Amante";
            }
                System.out.println(myInstructor[i]);
        }
    }

    public static void arrayDislay(){
        List<String> friends = new ArrayList<String>();
        friends.add("Peter");
        friends.add("Alipar");
        friends.add("Loki");

        int myFriendsSize = friends.size();
        Random random = new Random();
        int rndFriends = random.nextInt(myFriendsSize);
        for(int i = 0; i < rndFriends; i++) {
            String friendsValue = (friends.get(i));
            System.out.println(friendsValue);
        }
    }

    public static String myFriends(){
        List<String> myFriend = new ArrayList<String>();
        myFriend.add("April");
        myFriend.add("Chevy");
        myFriend.add("Daniel");
        myFriend.add("Gin");
        myFriend.add("Stephen");
        myFriend.add("Peter");


        int myFriendsSize = myFriend.size();

        Random random = new Random();
        int randomFriends = random.nextInt(myFriendsSize);

        String myFriendsValue = (myFriend.get(randomFriends));
        return myFriendsValue;

    }

    public static String myGirlFriends(){
        List<String> myGirlFriends = new ArrayList<String>();
        myGirlFriends.add("Cristel");
        myGirlFriends.add("Donalyn");
        myGirlFriends.add("Gillian");
        myGirlFriends.add("Glydyl");
        myGirlFriends.add("Jase");
        myGirlFriends.add("Ken");

        int myGirlFriendsSize = myGirlFriends.size();

        Random random = new Random();
        int randomGirlFriends = random.nextInt(myGirlFriendsSize);

        String girlFriends = myGirlFriends.get(randomGirlFriends);
        return girlFriends;

    }

    public static String relationStatus(){

        List<String> status = new ArrayList<String>();
        status.add(" loves ");
        status.add(" hates ");
        status.add(" is friendzoned by ");

        int statusSize = status.size();

        Random random = new Random();
        int randomStatus = random.nextInt(statusSize);

        String statusOutput = status.get(randomStatus);
        return statusOutput;
    }

    public static void getFunctionValues(){
        System.out.println(myFriends() + relationStatus() + myGirlFriends() + ".");
    }

    public static void shuffleArray(){
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("A");
        obj.add("E");
        obj.add("I");
        obj.add("O");
        obj.add("U");
        Collections.shuffle(obj);

        int objSize = obj.size();
        for(int i = 0; i < objSize; i++) {
            System.out.println(obj.get(i));
        }
    }
}
