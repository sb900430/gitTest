/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyw;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author COSMO-506
 */
@ManagedBean
@RequestScoped
public class HobbyRequestManagedBean {
    private String hobby;

    public HobbyRequestManagedBean() {
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
}
