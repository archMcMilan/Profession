package state;

/**
 * Created by Артем on 25.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Human human=new Human();
        human.setSituation(new MushroomMeadow());
        human.act();
        for(int i=0;i<Human.AMOUNT;i++){
            if(i%3==0){
                human.setSituation(new RiverBank());
            }else if(i%3==1){
                human.setSituation(new AnimalObserver());
            }else if(i%3==2){
                human.setSituation(new MushroomMeadow());
            }
            human.act();
        }
    }
}
