package com.family.pattern.state;

public class Context {

    State state;


    public Context(){}
    public Context(State state){
        super();
        this.state=state;
    }

    /**
     * State Manager
     * @param state
     */
    public void setState(State state){
       this.state=state;
       state.handle();
    }

    public static void main(String[] args) {
        Context context=new Context();
        context.setState(new FirstState());
    }



}
