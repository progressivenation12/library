package org.karasev.tech;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.add("Head First Java", "Кэти Сиерра и Берт Бейтс");
        library.add("Java для чайников", "Барри Берд");
        library.add("Java: Основы программирования для абсолютных начинающих", "Натан Кларк");
        library.add("Think Java: How to Think Like a Computer Scientist", "Аллен Дауни и Крис Мэйфилд");

        System.out.println("Все книги в библиотеке:");
        library.findAllBooks().forEach(System.out::println);

        int idToFind = 4;
        library.findById(idToFind)
                .ifPresentOrElse(book -> System.out.println("Найдена книга с ID " + idToFind + ":\n" + book),
                        () -> System.out.println("Книга с ID " + idToFind + " не найдена")
                );

        int idToDelete = 2;
        if (library.delete(idToDelete)) {
            System.out.println("Книга с ID " + idToDelete + " удалена.");
        } else {
            System.out.println("Книга с ID " + idToDelete + " не найдена для удаления.");
        }
    }
}
