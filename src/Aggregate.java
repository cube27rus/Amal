import java.util.ArrayList;

/**
 * Created by Cube27 on 04.08.2017.
 * Множество пар
 */
public class Aggregate {

    ArrayList<Pair> pairList = new ArrayList<Pair>();

    public void setPair(Pair pair){
        pairList.add(pair);
    }

    public Pair getPair(int index){
        if(index>=0 && index<pairList.size()){
            return pairList.get(index);
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

    public int size(){
        return pairList.size();
    }

    /**
     * Второе задание
     * Возвращать пересечение подмножеств
     * в виде списка отрезков и полуинтервалов
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<pairList.size();i++){
            sb.append(" ( "+pairList.get(i).getX()+" , "+pairList.get(i).getX2()+" ) ");
            if(i<pairList.size()-1){
                sb.append(" ∈ ");
            }

        }
        sb.append("]");
        return sb.toString();
    }
}
