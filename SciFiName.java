
/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 * 
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName   
{
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * 
     
     */
    public static void main()
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name
        String scifiFirst = firstName.substring(0, 3) + lastName.substring(0,2);
        String firstnameLetter = scifiFirst.substring(0,1).toUpperCase();
        scifiFirst = firstnameLetter + scifiFirst.substring(1);
        String scifiLast = city.substring(0,2) + school.substring(0,3);
        String lastnameLetter = scifiLast.substring(0,1).toUpperCase();
        scifiLast = lastnameLetter + scifiLast.substring(1);
        String scifiName = (scifiFirst + " " + scifiLast).toLowerCase();
        int location = (int)(Math.random() * (relativeName1.length()-1) + 1);
        String origin1 = relativeName1.substring(location);
        int location2 = (int)(Math.random() * (relativeName2.length()-1) + 1);
        String origin2 = relativeName2.substring(location2);
        String originPlace = (origin1 + origin2).toLowerCase();
        String originLetter = originPlace.substring(0,1).toUpperCase();
        originPlace = originLetter + originPlace.substring(1);
        System.out.println("Hello " + scifiFirst + " " + scifiLast + " of " + originPlace+ ". Welcome!");
        
    }
}
