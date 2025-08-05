package DesignPatterns.Factory.Assignments.FactoryAudio;

public abstract class AudioPlayer {

    int volume;
    double playBackRate;

    public abstract MediaFormat supportsType();

    public abstract void play();

    public abstract void pause();

    public abstract void stop();

    public abstract int getVolume();

    public abstract void setVolume(int volume);

    public abstract double getPlayBackRate();

}