package eu.mrndesign.matned.service;

import eu.mrndesign.matned.dto.ProductDTO;
import eu.mrndesign.matned.model.Product;
import eu.mrndesign.matned.repository.ProductRepository;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.ServerError;
import java.util.List;
import java.util.stream.Collectors;

import static eu.mrndesign.matned.utils.ErrorMessages.PRODUCT_NOT_FOUND;

@Service
public class ProductService extends BaseService{

    private final ProductRepository productRepository;
    private final String host;

    public ProductService(ProductRepository productRepository) throws UnknownHostException {
        this.productRepository = productRepository;
        this.host = InetAddress.getLocalHost().getHostName();
    }

    public List<ProductDTO> findAllProducts(Integer page, Integer itemsPerPage, String[] sortBy) {
        return productRepository.findAll(getPageable(page, itemsPerPage, sortBy))
                .getContent()
                .stream()
                .map(ProductDTO::apply)
                .collect(Collectors.toList());
    }

    public ProductDTO findProductById(Long id) throws ServerError {
        return ProductDTO.apply(getProductBy(id));
    }

    public ProductDTO saveProduct(ProductDTO data){
        return ProductDTO.apply(productRepository.save(Product.create(data)));
    }

    public ProductDTO editProduct(Long id, ProductDTO data, Long creditId) throws ServerError {
        Product toEdit = getProductBy(id);
        toEdit.applyChangesFrom(data);
        return ProductDTO.apply(productRepository.save(Product.create(data)));
    }

    @Override
    public String url(String host, Integer port) {
        System.setProperty("proxyHost", host);
        System.setProperty("proxyPort", String.valueOf(port));
        return "http://" +host+":"+port;
    }

    @Override
    public ProductDTO findProductByCreditId(Long creditId) throws ServerError {
        return ProductDTO.apply(productRepository.findProductByCreditId(creditId).orElseThrow(()->new ServerError(PRODUCT_NOT_FOUND, new Error())));
    }


    private Product getProductBy(Long id) throws ServerError {
        return productRepository.findById(id).orElseThrow(() -> new ServerError(PRODUCT_NOT_FOUND, new Error()));
    }

}
