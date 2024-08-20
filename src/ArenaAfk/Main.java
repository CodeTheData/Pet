package ArenaAfk;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Arena arena = new Arena("Ринг");

        DuelArena duel = new DuelArena();

        Human mag = new Mag();
        mag.setNickname("Бот1");
        mag.setHp(70);
        mag.setDamage(5);
        Human mag1 = new Mag();
        mag1.setNickname("Бот2");
        mag1.setHp(80);
        mag1.setDamage(4);
        Human mag2 = new Mag();
        mag2.setNickname("Бот3");
        mag2.setHp(100);
        mag2.setDamage(5);
        Human mag3 = new Mag();
        mag3.setNickname("Бот4");
        mag3.setHp(100);
        mag3.setDamage(4);
        Human mag4 = new Mag();
        mag4.setNickname("Бот5");
        mag4.setHp(100);
        mag4.setDamage(2);
        Human warrior = new Warrior();
        warrior.setNickname("Бот6");
        warrior.setHp(120);
        warrior.setDamage(2);
        Human warrior1 = new Warrior();
        warrior1.setNickname("Бот7");
        warrior1.setHp(95);
        warrior1.setDamage(5);
        Human warrior2 = new Warrior();
        warrior2.setNickname("Бот8");
        warrior2.setHp(100);
        warrior2.setDamage(3);
        Human warrior3 = new Warrior();
        warrior3.setNickname("Бот9");
        warrior3.setHp(100);
        warrior3.setDamage(5);
        Human warrior4 = new Warrior();
        warrior4.setNickname("Бот10");
        warrior4.setHp(100);
        warrior4.setDamage(4);

        arena.findHuman(mag);
        arena.findHuman(warrior);
        arena.findHuman(mag1);
        arena.findHuman(warrior1);
        arena.findHuman(mag2);
        arena.findHuman(warrior2);
        arena.findHuman(mag3);
        arena.findHuman(warrior3);
        arena.findHuman(mag4);
        arena.findHuman(warrior4);

        List<Human> humanInArena = arena.getHumans();

        for(ArenaAfk.Human human : arena.getHumans()) {
            System.out.println(human.getNickname() + " " + human);
        }

        boolean winDetect = false;

//        duel.startDuel(humanInArena);

        System.out.println(arena.getRandomObject(humanInArena));



//        while (!winDetect) {
//            for(int i = 0; i < arena.getHumans().size() - 1; i++) {
//                humanInArena.get(i).takeDamage(humanInArena.get(i + 1));
//                if(humanInArena.get(i + 1).isDead) {
//                    winDetect = true;
//                    System.out.println("Победил: " + humanInArena.get(i).getNickname());
//                    System.out.println("Первым умер: " + humanInArena.get(i + 1).getNickname());
//                    break;
//                }
//            }
//        }

    }
}