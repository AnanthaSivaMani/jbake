package in.vamsoft.oops.training;

public class Singleton {
    
    private Singleton() {}
    
    
    public static Singleton getInstance() {
        return new Singleton();
    }

}
