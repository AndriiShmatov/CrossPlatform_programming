class lab3 {
    private String name;
    private int size; 

    public lab3(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void displayInfo() {
        System.out.println("File: " + name + ", Size: " + size + "KB");
    }
}

class AudioFile extends lab3 {
    private int duration;

    public AudioFile(String name, int size, int duration) {
        super(name, size);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("Audio File: " + getName() + ", Size: " + getSize() + "KB, Duration: " + duration + " seconds");
    }
}

class VideoFile extends lab3 {
    private int resolution;

    public VideoFile(String name, int size, int resolution) {
        super(name, size);
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    @Override
    public void displayInfo() {
        System.out.println("Video File: " + getName() + ", Size: " + getSize() + "KB, Resolution: " + resolution + "p");
    }
}

class Catalog {
    private lab3[] files;
    private int count;

    public Catalog(int capacity) {
        files = new lab3[capacity];
        count = 0;
    }

    public void addFile(lab3 file) {
        if (count < files.length) {
            files[count++] = file;
        } else {
            System.out.println("Catalog is full.");
        }
    }

    public int countAudioFiles() {
        int audioCount = 0;
        for (lab3 file : files) {
            if (file instanceof AudioFile) {
                audioCount++;
            }
        }
        return audioCount;
    }

    public int countVideoFiles() {
        int videoCount = 0;
        for (lab3 file : files) {
            if (file instanceof VideoFile) {
                videoCount++;
            }
        }
        return videoCount;
    }

    public void displayCatalog() {
        for (lab3 file : files) {
            if (file != null) {
                file.displayInfo();
            }
        }
    }
}
