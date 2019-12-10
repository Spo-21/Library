public class Book {
    private String name;
    private String author;
    private int numberOfPages;
    private String genre;
    private int year;

    public Book(String name, String author, int numberOfPages, String genre, int year) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.year = year;
    }
    public Book(){}

    //region Seters and Geters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //endregion

    public void displayDetails(){
        System.out.println("Name of the book -  " + name);
        System.out.println("Author -  " + author);
        System.out.println("Number of pages -  " + numberOfPages);
        System.out.println("Genre -  " + genre);
        System.out.println("The book was published in -  " + year);
    }
}
