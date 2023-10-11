package ba.edu.ibu.blogapi.controller;

import ba.edu.ibu.blogapi.model.Article;
import ba.edu.ibu.blogapi.repository.ArticleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {
    private final ArticleRepository articleRepository;

    // 1st version
    /*public ArticleController() {
        this.articleRepository = new ArticleRepository(); // This is how we did it previously
    }*/

    // 2nd version
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }
    @GetMapping
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @GetMapping("/{id}")
    public Article findById(@PathVariable Integer id) {
        return articleRepository.findById(id);
    }
}
