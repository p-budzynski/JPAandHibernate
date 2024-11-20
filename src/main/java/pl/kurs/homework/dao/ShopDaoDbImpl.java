package pl.kurs.homework.dao;

import pl.kurs.homework.entity.Shop;

public class ShopDaoDbImpl extends GenericDbDao <Shop, Long> {
    public ShopDaoDbImpl() {
        super(Shop.class);
    }
}
