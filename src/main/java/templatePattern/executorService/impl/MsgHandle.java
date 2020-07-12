package templatePattern.executorService.impl;

import templatePattern.executorService.basic.AbstractTask;
import templatePattern.executorService.basic.BasicHandle;

public class MsgHandle extends BasicHandle {

    protected void doTask(AbstractTask AbstractTask) {
        System.out.println("提交短信任务");
        fixedThreadPool.submit(AbstractTask);
    }
}
