package extend;

/**
 * Created by enny on 18.09.20.
 */
public abstract class Animal {

    private String name;
    private int age;

    void  voice(){}
    void voice(String name){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    //    private String name;
    //    private int age;
    //
    //    void  voice() {
    //        System.out.println("Dog - gav");
    //    }

}
