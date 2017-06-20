package com.emusicstore.controller;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
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

    //explanation in chapter 004 video 007 at 10:00
    @RequestMapping("/productList/viewProduct/{productId}") //add path variable
    public String viewProduct(@PathVariable String productId, Model model) throws IOException { //grab varible value from the path and define the model
        Product product = productDao.getProductById(productId);  //create new instance of product (from data accessing object) and pass id
        model.addAttribute(product); //attach the product to the model

        return "viewProduct";
    }

}