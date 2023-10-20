<<<<<<< HEAD
package com.nripesh.ecommerce.dao;

import com.nripesh.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = " product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
=======
package com.nripesh.ecommerce.dao;

import com.nripesh.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = " product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
>>>>>>> 632e394a445f13bedd1efd9b5c6d509e3fef79b9
