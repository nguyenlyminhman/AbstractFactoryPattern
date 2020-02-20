package vn.com.pattern.factory;

import vn.com.pattern.chair.Chair;
import vn.com.pattern.chair.WoodChair;
import vn.com.pattern.table.Table;
import vn.com.pattern.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
