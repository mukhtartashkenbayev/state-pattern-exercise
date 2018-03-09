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
public class AcceptA extends State {

    StateContext sc;

    public AcceptA(StateContext sc){
        this.sc = sc;
        this.accept = true;
    }

    @Override
    public void actionA(){
        sc.setState(sc.getAcceptA());
    }
    @Override
    public void actionB(){
        sc.setState(sc.getRejectB());
    }

}
