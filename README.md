## Отчет по лабораторной работе № 3

#### № группы: `ПМ-2401`

#### Выполнил: `Володченко Анна Андреевна`

#### Вариант: `5`

### Cодержание:

- [Постановка задачи](#1-постановка-задачи)
- [Алгоритм](#2-алгоритм)
- [Программа](#3-программа)
- [Анализ правильности решения](#5-анализ-правильности-решения)

### 1. Постановка задачи

#### Список литературы
 Краткое описание:
Разработать программу для управления списком книг с возможностью отслеживания
статуса их прочтения и расчёта времени, необходимого для завершения. Реализовать
функции анализа скорости чтения и прогнозирования оставшегося времени на основе
текущего прогресса.
Описание функционала
1. Создание пользователя
   Пользователь вводит имя и скорость чтения (в страницах за час или за 15 минут).
   Система сохраняет эти данные.
2. Создание списка книг
   Пользователь вводит список книг с указанием их названий, авторов, количества
   страниц и статуса прочитано/не прочитано.
3. Вывод информации о пользователе
   Отображение имени пользователя и его скорости чтения.
4. Расчёт времени на чтение книги
   Пользователь может узнать, сколько времени потребуется для прочтения конкрет
   ной книги при текущей скорости чтения.
5. Прочитать книгу
   Обновление статуса книги на «прочитано» и добавление затраченного времени в
   общий счётчик.
6. Расчёт времени на оставшиеся книги
   Подсчёт времени, необходимого для прочтения всех непрочитанных книг в списке.
7. Изменение скорости чтения
   Пользователь может изменить свою скорость чтения. Изменение может быть огра
   ничено диапазоном от 10 до 25
8. Вывод списка прочитанного
   Система отображает список всех книг, отмеченных как «прочитано».
9. Подсчёт затраченного времени
   Пользователь может узнать общее количество времени, потраченное на чтение.
10. Подсчёт процента прочитанного
    Вычисление процента прочитанных книг относительно общего числа книг. Это
    может быть выражено как в процентах страниц, так и в процентах времени.
11. Прогноз изменения скорости чтения
    Пользователь может задать изменение скорости чтения (например, +2 страницы
    в час) и получить расчёт того, насколько быстрее он закончит чтение конкретной
    книги или всего списка.
12. Расчёт по времени чтения в день
    Пользователь может задать время (в минутах) чтения в день, чтобы узнать, за
    сколько дней он завершит чтение конкретной книги или всего списка.

### 2. Алгоритм 
#### Описание классов и их методов

1. **Класс user**
    1. Описание:
        Класс user создан для представления пользователя системы, который читает книги.  
        Он отслеживает имя пользователя, скорость чтения, а также времени, затраченного на чтение.

    2. Поля:
       - name — имя пользователя.
       - readingSpeed — скорость чтения в страницах в час.
       - totalTimeSpent — общее время, затраченное пользователем на чтение.

    3. Методы:
       - getReadingSpeed — возвращает скорость чтения.
       - setReadingSpeed(int speed) — задает новую скорость чтения
       - addTimeSpent(double time) — добавляет время, затраченное на чтение книги.
       - getTotalTimeSpent — возвращает общее время, потраченное на чтение.
       - Name — возвращает имя пользователя.

    4. Зачем нужен:
       - Для хранения и управления данными о пользователе и его скорости чтения.
       - Отслеживает накопленную статистику чтения.
2. **Класс Book**
   1. Описание:
        Класс Book используется для представления книги, которую пользователь может прочитать.

   2. Поля:
      - title — название книги.
      - author — автор книги.
      - pages — количество страниц в книге.
      - isRead — флаг, указывающий, была ли книга прочитана.

   3. Методы:
      - getTitle — возвращает название книги.
      - getPages — возвращает количество страниц.
      - isRead — проверяет, прочитана ли книга.
      - setRead(boolean read) — меняет статус книги (прочитана/не прочитана).
      - toString — возвращает строковую информацию о книге (название, автор, количество страниц, статус прочтения).

   4. Зачем нужен:
      - Для создания объектов книг.
      - Помогает управлять статусом чтения и хранить метаданные книги.

3. **Класс BookList**

   1. Описание:
    Класс BookList предназначен для хранения и управления коллекцией книг.

   2. Поля:
      - books — массив объектов Book.
      - size — текущее количество книг в списке.

   3. Методы:
      - addBook— добавляет новую книгу в коллекцию. Если массив переполняется, его размер увеличивается в два раза.
      - getBook— ищет и возвращает книгу по названию. Возвращает null, если книга не найдена.
      - displayBooks — выводит список книг.
      - timeOneBook — расчёт времени на прочтение конкретной книги.
      - displayReadBooks — вывод списка прочитанных книг.
      - countReadBooks — считает количество прочитанных книг.
      - AllCount — считает количество книг.
      - getTotalPages — считает количество всех страниц.
      - getReadPages — считает количество прочитанных страниц.
   4. Зачем нужен:
      - Для управления списком книг (добавление, получение книги по названию).
      - Позволяет хранить большое количество книг с возможностью увеличивать размер хранилища.

4. **Класс Test**
    - Основная цель класса Test — это объединить объекты программы и показать функциональность программы: создание пользователя, добавление книг в библиотеку, чтение, расчет времени, вывод информации о книгах и прогресс чтения.
    - Метод main является входом в программу. Именно он запускается при выполнении кода. Задачи метода main:
      1. Создать пользователя (объект User).
      2. Создать и наполнить список книг (объект BookList).
      3. Осуществить взаимодействие между пользователем и библиотекой, включая чтение книг, расчеты времени и отображение информации
      *Логика в методе* 
         1. Создание пользователя
            Создается объект класса User со значениями имени и скорости чтения.
         2. Создание списка книг
            Создается объект BookList и добавляются книги.
         3. Отображение книг
            Печатается список всех добавленных книг.
         4. Расчет времени на чтение определенной книги
            Проводится расчет времени, необходимого пользователю для прочтения определенной книги.
         5.  Прочтение книги
             Моделируется процесс "прочтения" книги, которая ранее еще не была прочитана.
         6. Расчет времени на оставшиеся непрочитанные книги
            Определяется общее время, которое потребуется для прочтения всех оставшихся книг.
         7. Изменение скорости чтения
            Пользователь меняет свою скорость чтения.
         8. Вывод прочитанных книг
            Показывается список книг, которые были отмечены как прочитанные.
         9. Подсчет времени, потраченного на чтение
            Выводится общее время, которое пользователь потратил, читая книги.
         10. Подсчет процента прочитанного
             Рассчитывается процент чтения (в книгах/в страницах).
         11. Прогноз изменения скорости чтения
             Дается прогноз на то, как изменится время чтения книги при изменении скорости.
### 3. Программа

```java
class User{
    //Создаём поля
    private String name;
    private int readingSpeed; // скорость чтения (страниц в час)
    private double totalTimeSpent; // общее затраченное время
    //Конструктор
    public User(String name, int readingSpeed) {
        this.name = name;
        this.readingSpeed = readingSpeed;
        this.totalTimeSpent = 0;
    }
    // Получить скорость чтения
    public int getReadingSpeed() {
        return readingSpeed;
    }
    // Установка новой скорости чтения (10–25 страниц/час)
    public void setReadingSpeed(int speed) {
        if (speed >= 10 && speed <= 25) {
            this.readingSpeed = speed;
        } else {
            System.out.println("Скорость чтения должна быть от 10 до 25 страниц в час.");
        }
    }
    // Добавление затраченного времени
    public void addTimeSpent(double time) {
        this.totalTimeSpent += time;
    }
    // Получение общего времени на чтение
    public double getTotalTimeSpent() {
        return totalTimeSpent;
    }
    // Вывод информации о пользователе
    public String Name() {
        return name;
    }
}
class Book {
    //Создаём поля
    private String title;
    private String author;
    private int pages;
    private boolean isRead;
    //Конструктор
    public Book(String title, String author, int pages, boolean isRead) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isRead = isRead;
    }
    //Получиить название книги
    public String getTitle() {
        return title;
    }
    //Получить количество страниц в книге
    public int getPages() {
        return pages;
    }
    //ПРочитана книга или нет
    public boolean isRead() {
        return isRead;
    }
    //Меняет статус книги
    public void setRead(boolean read) {
        isRead = read;
    }
    //Возвращает информацию о книге
    @Override
    public String toString() {
        if(isRead)
            return "Книга: " + title + ", Автор: " + author + ", Страниц: " + pages + ",Статус:Прочитано";
        else return "Книга: " + title + ", Автор: " + author + ", Страниц: " + pages + ",Статус:Не прочитано";
    }
}
class BookList {
    private Book[] books;
    private int size;

    public BookList() {
        books = new Book[3]; // Начальный размер массива
        size = 0;
    }

    public void addBook(Book book) {
        if (size == books.length) {
            // Расширение массива
            Book[] newBooks = new Book[books.length * 2];
            for (int i = 0; i < size; i++) {
                newBooks[i] = books[i];
            }
            books = newBooks;
        }
        books[size] = book;
        size++;
    }
    // Получение книги
    public Book getBook(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle() == title){
                return books[i];
            }
        }
        return null; // Если книга не найдена
    }
    //Ввыводит список книг
    public void displayBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
    // Расчёт времени на прочтение конкретной книги
    public double timeOneBook(int readingSpeed) {
        double totalTime = 0;
        for (int i = 0; i < size; i++) {
            if (!books[i].isRead()) {
                totalTime += (double) books[i].getPages() / readingSpeed;
            }
        }
        return totalTime;
    }
    // Вывод списка прочитанных книг
    public void displayReadBooks() {
        for (int i = 0; i < size; i++) {
            if (books[i].isRead()) {
                System.out.println(books[i]);
            }
        }
    }
    //Количество прочитанных книг
    public int countReadBooks() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].isRead()) {
                count++;
            }
        }
        return count;
    }
    //Количество книг
    public int AllCount() {
        int allcount = 0;
        for (int i = 0; i < size; i++) {
            allcount++;
        }
        return allcount;
    }
    //Количество всех страниц
    public int getTotalPages() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += books[i].getPages();
        }
        return sum;
    }
    //Количество прочитанных страниц
    public int getReadPages() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if(books[i].isRead())
                sum += books[i].getPages();
        }
        return sum;
    }
}
```
### 4. Математическая модель

 В своей программе я не использую никаких формул

### 5. Анализ правильности решения
- **Input**:
```java
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

```
- **Output**:
          ```
    Пользователь создан: Анна, Скорость чтения: 20 стр/час
    Список книг создан:
    Книга: 'Анна', Автор: Александра Никитична Анненская, Страниц: 120,Статус:Прочитано
    Книга: 'Зачем кроту очки, если он и так слепой?', Автор: Евгений Лукин, Страниц: 10,Статус:Прочитано
    Книга: 'В поисках утраченного времени', Автор: Марсель Пруст, Страниц: 1247,Статус:Не прочитано
    Книга: 'Денискины рассказы', Автор: Виктор Драгунский, Страниц: 271,Статус:Не прочитано
    Книга: 'Забавы ради', Автор: Натализа Кофф, Страниц: 260,Статус:Прочитано
    Книга: 'Васюткино озеро', Автор: Виктор Астафьев, Страниц: 231,Статус:Прочитано
    Информация о пользователе:
    Имя: Анна, Скорость: 20
    На прочтение книги'В поисках утраченного времени' потребуется 62,35 часов
    Книга 'Денискины рассказы' отмечена как прочитанная, потрачено 13,55 часов.
    На оставшиеся непрочитанные книги потребуется 62,35 часов
    Скорость чтения должна быть от 10 до 25 страниц в час.
    Скорость чтения изменена. Новая скорость: 20 стр/час
    Прочитанные книги:
    Книга: 'Анна', Автор: Александра Никитична Анненская, Страниц: 120,Статус:Прочитано
    Книга: 'Зачем кроту очки, если он и так слепой?', Автор: Евгений Лукин, Страниц: 10,Статус:Прочитано
    Книга: 'Денискины рассказы', Автор: Виктор Драгунский, Страниц: 271,Статус:Прочитано
    Книга: 'Забавы ради', Автор: Натализа Кофф, Страниц: 260,Статус:Прочитано
    Книга: 'Васюткино озеро', Автор: Виктор Астафьев, Страниц: 231,Статус:Прочитано
    Общее время, потраченное на чтение: 13,55 часов
    Прочитано 83,33% книг и 41,70% страниц
    С новой скоростью чтения 22 стр/час книгу можно прочитать за 12,32 часов
    На чтение оставшихся книг потребуется 3,12 дней при ежедневном чтении 60 минут.
          ```
