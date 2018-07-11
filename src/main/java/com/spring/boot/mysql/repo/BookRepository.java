package com.spring.boot.mysql.repo;

import com.spring.boot.mysql.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
