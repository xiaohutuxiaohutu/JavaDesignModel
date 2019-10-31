package C20_PrototypePattern.init;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mail {
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
}
