package ArenaAfk;

public interface  Fighter{

    void takeDamage(Human human);

    boolean isAlive();

    String getNickname();

    //является абстракцией, полные методы не пишу , только объявляю!
    //Контракт поведения или как маркер. Интерфейс лишь описывает, что должно быть!
}
