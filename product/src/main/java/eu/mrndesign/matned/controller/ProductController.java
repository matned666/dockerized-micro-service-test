package eu.mrndesign.matned.controller;

import eu.mrndesign.matned.dto.ProductDTO;
import eu.mrndesign.matned.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerError;
import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDTO> showAllOrders(@RequestParam(defaultValue = "${default.sort.by}", name = "sort") String[] sort,
                                          @RequestParam(defaultValue = "${default.page.start}", name = "page") Integer page,
                                          @RequestParam(defaultValue = "${default.page.size}", name = "amount") Integer amount) throws ServerError {
        return productService.findAllProducts(page, amount, sort);
    }

}
