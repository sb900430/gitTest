/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyw;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author COSMO-506
 */
@Named(value = "hobbyViewBean")
@ViewScoped
public class HobbyViewBean implements Serializable{
    private String hobby;

    public HobbyViewBean() {
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
}
