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
