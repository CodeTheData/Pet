package NewArenaAfk;

public class Unit {

    private String name;
    private Role role;
    private int hp = 100;
    private int damage = 1;

    Unit(String name, Role role, int damage){
        this.name = name;
        this.role = role;
        setDamage(damage);
    }

    public Role getRole(){
        return role;
    }

    public void setRole(Role role){
        this.role = role;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
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

    public void printInfo(){
        System.out.printf("Nickname: %s\nRole: %s\nCharacteristic: HP(%d) and Damage(%d)\n",
                name, role.getRole(), hp, damage);
    }

    public void fight(Unit unit1, Unit unit2){
        String winner = "";

        while(unit1.hp >= 0 && unit2.hp >= 0) {
            unit1.hp = Math.max(unit1.hp - unit2.damage, 0);
            unit2.hp = Math.max(unit2.hp - unit1.damage, 0);

            System.out.printf("%s HP: %d\n%s HP: %d\n", unit1.name, unit1.hp, unit2.name, unit2.hp);

            unit1.hp -= unit2.damage;
            unit2.hp -= unit1.damage;

            if(unit1.hp == 0 || unit2.hp == 0){
                winner = unit1.hp == 0 ? unit2.name : unit1.name;
            }
        }
        System.out.println(winner);
    }

}
