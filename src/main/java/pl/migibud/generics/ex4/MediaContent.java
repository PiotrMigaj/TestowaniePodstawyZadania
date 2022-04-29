package pl.migibud.generics.ex4;

public class MediaContent {

    String title;

    public MediaContent(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "MediaContent{" +
                "title='" + title + '\'' +
                '}';
    }
}
