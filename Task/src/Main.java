import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        menu(scanner, books);

    }

    private static void menu(Scanner scanner, ArrayList<Book> books) {
        System.out.println("""
                1.Добавить книгу
                2.Просмотреть книги
                3.Выход
                """);
        System.out.println("Выбери пункт меню: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("Введите жанр книги, который хотите добавить(Роман,Детектив,Фантастика");
                String name = scanner.nextLine();
                System.out.println("Введите название книги");
                String nameOfFantastic = scanner.nextLine();
                System.out.println("Введите имя автора");
                String nameOfAuthor = scanner.nextLine();
                System.out.println("Введите год создания");
                int yearOfCreating = scanner.nextInt();
                switch (name.toLowerCase()) {
                    case "фантастика":
                        System.out.println("Тут мы добавляем фантастику");
                        System.out.println("Введите мир, в котором происходят все события");
                        String world = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println("Введите уникальные элементы");
                        String uniqueElement = scanner.nextLine();
                        System.out.println("Введите главную идею произведения");
                        String theCentralIdea = scanner.nextLine();
                        Fantastic fantastic = new Fantastic(nameOfFantastic, nameOfAuthor, yearOfCreating, world, uniqueElement, theCentralIdea);
                        System.out.println("Название книги- " + nameOfFantastic + " Имя автора- " + nameOfAuthor +
                                " Год создания- " + yearOfCreating + " Мир в котором происходят события- " + world
                                + " Уникальные элементы- " + uniqueElement + " Главная идея-" + theCentralIdea);
                        books.add(fantastic);
                        Main.menu(scanner,books);
                        break;
                    case "Роман":
                        System.out.println("Тут мы добавляем роман");
                        System.out.println("Введите мир, в котором происходят все события");
                        String world1 = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println("Введите уникальные элементы");
                        String uniqueElement1 = scanner.nextLine();
                        System.out.println("Введите главную идею произведения");
                        String theCentralIdea1 = scanner.nextLine();
                        Novel novel = new Novel(nameOfFantastic, nameOfAuthor, yearOfCreating, world1, uniqueElement1, theCentralIdea1);
                        System.out.println("Название книги- " + nameOfFantastic + " Имя автора- " + nameOfAuthor +
                                " Год создания- " + yearOfCreating + " Мир в котором происходят события- " + world1
                                + " Уникальные элементы- " + uniqueElement1 + " Главная идея-" + theCentralIdea1);
                        books.add(novel);
                        Main.menu(scanner,books);
                        break;
                    case "Детектив":
                        System.out.println("Введите мир, в котором происходят все события");
                        String world2 = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println("Введите уникальные элементы");
                        String uniqueElement2 = scanner.nextLine();
                        System.out.println("Введите главную идею произведения");
                        String theCentralIdea2 = scanner.nextLine();
                        Detective detective = new Detective(nameOfFantastic, nameOfAuthor, yearOfCreating, world2, uniqueElement2, theCentralIdea2);
                        System.out.println("Название книги- " + nameOfFantastic + " Имя автора- " + nameOfAuthor +
                                " Год создания- " + yearOfCreating + " Мир в котором происходят события- " + world2
                                + " Уникальные элементы- " + uniqueElement2 + " Главная идея-" + theCentralIdea2);
                        books.add(detective);
                        Main.menu(scanner,books);
                        break;

                    default:
                        System.out.println("Неверно выбран пункт меню");

                }
            case "2":
                System.out.println(books);
        }
    }
}