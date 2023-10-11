package ba.edu.ibu.blogapi.repository;

import ba.edu.ibu.blogapi.model.Article;
import ba.edu.ibu.blogapi.service.SlugService;
import ba.edu.ibu.blogapi.serviceimpl.slug.SimpleSlugService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component // @Repository
public class ArticleRepository {
    private final SlugService slugService;
    private List<Article> articles;

    public ArticleRepository(SlugService slugService) {
        //this.slugService = new SimpleSlugService(); // Don't do this
        this.slugService = slugService;
        articles = Arrays.asList(
                new Article(1, "Hello World", slugService.slugify("Hello World"), "Welcome to my new Blog", LocalDateTime.now()),
                new Article(2, "Spring Initializr", slugService.slugify("Spring Initializr"), "Get started with Spring", LocalDateTime.now()),
                new Article(3, "Spring DI and IOC", slugService.slugify("Spring DI and IOC"), "Dependency Injection and Inversion of Control", LocalDateTime.now())
        );
    }

    public List<Article> findAll() {
        return articles;
    }

    public Article findById(int id) {
        return articles
                .stream()
                .filter(article -> article.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
