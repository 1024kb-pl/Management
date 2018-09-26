package entity;

import entity.enums.Color;
import entity.enums.SkinType;

import java.util.EnumSet;

public class Boots extends Product {

    public final static char PRODUCT_TYPE = 'B';

    private Integer size;
    private SkinType skinType;

    public Boots(Long id, String productName, Float price, Float weight, EnumSet<Color> colors, Integer productCount, Integer size, SkinType skinType) {
        super(id, productName, price, weight, colors, productCount);
        this.size = size;
        this.skinType = skinType;
    }

    public Integer getSize() {
        return size;
    }

    public SkinType getSkinType() {
        return skinType;
    }

    @Override
    public String toString() {
        return PRODUCT_TYPE + PRODUCT_SEPARATOR + getBasicProductString() + PRODUCT_SEPARATOR + size + PRODUCT_SEPARATOR + skinType;
    }
}
