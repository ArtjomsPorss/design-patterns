package structural.bridge;

import lombok.Getter;

public class TV implements Device {
    private boolean on;
    @Getter
    private int volume = 30;
    @Getter
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        this.on = true;
        System.out.println("| TV turned on");
    }

    @Override
    public void disable() {
        this.on = false;
        System.out.println("| TV turned off");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
        System.out.println("| TV volume is set to " + volume);
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("| TV channel is set to " + channel);
    }

    @Override
    public void printStatus() {
        System.out.println("\n------------------------------");
        System.out.println("| I am a TV");
        System.out.println("| I am " + (on ? "on" : "off"));
        System.out.println("| Current volume is " + volume);
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------\n");
    }
}
