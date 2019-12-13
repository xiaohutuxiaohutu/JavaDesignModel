package C7_FacadePattern.init;

public class Client {
    public static void main(String[] args) {
        LetterProcessImpl letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("wirte lsdjlajaksdk k ");
        letterProcess.fillEnvelope("addredss dsad a");
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}
