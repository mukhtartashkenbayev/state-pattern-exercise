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

public class StartState extends State {

    StateContext sc;

    public StartState (StateContext sc){
        this.sc = sc;
        this.accept = false;
    }

    @Override
    public void actionA(){
        sc.setState(sc.getAcceptA());
    }

    @Override
    public void actionB(){
        sc.setState(sc.getAcceptB());
    }
}
