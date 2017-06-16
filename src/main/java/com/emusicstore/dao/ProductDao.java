package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by The Revenant on 6/16/2017.
 */
public class ProductDao {
   private List<Product> productList;

   public List<Product> getProductList() {
       Product productctl = new Product();
       productctl.setProductName("Guitar1");
       productctl.setProductCategory("Instrument");
       productctl.setProductDescription("This is a fender start guitar!");
       productctl.setProductPrice(1200);
       productctl.setProductCondition("new");
       productctl.setProductStatus("Active");
       productctl.setUnitInStock(11);
       productctl.setPruductManufacturer("Fender");

       productList=new ArrayList<Product>();
       productList.add(productctl);

       return productList;
   }
}
