package C7_FacadePattern.second;

import C7_FacadePattern.init.LetterProcess;
import C7_FacadePattern.init.LetterProcessImpl;

public class ModenPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}
