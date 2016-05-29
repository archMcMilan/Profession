package state;

/**
 * Created by Артем on 25.05.2016.
 */

//Context(Strategy client)
public class Human {
    private Situation situation;
    public static final int AMOUNT=10;
    public void setSituation(Situation situation) {
        this.situation = situation;
    }

    public void act(){
        situation.act(this);
    }
}

//state(strategy)
interface  Situation {
    void act(Human human);
}

//ConcreteState(Concrete strategy)
class RiverBank implements Situation{

    @Override
    public void act(Human context) {
        System.out.println("Human is on the river bank.Human is a fisher");
        //context.setSituation(new MushroomMeadow());
    }
}

class MushroomMeadow implements Situation{

    @Override
    public void act(Human context) {
        System.out.println("Human is on the mushroom meadow.Human is mushroom picker");
        //context.setSituation(new AnimalObserver());
    }
}

class AnimalObserver implements Situation{

    @Override
    public void act(Human context) {
        System.out.println("Animal is seen.Human is a hunter");
        //context.setSituation(new RiverBank());
    }
}