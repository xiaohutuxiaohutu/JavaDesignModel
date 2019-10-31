package C20_PrototypePattern.second;

import C20_PrototypePattern.PrototypeUtils;

public class Client {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;
//􁡞􁿵􁵓􁅮􀐝􀟎􁴹􀋈􄖭􀏾􁰃􀒢􁭄􁥂􀐁􃦋􁕫
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX􄫊􃸠􂠜􁴗􁠔􁳝");
        while (i < MAX_COUNT) {
//􀒹􀏟􁰃􂆣􁇕􄚂􀓊􀏡􀧠􂱘􀴄􁮍
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(PrototypeUtils.getRandString(5) + " 􀜜􂫳􀋄􀽇􀺿􀋅");
            cloneMail.setReceiver(PrototypeUtils.getRandString(5) + "@" +
                    PrototypeUtils.getRandString(8) + ".com");
            sendMail(cloneMail);
            i++;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("title:" + mail.getSubject() + "\t receiver:" + mail.getReceiver() + "\t....success");
    }
}
