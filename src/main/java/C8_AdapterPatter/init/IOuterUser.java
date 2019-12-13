package C8_AdapterPatter.init;

import java.util.Map;

/**
 * 外系统人员
 */
public interface IOuterUser {
    Map getUserBaseInfo();

    Map getUserOfficeInfo();

    Map getUserHomeInfo();

}
