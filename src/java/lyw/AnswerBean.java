/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyw;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author COSMO-506
 */
@Named
@RequestScoped
public class AnswerBean {

    String gender;
    String brand;
    String brandName;
    final String[] brandList = {"Marc Jacobs", "EMODA", "EGOIST", "MURUA", "dazzlin", "その他"};

    public AnswerBean() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String[] getBrandList() {
        return brandList;
    }
    
}
