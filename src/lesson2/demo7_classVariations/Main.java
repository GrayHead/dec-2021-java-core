package lesson2.demo7_classVariations;

public class Main {
    public static void main(String[] args) {

//        class Inner {
//            private int x;
//
//        }
//        Inner inner = new Inner();
        InnerClassWrapper.InnerClass innerClass = new InnerClassWrapper().new InnerClass();

        InnerClassStaticWrapper.InnerStatic innerStatic = new InnerClassStaticWrapper.InnerStatic();



    }
}


