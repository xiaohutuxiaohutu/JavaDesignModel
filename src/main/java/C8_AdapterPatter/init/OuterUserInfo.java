package C8_AdapterPatter.init;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        return (String) this.baseInfo.get("userName");
    }

    @Override
    public String getHomeAddress() {
        return (String) this.homeInfo.get("homeaddress");
    }

    @Override
    public String getMobileNumber() {
        return (String) this.baseInfo.get("mobileNumber");
    }

    @Override
    public String getJobPosition() {
        return (String) this.officeInfo.get("jobPosition");
    }
}
