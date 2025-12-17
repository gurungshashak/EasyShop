package org.yearup.data;

import org.yearup.models.ShoppingCart;

public interface ShoppingCartDao
{
    ShoppingCart getByUserId(int userId);
    // add additional method signatures here
    void addProduct(int UserId, int productId, int quantity);//add product to the cart

    void updateQuantity(int userID, int productId, int Quantity); // add more of a product

    void delete(int userIs); //delete the whole cart

    void deleteProduct(int userId,int productId);//remove single item

}
