package com.evan.wj.dao;

import com.evan.wj.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fada.yu
 * @date 2020/8/21 14:29
 * @Description：
 */
public interface CategoryDao extends JpaRepository<Category, Integer> {
}
