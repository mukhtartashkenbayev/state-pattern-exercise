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
public class StateContext{
    
    State state;
    State acceptA;
    State rejectA;
    State acceptB;
    State rejectB;
    State startState;

    public StateContext(){
        this.acceptA = new AcceptA(this);
        this.rejectA = new RejectA(this);
        this.acceptB = new AcceptB(this);
        this.rejectB = new RejectB(this);
        this.startState = new StartState(this);
        state = startState;
    }

    public void actionA(){ 
        state.actionA();
    }
    public void actionB(){
        state.actionB();
    }

    public void setState(State newState){ 
        state = newState;
    }

    public State getAcceptA(){
        return acceptA;
    }
    public State getAcceptB(){
        return acceptB;
    }
    public State getRejectA(){
        return rejectA;
    }
    public State getRejectB(){ 
        return rejectB;
    }

    public boolean isAccept(){
        return state.isAccept();
    }


}
