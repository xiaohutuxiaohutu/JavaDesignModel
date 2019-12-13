package C7_FacadePattern.init;

/**
 * 定义一个写信的过程
 */
public interface LetterProcess {
    void writeContext(String context);

    void fillEnvelope(String address);

    void letterInotoEnvelope();

    void sendLetter();

}
