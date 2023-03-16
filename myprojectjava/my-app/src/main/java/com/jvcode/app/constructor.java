public class Constructor {
    public static void main(String... args){
        TheChildClass ref1 = new TheChildClass("something");
        TheParentClass ref2 = new TheChildClass("something");
        ref1.someChildMethod();
        ref1.someParentMethod();
        ((TheChildClass) ref2).someChildMethod();
        ref2.someParentMethod();
        System.out.println(ref1);
    }

    private static class SomeClass {
        private int prop1;
        private String prop2;

        public SomeClass(int prop1){
            this.prop1 = prop1;
        }

        public SomeClass(String prop2){
            this.prop2 = prop2;
        }

        public SomeClass(int prop1, String prop2){
            this.prop1 = prop1;
            this.prop2 = prop2;
        }