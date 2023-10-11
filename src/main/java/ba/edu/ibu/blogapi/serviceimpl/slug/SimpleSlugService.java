package ba.edu.ibu.blogapi.serviceimpl.slug;

import ba.edu.ibu.blogapi.service.SlugService;

public class SimpleSlugService implements SlugService {
    @Override // {Hello World!} -> becomes {hello-world}
    public String slugify(String input) {
        return input
                .toLowerCase()
                .replaceAll("[^a-zA-Z0-9 ]", "") // replace all special characters except space
                .replaceAll(" ", "-"); // replace all spaces with hyphens
    }
}
