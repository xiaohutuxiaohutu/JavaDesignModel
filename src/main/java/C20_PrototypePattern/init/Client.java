package C20_PrototypePattern.init;

import C20_PrototypePattern.PrototypeUtils;

public class Client {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xx版权所有。。。");
        while (i < MAX_COUNT) {
            mail.setAppellation(PrototypeUtils.getRandString(5) + "先生/女士");
            mail.setReceiver(PrototypeUtils.getRandString(5) + "@" + PrototypeUtils.getRandString(8) + ".com");
            sendMail(mail);
            i++;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("title:" + mail.getSubject() + "\t receiver:" + mail.getReceiver() + "\t....success");
    }
}
