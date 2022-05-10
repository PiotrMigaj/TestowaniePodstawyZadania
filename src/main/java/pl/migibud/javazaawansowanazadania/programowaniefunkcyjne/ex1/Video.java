package pl.migibud.javazaawansowanazadania.programowaniefunkcyjne.ex1;

public class Video {

    String title;
    String url;
    VideoType videoType;

    public Video(String title, String url, VideoType videoType) {
        this.title = title;
        this.url = url;
        this.videoType = videoType;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", videoType=" + videoType +
                '}';
    }
}
