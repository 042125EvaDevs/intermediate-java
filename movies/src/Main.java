import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        System.out.print(" Movie Management System ");
        System.out.print("\n--------------------------------------------------------|\n");

        //Prints out list of protagonist and their age.
      //  List<Person> people = Person.getPersons();
       // Consumer<Person> printPerson = System.out::println;
      //  Person.getPersons().forEach(printPerson);

        Scanner sc = new Scanner(System.in);

        System.out.print("Movie Choices: Mission Impossible, Taken, The Bourne Identity, \n" +
                "Dr. No, The Equalizer,John Wick, Die Hard, Blade.\n\n");
        System.out.print("Enter a movie title from the list to view it's protagonist: ");
        String input = sc.nextLine();
        Movies movies = new Movies();
        HashMap<String, String> film = movies.getFilm();

        switch (input) {
            case "Mission Impossible":
                System.out.println("Protagonist for Mission Impossible is " + film.get("Mission Impossible"));
                break;
            case "Taken":
                System.out.println("Protagonist for Taken is " + film.get("Taken"));
                break;
            case "The Bourne Identity":
                System.out.println("Protagonist for The Bourne Identity is " + film.get("The Bourne Identity"));
                break;
            case "Dr. No":
                System.out.println("Protagonist for Dr. No is " + film.get("Dr. No"));
                break;
            case "The Equalizer":
                System.out.println("Protagonist for The Equalizer is " + film.get("The Equalizer"));
                break;
            case "John Wick":
                System.out.println("Protagonist for John Wick is " + film.get("John Wick"));
                break;
            case "Die Hard":
                System.out.println("Protagonist for Die Hard is " + film.get("Die Hard"));
                break;
            case "Blade":
                System.out.println("Protagonist for Blade is " + film.get("Blade"));
                break;
        }

        System.out.print("Enter a protagonist name to get their quote: ");
        String input2 = sc.nextLine();
        CharacterQuote quote = new CharacterQuote();

        switch (input2) {
            case "Ethan Hunt":
                quote.ethanHuntSlogan();
                break;
            case "Bryan Mills":
                quote.bryanMillsSlogan();
                break;
            case "Jason Bourne":
                quote.jasonBourneSlogan();
                break;
            case "James Bond":
                quote.jamesBondSlogan();
                break;
            case "Robert McCall":
                quote.robertMcCall();
                break;
            case "John Wick":
                quote.johnWickSlogan();
                break;
            case "John McClane":
                quote.johnMcClaneSlogan();
                break;
            case "Eric Brooks":
                quote.ericBrooksSlogan();
                break;
        }
        System.out.print("Enter a protagonist's name to view their primary weapon in their film: ");
        String input3 = sc.nextLine();
        Sword sword = new Sword();
        Beretta92FS beretta92 = new Beretta92FS();
        PitViperPistol pitViperPistol = new PitViperPistol();
        SigSauerP226r sigSauerP226r = new SigSauerP226r();
        WaltherPPK ppk = new WaltherPPK();
        WaltherPPKS ppks = new WaltherPPKS();

        switch (input3) {
            case "Ethan Hunt", "Bryan Mills", "John McClane":
                beretta92.display();
                break;
            case "Jason Bourne":
                sigSauerP226r.display();
                break;
            case "James Bond":
                ppk.display();
                break;
            case "Robert McCall":
                ppks.display();
                break;
            case "John Wick":
                pitViperPistol.display();
                break;
            case "Eric Brooks":
                sword.display();
                break;
        }

      /*  System.out.print("\n--------------------------------------------------------|\n");
        //Prints a list of protagonist over 50.
        Person.overFifty(people).forEach(printPerson); */
    }
}
