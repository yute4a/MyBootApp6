package jp.te4a.spring.boot.mybootapp7;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BookService {
@Autowired
BookRepository bookRepository;
public BookBean save(BookBean bookBean) {
    return bookRepository.save(bookBean);
    }
    public List<BookBean> findAll() {
    return bookRepository.findAll();
    }
    }