package eu.mrndesign.matned.service;

import eu.mrndesign.matned.dto.ProductDTO;
import eu.mrndesign.matned.model.Product;
import eu.mrndesign.matned.repository.ProductRepository;
import org.springframework.stereotype.Service;
import service.BaseService;

import java.rmi.ServerError;
import java.util.List;
import java.util.stream.Collectors;

import static utils.ErrorMessages.PRODUCT_NOT_FOUND;

@Service
public class ProductService extends BaseService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> findAllProducts(Integer page, Integer itemsPerPage, String[] sortBy) {
        return productRepository.findAll(getPageable(page, itemsPerPage, sortBy))
                .getContent()
                .stream()
                .map(ProductDTO::apply)
                .collect(Collectors.toList());
    }

    public void saveProduct(ProductDTO data){
        ProductDTO.apply(productRepository.save(Product.create(data)));
    }

//    public ProductDTO editProduct(Long id, ProductDTO data, Long creditId) throws ServerError {
//        Product toEdit = getProductBy(id);
//        toEdit.applyChangesFrom(data);
//        return ProductDTO.apply(productRepository.save(Product.create(data)));
//    }

    public ProductDTO findProductByCreditId(Long creditId) throws ServerError {
        return ProductDTO.apply(productRepository.findProductByCreditId(creditId).orElseThrow(()->new ServerError(PRODUCT_NOT_FOUND, new Error())));
    }

}
