package templatePattern.executorService.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//基本handle
public abstract class BasicHandle {
    //公用线程池
    public  ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

    protected abstract void doTask(AbstractTask AbstractTask);



}
