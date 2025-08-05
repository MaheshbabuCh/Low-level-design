package DesignPatterns.Factory.Assignments.FactoryAudio;

public class AudioPlayerFactory {


    public static AudioPlayer getAudioPlayer(MediaFormat format, int volume, double playBackRate){

        return switch (format) {
            case MP3 -> new MP3Player(volume, playBackRate);
            case FLAC -> new FLACPlayer(volume, playBackRate);
            case WAV -> new WAVPlayer(volume, playBackRate);
        };
    }
}