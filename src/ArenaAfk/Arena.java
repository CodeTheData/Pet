package ArenaAfk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arena extends Place {

    private List<Human> humans;

    public Arena(String name) {
        super(name);
        humans = new ArrayList<>();
    }

    public void findHuman(Human human) {
        humans.add(human);
    }

    public List<Human> getHumans() {
        return humans;
    }

    public  <Human> Human getRandomObject(List<Human> humans) {
        Random random = new Random();
        int i = random.nextInt(humans.size());
        return humans.get(i);
    }
}

//    public void startDuel(List<Human> list) {
//
////        While()
////            Human fighter1 = list.get(Math.random(List<Human> list));
////            Human fighter2 = list.get(i + 1);
////            Human winner;
////            System.out.println("Начинается дуэль между " + fighter1 + " и " + fighter2);
////            fightHuman(fighter1, fighter2);
////            if(fighter1.isAlive()){
////                System.out.println("Победителем битвы стал: " + fighter1);
////                winner = fighter1;
////            } else {
////                System.out.println("Победителем битвы стал: " + fighter2);
////                winner = fighter2;
////            }
////        }
////    }
////
////    private void fightHuman(Human fighter1, Human fighter2) {
////        while (fighter1.isAlive() && fighter2.isAlive()) {
////            fighter1.takeDamage(fighter2);
////            if(fighter2.isAlive()) {
////                fighter2.takeDamage(fighter1);
////            }
////        }
////    }
//
//
//
//}
