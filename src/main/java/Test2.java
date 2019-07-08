import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
       /* Thread thread=new Thread(new Test1());
        thread.start();*/

        FutureTask<Integer> future=new FutureTask<>(new Test3());

        new Thread(future).start();

        System.out.println(future.get());

    }
}
