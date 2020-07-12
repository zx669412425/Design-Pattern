package templatePattern.executorService.impl;

import templatePattern.executorService.basic.AbstractTask;
import templatePattern.executorService.basic.BasicTaskBO;

public class MsgTask extends AbstractTask {

    protected void setTaskName() {

    }

    public MsgTask(BasicTaskBO basicTaskBO) {
        super(basicTaskBO);
    }

    @Override
    public void executeTask(BasicTaskBO basicTaskBO){

    }

    public void run() {
        System.out.println("send mssage!");


    }
}
