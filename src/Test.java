import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Cube27 on 04.08.2017.
 * Тестовый класс
 */
public class Test {

    ArrayList<Aggregate> aggregateList = new ArrayList<>(0);

    public void setNewAggregate(Aggregate aggregate,Pair... pairs){
        Aggregate aggregateToList = aggregate;
        for(Pair pair: pairs){
            aggregateToList.setPair(pair);
        }
        aggregateList.add(aggregateToList);
        System.out.println(aggregateToList);
    }

    /*public void setList(){
        Aggregate a1 = new Aggregate();
        a1.setPair(new Pair(1,3));
        a1.setPair(new Pair(5,6));
        a1.setPair(new Pair(8,13));
        Aggregate a2 = new Aggregate();
        a2.setPair(new Pair(-5,1));
        a2.setPair(new Pair(2,3));
        aggregateList.add(a1);
        aggregateList.add(a2);

        System.out.println(a1);
        System.out.println(a2);
    }*/

    public int returnClosestInt(int numToFind){
        int closestDistanse = Math.abs(aggregateList.get(0).getPair(0).getX() - numToFind);
        int closestValue = aggregateList.get(0).getPair(0).getX();

        for (int i=0;i<aggregateList.size();i++) {

            for(int z =0; z<aggregateList.get(i).size();z++) {

                for (int k = aggregateList.get(i).getPair(z).getX();
                     k <= aggregateList.get(i).getPair(z).getX2();
                     k++) {
                    if (numToFind == k) {
                        return k;
                    }
                    int cdistance = Math.abs(k - numToFind);
                    if (cdistance < closestDistanse) {
                        closestDistanse = cdistance;
                        closestValue = k;
                    }
                }
            }
        }
        return closestValue;
    }


    public static void main(String[] args) {
        Test n = new Test();
        n.setNewAggregate(new Aggregate(),new Pair(1,3),new Pair(6,15),new Pair(19,54));
        n.setNewAggregate(new Aggregate(),new Pair(-10,-5),new Pair(-5,-2));
        System.out.println(n.returnClosestInt(18));
    }


}
