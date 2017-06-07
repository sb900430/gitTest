/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyw;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author COSMO-506
 */
@Named(value = "voteApplicationBean")
@ApplicationScoped
public class VoteApplicationBean {

    private int trump;
    private int clinton;

    public VoteApplicationBean() {
    }

    public int getTrump() {
        return trump;
    }

    public void setTrump(int trump) {
        this.trump = trump;
    }

    public int getClinton() {
        return clinton;
    }

    public void setClinton(int clinton) {
        this.clinton = clinton;
    }
    public void voteTrump(){
        this.trump++;
    }
    public void voteClienton(){
        this.clinton++;
    }

}
