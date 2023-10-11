package ba.edu.ibu.blogapi.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface SlugService {
    String slugify(String input);
}
