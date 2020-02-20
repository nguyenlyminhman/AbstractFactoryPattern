package vn.com.pattern.factory;

import vn.com.pattern.chair.Chair;
import vn.com.pattern.table.Table;

public abstract class FurnitureAbstractFactory {

    public abstract Chair createChair();

    public abstract Table createTable();
}
