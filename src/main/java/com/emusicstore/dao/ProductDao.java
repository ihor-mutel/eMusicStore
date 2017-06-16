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

       Product productct2 = new Product();
       productct2.setProductName("Record1");
       productct2.setProductCategory("Record");
       productct2.setProductDescription("This is an awesome mix of 20th century!");
       productct2.setProductPrice(25);
       productct2.setProductCondition("new");
       productct2.setProductStatus("Active");
       productct2.setUnitInStock(51);
       productct2.setPruductManufacturer("EMI");

       Product productct3 = new Product();
       productct3.setProductName("Speaker");
       productct3.setProductCategory("Accessory");
       productct3.setProductDescription("This is a Polk Shelf Speaker!");
       productct3.setProductPrice(355);
       productct3.setProductCondition("new");
       productct3.setProductStatus("Active");
       productct3.setUnitInStock(9);
       productct3.setPruductManufacturer("Polk");

       productList=new ArrayList<Product>();
       productList.add(productctl);
       productList.add(productct2);
       productList.add(productct3);

       return productList;
   }
}
