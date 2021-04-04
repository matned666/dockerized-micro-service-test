package eu.mrndesign.matned.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public abstract class BaseService{


    @Value("${default.page.start}")
    protected Integer defaultStartPage;
    @Value("${default.page.size}")
    protected Integer defaultPageSize;


    protected Pageable getPageable(Integer startPage, Integer itemsPerPage) {
        return PageRequest.of(startPage, itemsPerPage);
    }




}
