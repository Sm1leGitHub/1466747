public class Book {
    static int numberOfBooks = 0;
    private String name;
    private String nameOfAuthor;
    private int yearOfCreating;
    public Book(String name, String nameOfAuthor, int yearOfCreating) {
        this.name = name;
        this.nameOfAuthor = nameOfAuthor;
        this.yearOfCreating = yearOfCreating;
        numberOfBooks++;
    }


    public Book(String name) {
    }

    public Book() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    public int getYearOfCreating() {
        return yearOfCreating;
    }

    public void setYearOfCreating(int yearOfCreating) {
        this.yearOfCreating = yearOfCreating;
    }

    public static void getInfo() {
    }


    public static void numberOfBooks() {
        System.out.println(numberOfBooks);
    }

    public static void getNumberOfBooks() {
        System.out.println(numberOfBooks++);
    }
}
