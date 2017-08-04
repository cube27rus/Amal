import java.util.InvalidPropertiesFormatException;

/**
 * Created by Cube27 on 04.08.2017.
 * Пара от X1 до X2, будет хранится в Aggregate
 */
public class Pair {

    private int x;
    private int x2;

    public Pair(int x, int x2){
        if(x2>x){
            this.x=x;
            this.x2=x2;
        } else{
            this.x=x;
            this.x2=x;
        }

    }

    public int getX() {
        return x;
    }

    public int getX2() {
        return x2;
    }

}
