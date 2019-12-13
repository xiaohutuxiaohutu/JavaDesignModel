package C8_AdapterPatter.init;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("userName", "名字");
        map.put("mobileNumber", "手机号");
        return map;
    }

    @Override
    public Map getUserOfficeInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("jobPosition", "职位");
        map.put("mobileNumber", "手机号");
        return map;
    }

    @Override
    public Map getUserHomeInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("homeaddress", "家庭住址");
        map.put("mobileNumber", "手机号");
        return map;
    }
}
