import java.util.Scanner;

public class AnimalPicker {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Which animal would you like to see? Dog or Cat?");
    String answer = s.nextLine();
    s.nextLine();

    if((answer.toLowerCase()).equals("dog")){
        System.out.println("DOG ASCII ART HERE");
    }
    else if ((answer.toLowerCase()).equals("cat")){
        System.out.println("CAT ASCII ART HERE");
    }
    else{
        System.out.println("ERROR: Invalid Option!");
    }
}