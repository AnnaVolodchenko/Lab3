public class Test {
    public static void main(String[] args) {
        // Создание пользователя
        User user = new User("Анна", 20);

        System.out.println("Пользователь создан: " + user.Name() + ", Скорость чтения: " + user.getReadingSpeed() + " стр/час");

        // Создание списка книг
        BookList library = new BookList();
        library.addBook(new Book("'Анна'", "Александра Никитична Анненская", 120,true));
        library.addBook(new Book("'Зачем кроту очки, если он и так слепой?'", "Евгений Лукин", 10,true));
        library.addBook(new Book("'В поисках утраченного времени'", "Марсель Пруст", 1247,false));
        library.addBook(new Book("'Денискины рассказы'", "Виктор Драгунский", 271,false));
        library.addBook(new Book("'Забавы ради'", "Натализа Кофф", 260,true));
        library.addBook(new Book("'Васюткино озеро'", "Виктор Астафьев", 231,true));
        System.out.println("Список книг создан:");
        library.displayBooks();

        // Вывод информации о пользователе
        System.out.println("Информация о пользователе:");
        System.out.println("Имя: " + user.Name() + ", Скорость: " + user.getReadingSpeed());

        // 4. Расчёт времени на прочтение книги
        String bookOne = "'В поисках утраченного времени'";
        Book book = library.getBook(bookOne);
        if (book != null) {
            double time = (double) book.getPages() / user.getReadingSpeed();
            System.out.printf("На прочтение книги"+ bookOne + " потребуется %.2f часов%n",time);
        } else {
            System.out.println("Книга "+ bookOne +" не найдена.");
        }

        // 5. Прочитать книгу

        String bookToRead = "'Денискины рассказы'";
        book = library.getBook(bookToRead);
        if (book != null && !book.isRead()) {
            double timeSpent = (double) book.getPages() / user.getReadingSpeed();
            user.addTimeSpent(timeSpent);
            book.setRead(true);
            System.out.printf("Книга " + bookToRead +  " отмечена как прочитанная, потрачено %.2f часов.%n", timeSpent);
        }

        // 6. Расчёт времени на оставшиеся книги
        double remainingTime = library.timeOneBook(user.getReadingSpeed());
        System.out.printf("На оставшиеся непрочитанные книги потребуется %.2f часов%n", remainingTime);

        // 7. Изменение скорости чтения
        user.setReadingSpeed(5);
        System.out.println("Скорость чтения изменена. Новая скорость: " + user.getReadingSpeed() + " стр/час");

        // 8. Вывод списка прочитанного
        System.out.println("Прочитанные книги:");
        library.displayReadBooks();

        // 9. Подсчёт затраченного времени
        System.out.printf("Общее время, потраченное на чтение: %.2f часов%n", user.getTotalTimeSpent());

        // 10. Подсчёт процента прочитанного
        int totalBooks = library.countReadBooks();
        int totalPages = library.getTotalPages();
        int readPages = library.getReadPages();
        double percentBooks = totalBooks * 100.0 /library.AllCount() ; // количество прочитанных книг из общего числа
        double percentPages = readPages * 100.0 / totalPages;// количество прочитанных страниц из общего числа
        System.out.printf("Прочитано %.2f%% книг и %.2f%% страниц%n", percentBooks, percentPages);

        // 11. Прогноз изменения скорости чтения
        int speedChange = 2;
        int newSpeed = user.getReadingSpeed() + speedChange;
        if (newSpeed >= 10 && newSpeed<= 25) {
            double newTime = (double) book.getPages() / newSpeed;
            System.out.printf("С новой скоростью чтения %d стр/час книгу можно прочитать за %.2f часов%n", newSpeed, newTime);
        } else {
            System.out.println("Новая скорость выходит за пределы допустимых значений.");
        }

        // 12. Расчёт времени чтения в день
        int dailyReadingTime = 60; // минут в день
        double dailyPages = (double) (dailyReadingTime * user.getReadingSpeed()) / 60;
        double daysNeeded = remainingTime / dailyPages;
        System.out.printf("На чтение оставшихся книг потребуется %.2f дней при ежедневном чтении %d минут.%n", daysNeeded, dailyReadingTime);
    }
}
