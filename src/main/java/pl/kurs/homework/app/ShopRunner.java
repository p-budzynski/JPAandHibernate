package pl.kurs.homework.app;

import pl.kurs.homework.dao.GenericDbDao;
import pl.kurs.homework.entity.Shop;

public class ShopRunner {
    public static void main(String[] args) {
        GenericDbDao<Shop, Long> shopDao = new GenericDbDao<>(Shop.class);
        Shop shop = new Shop("Carrefour", "25-775 Kraków, ul. Smocza 12", "753 159 852", "spożywczy");

        shopDao.save(shop);

        Shop findedShop = shopDao.get(1L);
        System.out.println(findedShop);

        shopDao.cleanUp();
    }
}
