package structural.bridge;

/**
 * Remote provides same API to outer world (client)
 * Device provides same API to Remote
 * Internally Device is implemented differently
 */
public class MainBridge {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        tv.printStatus();
        radio.printStatus();

        Remote tvRemote = new BasicRemote(tv);
        Remote radioRemote = new BasicRemote(radio);
        tvRemote.power();
        tvRemote.channelUp();
        tvRemote.volumeUp();
        tv.printStatus();

        radioRemote.power();
        radioRemote.channelDown();
        radioRemote.volumeDown();
        radioRemote.power();
        radio.printStatus();
    }
}
