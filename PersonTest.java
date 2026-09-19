public class PersonTest 
{
    public static void main(String[] args) 
    {
        //person 1
        Person p1 = new Person();

        //setting person 1 values
        p1.setName("Jimmy");
        p1.setAge(31);
        p1.setEmail("jimmy@gmail.com");
        //person 1 display
        System.out.println("Person 1 Information:");
        p1.displayInfo();

        //person 2
        Person p2 = new Person();

        //setting person 2 values
        p2.setName("Carl");
        p2.setAge(94);
        p2.setEmail("carl@gmail.com");
        //person 2 display
        System.out.println("\nPerson 2 Information:");
        p2.displayInfo();
        
    }
    
}
