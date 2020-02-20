package vn.com.pattern.factory;

import vn.com.pattern.chair.Chair;
import vn.com.pattern.chair.PlasticChair;
import vn.com.pattern.table.PlasticTable;
import vn.com.pattern.table.Table;

public class PlasticFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
