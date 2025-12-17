package org.yearup.data.mysql;

import org.springframework.stereotype.Component;
import org.yearup.data.ProductDao;
import org.yearup.data.ShoppingCartDao;
import org.yearup.models.ShoppingCart;

import javax.sql.DataSource;

@Component
public class MySqlShoppingCartDao extends MySqlDaoBase implements ShoppingCartDao {

    private ProductDao productDao;
    private DataSource dataSource;


    public MySqlShoppingCartDao(DataSource dataSource) {
        super(dataSource);
        this.dataSource = dataSource;
        this.productDao = productDao;
    }

    @Override
    public ShoppingCart getByUserId(int userId) {
        return null;
    }

    @Override
    public void addProduct(int UserId, int productId, int quantity) {

    }

    @Override
    public void updateQuantity(int userID, int productId, int Quantity) {

    }

    @Override
    public void delete(int userIs) {

    }

    @Override
    public void deleteProduct(int userId, int productId) {

    }
}
