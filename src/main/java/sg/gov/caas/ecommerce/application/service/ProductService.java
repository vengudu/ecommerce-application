package sg.gov.caas.ecommerce.application.service;

import sg.gov.caas.ecommerce.application.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);


}
