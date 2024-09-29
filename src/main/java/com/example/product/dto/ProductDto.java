package com.example.product.dto;

public class ProductDto {

    private String name;
    private Integer price;
    private String price_qty;
    private String category;
    private String desc;
    private String pict;
    
    public String getName() {
        return name;
    }
    public Integer getPrice() {
        return price;
    }
    public String getPrice_qty() {
        return price_qty;
    }
    public String getCategory() {
        return category;
    }
    public String getDesc() {
        return desc;
    }
    public String getPict() {
        return pict;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public void setPrice_qty(String price_qty) {
        this.price_qty = price_qty;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setPict(String pict) {
        this.pict = pict;
    }


}
