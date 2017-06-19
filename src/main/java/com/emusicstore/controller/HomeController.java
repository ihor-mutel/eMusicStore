package com.emusicstore.controller;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by The Revenant on 6/15/2017.
 */

@Controller

public class HomeController {
    //we define productDao instance
    private ProductDao productDao = new ProductDao();


    @RequestMapping("/")
    public String home() {
        return "home";
    }

    //we created another request of mapping
    @RequestMapping("/productList")
    // we defined a function which imported model parameter
    public String getProducts(Model model) {
        //LIST that fetched fro the productDAO
        List<Product> products = productDao.getProductList();

        //attach this product to the Model
        //first argument is a String and second is instance
        model.addAttribute("products", products);

        return "productList";
    }
    @RequestMapping("/productList/viewProduct")
    public String viewProduct(){
        return "viewProduct";
    }
}

