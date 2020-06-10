package com.bestbuy.constants;

/**
 * Created by Ankita
 */
public class EndPoints {
    /**
     * Defining end points for all the products
     */
    public static final String GET_ALL_PRODUCTS = "/products";
    public static final String GET_SINGLE_PRODUCT_BY_ID = "/products/{id}";
    public static final String POST_A_PRODUCTS = "/products";
    public static final String UPDATE_PRODUCT_BY_ID = "/products/{id}";
    public static final String DELETE_PRODUCT_BY_ID = "/products/{id}";

    /**
     * Defining end points for stores
     */
    public static final String GET_ALL_STORES = "/stores";
    public static final String GET_SINGLE_STORE_BY_ID = "/stores/{id}";
    public static final String POST_A_STORE = "/stores";
    public static final String UPDATE_STORE_BY_ID = "/stores/{id}";
    public static final String DELETE_STORE_BY_ID = "/stores/{id}";

    /**
     *  Defining end points for services
     */

    public static final String GET_ALL_SERVICES = "/services";
    public static final String GET_SINGLE_SERVICES_BY_ID = "/services/{id}";
    public static final String POST_A_SERVICES = "/services";
    public static final String UPDATE_SERVICES_BY_ID = "/services/{id}";
    public static final String DELETE_SERVICES_BY_ID = "/services/{id}";

    /**
     * Defining end points for categories
     */

    public static final String GET_ALL_CATEGORIES = "/categories";
    public static final String GET_SINGLE_CATEGORIES_BY_ID = "/categories/{id}";
    public static final String POST_A_CATEGORIES = "/categories";
    public static final String UPDATE_CATEGORIES_BY_ID = "/categories/{id}";
    public static final String DELETE_CATEGORIES_BY_ID = "/categories/{id}";



}
