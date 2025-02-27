package com.khalom.crud.Product.Repository;

import com.khalom.crud.Product.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository <Book, Integer>{
    List<Book> findByAuthor(String author);
    List<Book> findByTitleContainingIgnoreCase(String keyword);
    List<Book> findByPriceBetween(double min, double max);

}
