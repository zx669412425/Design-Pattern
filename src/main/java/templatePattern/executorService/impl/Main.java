package templatePattern.executorService.impl;

public class Main {
    public static void main(String[] args) {
        MsgHandle msgHandle = new MsgHandle();
        MsgTaskBO msgTaskBO = new MsgTaskBO();
        MsgTask msgTask = new MsgTask(msgTaskBO);
        msgHandle.doTask(msgTask);
    }
}
