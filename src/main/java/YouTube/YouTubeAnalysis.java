package YouTube;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class YouTubeAnalysis {
    public static void main(String[] args) {
        // Создание списка с видео
        List<Video> videos = Arrays.asList(
                new Video("Java Tutorial", "CodeMaster", 1_500_000, 30_000, 900, "Образование", true),
                new Video("Top Songs 2023", "MusicChannel", 5_000_000, 100_000, 1800, "Музыка", true),
                new Video("Gaming Highlights", "GamerX", 2_000_000, 50_000, 1200, "Игры", true),
                new Video("Science Explained", "ScienceLab", 800_000, 20_000, 1500, "Наука", false),
                new Video("Short Clip", "FunVibes", 500_000, 10_000, 300, "Развлечения", false),
                new Video("Long Documentary", "DocuWorld", 700_000, 40_000, 3600, "Документальные фильмы", true),
                new Video("Cooking Tips", "ChefLife", 900_000, 25_000, 600, "Еда", true)
        );
        // // Задание 1: Создание списка названия видео, преобразовав их в верхний регистр
      List<String> upperCaseTitles = videos.stream()
              .map(video -> video.getTitle().toUpperCase())
              .collect(Collectors.toList());
      System.out.println("Название видео в верхнем регистре: " + upperCaseTitles);

      //Задание 2: Создание списка объектов, содержащих только название видео и количество лайков

        record VideoSummer(String title,int likes){}
        List<VideoSummer>videoSummaries = videos.stream()
                .map(video -> new VideoSummer(video.getTitle(), video.getLikes()))
                .collect(Collectors.toList());
        System.out.println("Список названий и лайков: " + videoSummaries);

        //Задание 3.1 Отсортировать видео по количеству просмотров в порядке убывания и выведите первые 5
        List<Video> top5ByViews = videos.stream()
                .sorted(Comparator.comparingInt(Video::getDuration))
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Топ-5: " + top5ByViews  );

        //Задание 3.2 Отсортировать видео по длительности в порядке возрастания и выведите первые 3
        List<Video>  shortestVideos = videos.stream()
                .sorted(Comparator.comparingInt(Video::getDuration))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Наиболее короткие видео: " + shortestVideos);

        //Задание 4.1: Посчитать общее количество видео в списке

        long totalVideos = videos.stream().count();
        System.out.println("Общее количество видео: " + totalVideos);

        // Задание 4.2: Найти видео с максимальным количеством лайков
        Optional<Video> mostLikesVideo = videos.stream()
                .max(Comparator.comparingInt(Video::getLikes));
        mostLikesVideo.ifPresent(video ->
                System.out.println("Самое лайкнутое видео: " + video.getTitle() + " (" + video.getLikes() + " лайков)")
        );

        // Задание 4.3: Найти видео с минимальной длительностью
        Optional<Video> shortVideo = videos.stream()
                .min(Comparator.comparingInt(Video::getDuration));
        shortVideo.ifPresent(video ->
                System.out.println("Самое короткое видео: " + video.getTitle() + " (" + video.getDuration() + " секунд)")
        );

        // Задание 5.1: Проверить, есть ли хотя бы одно видео с количеством просмотров более 10 миллионов
        boolean hasSuperPopularVideo = videos.stream()
                .anyMatch(video -> video.getViews()>10_000_000);
        System.out.println("Есть видео с более чем 10 миллионами просмотров: "  + hasSuperPopularVideo);

        // Задание 5.2: Проверить, все ли видео в категории "Музыка" монетизированы

        boolean allMusicMonetized = videos.stream()
                .filter(video -> "Музыка".equals(video.getCategory()))
                .allMatch(Video::isMonetized);
        System.out.println("Все видео в категории Музыка монетизированы: " + allMusicMonetized);
    }

}
