package NewGame;

public class ProgramGame {
    public static void main(String[] args) {
        Player player1 = new Character(Clas.WAR, 100, 2, "Kind");
        player1.initPlayer();
        Player player2 = new Character(Clas.MAG, 80, 5, "Evil");
        player2.initPlayer();

    }
}

enum Clas{
    WAR("Воин"), MAG("Маг"), ASSASIN("Убийца"), ARCHER("Лучник");

    private String clas;

    Clas(String clas){
        this.clas = clas;
    }

    public String getClas(){ return clas; }
}

enum Gun{
    SWORD("Меч"), MAGIC("Магия"), BLADES("Клинки"), BOW("Лук");

    private String gun;

    Gun(String gun){
        this.gun = gun;
    }

    public String getGun(){ return gun; }
}

class Player{
    private Clas clas;
    int hp;
    int damage;

    public String getClas(){
        switch(clas){
            case WAR: return "War";
            case MAG: return "Mag";
            case ASSASIN: return "Assasin";
            case ARCHER: return "Archer";
            default: return "Underfind";
        }
    }
    public int getHp(){
        return hp;
    }

    public void setHp(int hp){
        if(hp > 0 && hp <= 100){
            this.hp = hp;
        }
    }

    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage){
        if(damage > 0 && damage <= 5){
            this.damage = damage;
        }
    }

    Player(Clas clas, int hp, int damage){
        this.clas = clas;
        this.hp = hp;
        this.damage = damage;
    }

    public void initPlayer(){
        System.out.printf("Player clas:" + clas.getClas() + "\ncharacteristics: hp(%d) and damage(%d) \n",hp, damage);
    }
}

class Character extends Player{
    private String aspect;

    public String getAspect(){
        return aspect;
    }

    Character(Clas clas, int hp, int damage, String aspect){
        super(clas, hp, damage);
        this.aspect = aspect;
    }

    @Override
    public void initPlayer(){
        super.initPlayer();
        System.out.printf("Aspect %s \n\n", aspect);
    }
}