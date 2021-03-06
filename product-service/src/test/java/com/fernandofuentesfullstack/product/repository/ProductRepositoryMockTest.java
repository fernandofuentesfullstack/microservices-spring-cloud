package com.fernandofuentesfullstack.product.repository;

import com.fernandofuentesfullstack.product.entity.Category;
import com.fernandofuentesfullstack.product.entity.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;

@DataJpaTest
class ProductRepositoryMockTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void whenFindByCategory_thenReturnListProduct() {
        Product product01 = Product.builder()
                .name("computer")
                .category(Category.builder().id(1L).build())
                .description("")
                .price(Double.parseDouble("1240.99"))
                .stock(Double.parseDouble("10"))
                .status("CREATED")
                .createAt(new Date()).build();
        productRepository.save(product01);

        List<Product> founds = productRepository.findByCategory(product01.getCategory());

        Assertions.assertThat(founds.size()).isEqualTo(2);

    }

}
