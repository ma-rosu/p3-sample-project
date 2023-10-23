package ro.uvt.p3.io;

public class InputDevice {

    public String nextLine(){
        return "Raul jumps over Teo!";
    }

//    public Fruit readFruit()
//    {
//
//    }

    public void computeWeight(Fruit[] fruits)
    {
        float totalWeight = 0;
        for(Fruit fruit : fruits)
        {
            totalWeight += fruit.weight;
        }
    }

    public void computeSugarContent(Fruit[] fruits)
    {
        float totalSugarContent = 0;
        for(Fruit fruit : fruits)
        {
            totalSugarContent += fruit.sugar;
        }
    }


}
