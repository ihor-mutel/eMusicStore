package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by The Revenant on 6/16/2017.
 */
public class ProductDao {
   private List<Product> productList;

   public List<Product> getProductList() {
       Product productct1 = new Product();
       productct1.setProductId("P123");
       productct1.setProductName("Guitar1");
       productct1.setProductCategory("Instrument");
       productct1.setProductDescription("This is a fender start guitar!");
       productct1.setProductPrice(1200);
       productct1.setProductCondition("new");
       productct1.setProductStatus("Active");
       productct1.setUnitInStock(11);
       productct1.setProductManufacturer("Fender");

       Product productct2 = new Product();
       productct2.setProductId("P124");
       productct2.setProductName("Record1");
       productct2.setProductCategory("Record");
       productct2.setProductDescription("This is an awesome mix of 20th century!");
       productct2.setProductPrice(25);
       productct2.setProductCondition("new");
       productct2.setProductStatus("Active");
       productct2.setUnitInStock(51);
       productct2.setProductManufacturer("EMI");

       Product productct3 = new Product();
       productct3.setProductId("P125");
       productct3.setProductName("Speaker");
       productct3.setProductCategory("Accessory");
       productct3.setProductDescription("This is a Polk Shelf Speaker!");
       productct3.setProductPrice(355);
       productct3.setProductCondition("new");
       productct3.setProductStatus("Active");
       productct3.setUnitInStock(9);
       productct3.setProductManufacturer("Polk");

       productList=new ArrayList<Product>();
       productList.add(productct1);
       productList.add(productct2);
       productList.add(productct3);

       return productList;
   }
        public Product getProductById(String ProductId) throws IOException{
            for (Product product: getProductList()) {//define loop through the instances of the product
                if(product.getProductId().equals(ProductId)){
                    return product;
                }
            }
            throw new IOException("No product found");
        }
}
