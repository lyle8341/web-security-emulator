package com.lyle.wse.controller;

import com.lyle.wse.mapper.ProductMapper;
import com.lyle.wse.model.Product;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lyle 2024-09-04 21:11
 */
@RequestMapping("/sql")
@RestController
public class SqlInjectionController {

    @Resource
    private ProductMapper productMapper;

    @GetMapping("/product")
    public Product injection(@RequestParam Integer id){
        return productMapper.findProductById(id);
    }

    /**
     * URL 不能包含空格。 URL 编码通常使用加号（+）或%20 替代空格
     * @param productCode productCode
     */
    @GetMapping("/i")
    public List<Product> injection2(@RequestParam String productCode){
        return productMapper.findProductsByCode(productCode);
    }

}