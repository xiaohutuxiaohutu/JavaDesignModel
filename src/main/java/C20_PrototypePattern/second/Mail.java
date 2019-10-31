package C20_PrototypePattern.second;

import lombok.Data;

@Data
public class Mail implements Cloneable {
    //􁬊􀓊􀒎
    private String receiver;
    //􄚂􀓊􀧡􂿄
    private String subject;
    //􂿄􄇧
    private String appellation;
    //􄚂􀓊􀝙􁆍
    private String contxt;
    //􄚂􀓊􂱘􁈒􄚼􀋈􀏔􃠀􄛑􁰃􀡴􀏞“XXX􂠜􁴗􁠔􁳝”􃄝􀖵􁙃
    private String tail;

    //􁵘􄗴􀟑􁭄
    public Mail(AdvTemplate advTemplate) {
        this.contxt = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}
