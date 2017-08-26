package com.bvan.oop.lesssons5_6.format.oop;

import com.bvan.oop.lesssons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class NameFormatter implements Formatter {

    @Override
    public String format(Product product) {
        return product.getName();
    }
}
