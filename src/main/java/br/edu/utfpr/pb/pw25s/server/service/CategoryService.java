package br.edu.utfpr.pb.pw25s.server.service;

import br.edu.utfpr.pb.pw25s.server.repository.CategoryRespository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRespository categoryRespository;

    public CategoryService(CategoryRespository categoryRespository) {
        this.categoryRespository = categoryRespository;
    }

}
