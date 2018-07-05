package com.batch.design.patterns.entrust;

/**
 * Created by longbao on 18/7/5.
 */
public class C implements I {
    // delegation
    I i = new A();

    @Override
    public void f() {
        i.f();
    }

    @Override
    public void g() {
        i.g();
    }

    // normal attributes
    public void toA() {
        i = new A();
    }

    public void toB() {
        i = new B();
    }
}
