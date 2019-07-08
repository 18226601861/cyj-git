import java.util.concurrent.Callable;

public class Test3 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("执行了callable线程");
        return 1+1;
    }
}
