package com.batch.design.patterns.state;

/**
 * Created by longbao on 18/7/5.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
