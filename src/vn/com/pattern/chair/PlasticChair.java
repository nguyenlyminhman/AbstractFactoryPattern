package vn.com.pattern.chair;

import vn.com.pattern.chair.Chair;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create plastic chair");
    }
}
