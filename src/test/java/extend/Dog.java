package extend;

/**
 * Created by enny on 18.09.20.
 */
public class Dog extends Animal{
    public Dog(String name){
        setName(name);
    }

    void voice(){
        System.out.println(getName()+" " + "gav");
    }
}
