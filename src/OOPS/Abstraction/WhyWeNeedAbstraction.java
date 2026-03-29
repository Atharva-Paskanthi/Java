package OOPS.Abstraction;

abstract class WayofEating{

    abstract void eat();        //declared
}

class IndianWayOfEating extends WayofEating{

    @Override
    void eat() {                //implemented
        System.out.println("Indian people use their hands for eating");
    }
}

class WesternWayOfEating extends WayofEating{

    @Override
    void eat() {                //implemented
        System.out.println("Western people use Spoon/Fork for eating");
    }
}

public class WhyWeNeedAbstraction {
}
