package C8_AdapterPatter.init;

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("user name");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("user address");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("user mobile number");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("user job positon");
        return null;
    }
}
