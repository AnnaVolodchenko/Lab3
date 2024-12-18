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