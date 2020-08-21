package com.evan.wj.service;

import com.evan.wj.dao.CategoryDao;
import com.evan.wj.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fada.yu
 * @date 2020/8/21 14:31
 * @Description：
 */
@Service
public class CategoryService {
    @Autowired
    CategoryDao categoryDao;

    public List<Category> list(){
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return categoryDao.findAll(sort);
    }

    public Category get(int id){
        Category c= categoryDao.findById(id).orElse(null);
        return c;
    }

}
