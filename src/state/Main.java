package state;

/**
 * Created by Артем on 25.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Human human=new Human();
        human.setSituation(new MushroomMeadow());
        for(int i=0;i<Human.AMOUNT;i++){
            human.act();
        }
    }
}
