import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Book theFall = new Book("The fall", "Albert Camus", 147, "Philosophical novel", 1956);
        Book fightClub = new Book("Fight club", "Chuck Palahniuk", 208, "Satire", 2002);
        Book archOfTriumph = new Book("Arch of Triumph", "Remarque", 512, "Historical", 1945);
        Book theCastle = new Book("The Castle", "Franz Kafka", 480, "Philosophical novel", 1926);
        Book thusSpakeZarathustra = new Book("Thus Spake Zarathustra", "Friedrich Nietzsche", 320, "Philosophical novel", 1883);

        HashMap <String, Book> books = new HashMap<>();

        books.put(theFall.getName(), theFall);
        books.put(fightClub.getName(), fightClub);
        books.put(archOfTriumph.getName(), archOfTriumph);
        books.put(theCastle.getName(), theCastle);
        books.put(thusSpakeZarathustra.getName(), thusSpakeZarathustra);

        int inputNum;
        String inputName;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("----------MENU----------");
            System.out.println("PRESS 1 TO ADD BOOK");
            System.out.println("PRESS 2 TO VIEW BOOK");
            System.out.println("PRESS 3 FOR EXIT");
            System.out.println("------------------------");
            inputNum = Integer.parseInt(scanner.nextLine());
            if (inputNum == 1){
                Book otherBook = new Book();
                System.out.println("Please  enter  the  name");
                otherBook.setName(scanner.nextLine());
                System.out.println("Please  enter  author");
                otherBook.setAuthor(scanner.nextLine());
                System.out.println("Please  enter  the  number  of  pages");
                otherBook.setNumberOfPages(Integer.parseInt(scanner.nextLine()));
                System.out.println("Please  enter  the  genre");
                otherBook.setGenre(scanner.nextLine());
                System.out.println("Please  enter  publishing  year");
                otherBook.setYear(Integer.parseInt(scanner.nextLine()));

                books.put(otherBook.getName(), otherBook);
                System.out.println("The  book  was  successfully  added !");
            }
            if (inputNum == 2){
                System.out.println("Please  enter  book  name");
                inputName = scanner.nextLine();
                if (books.containsKey(inputName)){
                    books.get(inputName).displayDetails();
                }
                else {
                    System.out.println("Book  doesn't exist, please add it");
                }
            }
            else
                continue;
        }
        while (inputNum != 3);
        System.out.println("EXIT!");
    }
}
