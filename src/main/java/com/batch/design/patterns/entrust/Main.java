package com.batch.design.patterns.entrust;

/**
 * Created by longbao on 18/7/5.
 */
public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.f();     // output: A: doing f()
        c.g();     // output: A: doing g()
        c.toB();
        c.f();     // output: B: doing f()
        c.g();     // output: B: doing g()
    }
}
