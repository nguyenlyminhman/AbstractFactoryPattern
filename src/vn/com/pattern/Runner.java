package vn.com.pattern;

import vn.com.pattern.chair.Chair;
import vn.com.pattern.common.MaterialType;
import vn.com.pattern.factory.FurnitureAbstractFactory;
import vn.com.pattern.factory.FurnitureFactory;
import vn.com.pattern.table.Table;

public class Runner {
    public static void main(String [] args){
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.WOOD);

        Chair chair = factory.createChair();
        chair.create();

        Table table = factory.createTable();
        table.create();
    }
}
