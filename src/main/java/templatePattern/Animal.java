package templatePattern;

public abstract class Animal {

    private String name = "animal";

    abstract void prepare();


    public void run(){
        System.out.println(name);
        System.out.println("------");
        prepare();
        System.out.println("======");

    }

}
