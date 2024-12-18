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