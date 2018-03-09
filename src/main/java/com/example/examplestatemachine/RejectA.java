/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.examplestatemachine;

/**
 *
 * @author Linxus
 */
public class RejectA extends State {

    StateContext sc;

    public RejectA (StateContext sc) {
        this.sc = sc;
        this.accept = false;
    }

    @Override
    public void actionA() {
        sc.setState(sc.getRejectA());
    }
    @Override
    public void actionB(){
        sc.setState(sc.getAcceptB());
    }


}

