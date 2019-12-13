package C7_FacadePattern.init;

public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("write :..." + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("address:---" + address);
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("put letter to envelope");
    }

    @Override
    public void sendLetter() {
        System.out.println("sende letter");
    }
}
