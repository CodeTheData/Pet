package NewArenaAfk;

import java.util.ArrayList;

public class ProgramGame {
    public static void main(String[] args) {
        Unit unit1 = new War("Hero1", Role.WAR, 3);
        Unit unit2 = new Mag("Hero2", Role.MAG, 5);
        Unit unit3 = new Mag("Hero2", Role.MAG, 1);

        ArrayList<Unit> list = new ArrayList<Unit>();
        list.add(unit1);
        list.add(unit2);
        list.add(unit3);

        unit1.printInfo();
        unit2.printInfo();

        unit1.fight(unit1, unit2);
    }
}

enum Role {
    WAR("Воин"), MAG("Маг");

    private String role;

    Role(String role){
        this.role = role;
    }

    public String getRole(){ return role; }
}

//enum Gun{
//    SWORD("Меч"), MAGIC("Магия"), BLADES("Клинки"), BOW("Лук");
//
//    private String gun;
//
//    Gun(String gun){
//        this.gun = gun;
//    }
//
//    public String getGun(){
//        return gun;
//    }
//}



