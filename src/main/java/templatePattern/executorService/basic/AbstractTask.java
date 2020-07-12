package templatePattern.executorService.basic;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;


// 任务模板,实现Runnable，提交到线程池执行
@Slf4j
public abstract class AbstractTask implements Runnable{

    /**
     * 基本参数
     */
    protected  BasicTaskBO basicTaskBO;

    /**
     * 任务名
     */
    @Getter
    protected String taskName;

    /**
     * 设置任务名
     */
    protected abstract void setTaskName();

    /**
     * 前置处理器
     */
    protected void preHandle() {
        log.info("【异步任务{}将要开始执行】", taskName);
    }

    public AbstractTask(BasicTaskBO basicTaskBO){
        this.basicTaskBO = basicTaskBO;
    }

    public void executeTask(BasicTaskBO basicTaskBO){
        log.info("【异步任务{}将开始执行中，执行参数是：{}】", taskName, basicTaskBO);
    }

    public void run() {
        try {
            // 设置任务名
            setTaskName();
            // 前置处理器
            preHandle();
            // 执行异步任务
            executeTask(basicTaskBO);
            // 后置处理器
            postHandle();
        } catch (Throwable throwable) {
            // 异常处理器
            exceptionCaught(throwable);
        } finally {
            // 执行完毕处理器
            afterCompletion();
        }
    }
    /**
     * 后置处理器
     */
    protected void postHandle() {
        log.info("【异步任务{}将要执行结束】", taskName);
    }

    /**
     * 异常处理器
     *
     * @param throwable 异常
     */
    protected void exceptionCaught(Throwable throwable) {
        log.error("【异步任务{}执行异常，请求参数是：{}，异常原因是：】", taskName, basicTaskBO, throwable);
    }

    /**
     * 执行完毕处理器
     */
    protected void afterCompletion() {
        log.info("【异步任务{}执行完毕】", taskName);
    }

}
