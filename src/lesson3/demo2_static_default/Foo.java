package lesson3.demo2_static_default;

public interface Foo {

    /*public static final*/ double PI = 3.14;

    /*public*/ void foo();

    /*public*/ int bar();

    String foobar();

    static void ads() {
        System.out.println("adsadsads");
    }

    default void qwe() {
        System.out.println("qweqeqwqwe");
    }


}
