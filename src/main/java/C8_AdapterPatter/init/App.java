package C8_AdapterPatter.init;

public class App {
    public static void main(String[] args) {
        //没有与外部系统连接前
        IUserInfo userInfo = new UserInfo();
        System.out.println(userInfo.getMobileNumber());
        //与外部系统连接后
        IUserInfo outerUserInfo = new OuterUserInfo();
        System.out.println(outerUserInfo.getMobileNumber());
    }
}
