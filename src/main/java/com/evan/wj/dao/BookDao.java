package com.evan.wj.dao;

import com.evan.wj.entity.Book;
import com.evan.wj.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author fada.yu
 * @date 2020/8/21 14:23
 * @Description：
 */
public interface BookDao extends JpaRepository<Book,Integer> {
    List<Book> findAllByCategory(Category category);

    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1,String keyword2);

}
