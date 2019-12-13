package C9_TemplateMethodPattern.third;

public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("h1 start");
    }

    @Override
    protected void stop() {
        System.out.println("h1 stop");
    }

    @Override
    protected void alarm() {
        System.out.println("h1 alarm");
    }

    @Override
    protected void engineBoom() {

        System.out.println("h1 engine boom");
    }

    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }

}
