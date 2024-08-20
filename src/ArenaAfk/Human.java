package ArenaAfk;

public abstract class Human implements Fighter {

    private String nickname;
    private int hp;
    private int damage;
    boolean isDead;


    public String getNickname() {

        return nickname;
    }

    public void setNickname(String nickname) {

        this.nickname = nickname;
    }

    public int getHp() {

        return hp;
    }

    public void setHp(int hp) {

        this.hp = hp;
    }

    public int getDamage() {

        return damage;
    }

    public void setDamage(int damage) {

        this.damage = damage;
    }

    @Override
    public void takeDamage(Human human) {
        human.setHp(human.getHp() - damage);
        if(human.getHp() <= 0){
            human.isDead = true;
        }
        System.out.println(human.getNickname() + " осталось ХП: " + human.getHp());
    }

    @Override
    public boolean isAlive() {
        return this.hp > 0;
    }



}
