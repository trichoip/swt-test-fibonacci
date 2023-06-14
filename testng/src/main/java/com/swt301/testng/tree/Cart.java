/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swt301.testng.tree;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author minh tri
 */
public class Cart {

    private Map<String, Tree> cart;

    public Cart() {
    }

    public Cart(Map<String, Tree> cart) {
        this.cart = cart;
    }

    public Map<String, Tree> getCart() {
        return cart;
    }

    public void setCart(Map<String, Tree> cart) {
        this.cart = cart;
    }

    public boolean add(Tree tree) {
        boolean result = false;
        if (this.cart == null) {
            this.cart = new HashMap<>();
        }
        if (this.cart.containsKey(tree.getId())) {
            int currentQuantity = this.cart.get(tree.getId()).getQuantity();
            tree.setQuantity(currentQuantity + tree.getQuantity());

        }
        this.cart.put(tree.getId(), tree);
        result = true;
        return result;
    }

    public boolean update(String id, Tree tree) {
        boolean result = false;
        if (this.cart != null) {
            if (this.cart.containsKey(id)) {
                this.cart.replace(id, tree);
                result = true;
            }
        }

        return result;
    }

    public boolean remove(String id) {
        boolean result = false;
        if (this.cart != null) {
            if (this.cart.containsKey(id)) {
                this.cart.remove(id);
                result = true;
            }
        }

        return result;
    }
}
