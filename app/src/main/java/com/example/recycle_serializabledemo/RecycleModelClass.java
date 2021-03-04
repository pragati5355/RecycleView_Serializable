package com.example.recycle_serializabledemo;

import java.io.Serializable;

public class RecycleModelClass implements Serializable {
    String proudctName;
    String productstyle;
    String productcontent;
    String productcolour;
    String productpattern;
    String productmaterial;
    String productprice;
    String productdimension;
    String productnote;
    byte[] productimage;

    public RecycleModelClass() {
        this.proudctName = proudctName;
        this.productstyle=productstyle;
        this.productcontent = productcontent;
        this.productcolour = productcolour;
        this.productpattern = productpattern;
        this.productmaterial = productmaterial;
        this.productprice = productprice;
        this.productdimension = productdimension;
        this.productnote = productnote;
        this.productimage=productimage;
    }

    public byte[] getProductimage() {
        return productimage;
    }

    public void setProductimage(byte[] productimage) {
        this.productimage = productimage;
    }

    public String getProductstyle() {
        return productstyle;
    }

    public void setProductstyle(String productstyle) {
        this.productstyle = productstyle;
    }

    public String getProudctname() {
        return proudctName;
    }

    public void setProudctname(String proudctname) {
        this.proudctName = proudctname;
    }

    public String getProductcontent() {
        return productcontent;
    }

    public void setProductcontent(String productcontent) {
        this.productcontent = productcontent;
    }

    public String getProductcolour() {
        return productcolour;
    }

    public void setProductcolour(String productcolour) {
        this.productcolour = productcolour;
    }

    public String getProductpattern() {
        return productpattern;
    }

    public void setProductpattern(String productpattern) {
        this.productpattern = productpattern;
    }

    public String getProductmaterial() {
        return productmaterial;
    }

    public void setProductmaterial(String productmaterial) {
        this.productmaterial = productmaterial;
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public String getProductdimension() {
        return productdimension;
    }

    public void setProductdimension(String productdimension) {
        this.productdimension = productdimension;
    }

    public String getProductnote() {
        return productnote;
    }

    public void setProductnote(String productnote) {
        this.productnote = productnote;
    }
}
