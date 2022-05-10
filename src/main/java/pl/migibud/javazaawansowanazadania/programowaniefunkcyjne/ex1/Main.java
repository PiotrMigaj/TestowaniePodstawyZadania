package pl.migibud.javazaawansowanazadania.programowaniefunkcyjne.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Video video = new Video("G0T1", "got1.com", VideoType.CLIP);
        Video video1 = new Video("G0T2", "got2.com", VideoType.EPISODE);
        Video video2 = new Video("G0T3", "got3.com", VideoType.PREVIEW);
        Video video3 = new Video("G0T4", "got4.com", VideoType.PREVIEW);
        Video video4 = new Video("G0T5", "got5.com", VideoType.CLIP);
        Video video5 = new Video("G0Tб", "gotб.com", VideoType.EPISODE);

        Episode episode = new Episode("got1", 1, List.of(video, video1));
        Episode episode1 = new Episode("got2", 2, List.of(video2, video3));
        Episode episode2 = new Episode("got3", 1, List.of(video4, video5));
        Season season = new Season("G0T51", 1, List.of(episode,  episode1));
        Season season1 = new Season("G0T51", 2, List.of(episode2));

        List<Season> seasons = List.of(season,season1);

        List<Episode> episodes = seasons.stream().flatMap(v->v.episodes.stream()).collect(Collectors.toList());
        System.out.println(episodes);

        List<Video> videos = seasons.stream().flatMap(v->v.episodes.stream()).flatMap(v->v.videos.stream()).collect(Collectors.toList());
        System.out.println(videos);

        List<String> seasonNames = seasons.stream().map(v->v.seasonName).collect(Collectors.toList());
        System.out.println(seasonNames);






    }

}
