package vn.com.pattern.factory;

import vn.com.pattern.common.MaterialType;

public class FurnitureFactory {

    public FurnitureFactory() {
    }

    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
            case WOOD:
                return new WoodFactory();
            case PLASTIC:
                return new PlasticFactory();
            default:
                throw new UnsupportedOperationException("Not support");
        }
    }
}
