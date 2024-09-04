package com.lyle.wse.mapper;

import com.lyle.wse.model.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lyle 2024-09-04 21:07
 */
public interface ProductMapper {

    @Select("select * from products where productID=${id}")
    Product findProductById(Integer id);

    //结论：使用${}的方式，是要进行字符串的拼接，所以对于字符串类型的需要加单引号，否则会报错。
    @Select("select * from products where productCode = '${productCode}' AND productID = 1001")
    List<Product> findProductsByCode(@Param("productCode") String productCode);


}