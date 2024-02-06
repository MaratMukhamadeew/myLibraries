package learn.Tsymbaliuk.innerClasses.sample3;

public class InnerSubclass extends Outer.Inner {
    public InnerSubclass(Outer outer) {
        outer.super("Hello");
    }
}
