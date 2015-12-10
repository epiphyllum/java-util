/**
 * Created by hary on 15/12/10.
 */
public class TInterfaceImpl implements TInterface {

    private int a;
    private double b;
    public TInterfaceImpl(Integer a, Double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + a + " " + b );
    }
}
