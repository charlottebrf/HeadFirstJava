public class Boo {
  public Boo(int i){}
    public Boo(String s) {}
      public Boo(String z, int i) {}
      }

      class SonOfBoo extends Boo {

        public SonOfBoo() {
          super("boo");
        }
        //Will compile


        public SonOfBoo(int i) {
          super("Fred");
        }
        //Won't compile


        public SonOfBoo(String s) {
          super(42);
        }
        //Will compile


        public SonOfBoo(int i, String s) {
        }
        //Will compile


        public SonOfBoo(String a, String b, String c) {
          super(a,b);
        }
        //Won't compile


        public SonOfBoo(int i, int j) {
          super("man", j);
        }
        //Won't compile 


        public SonOfBoo() {
          super(i, "star");
        }
        //Won't compile

      }
