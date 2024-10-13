public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog(5);

        AudioFile audio1 = new AudioFile("song1.mp3", 3000, 180);
        AudioFile audio2 = new AudioFile("song2.wav", 5000, 240);
        VideoFile video1 = new VideoFile("movie1.mp4", 15000, 1080);
        VideoFile video2 = new VideoFile("clip.avi", 8000, 720);

        catalog.addFile(audio1);
        catalog.addFile(audio2);
        catalog.addFile(video1);
        catalog.addFile(video2);

        System.out.println("Files in catalog:");
        catalog.displayCatalog();

        System.out.println("\nNumber of audio files: " + catalog.countAudioFiles());
        System.out.println("Number of video files: " + catalog.countVideoFiles());
    }
}
