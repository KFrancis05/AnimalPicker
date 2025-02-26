import java.util.Scanner;

public class AnimalPicker {
    Scanner s = new Scanner(System.in);
    boolean question = true;
    
    System.out.println("Which animal would you like to see? Dog or Cat?");
    String answer = s.nextLine();
    s.nextLine();

    while(question){
        if((answer.toLowerCase()).equals("dog")){
            System.out.println("          __\n \\ ______/ V`-,\n  }        /~~\n /_)^ --,r\'\n|b     ");
            question = false;
        }
        else if ((answer.toLowerCase()).equals("cat")){
            System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
            question = false;
        }
        else{
            System.out.println("ERROR: Invalid Option!");
        }
    }
}