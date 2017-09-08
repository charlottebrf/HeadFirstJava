public class Foo {
  public static final int FOO_X = 25;
}
// static final var v1

public class Bar {
  public static final double BAR_SIGN;

  static {
    BAR_SIGN = (double) Math.random();
  }
}
// static final var v2



// non-static final var
class Foof {
  final int size = 3;
  final int whuffle;

  Foof() {
    whuffle = 42;
    //now can't change this var
  }

  void doStuff(final int x) {
    // can't change x
  }

  void doMore() {
    final int z = 7;
    //can't change z
  }

}

// final method

class Heya {
  final coid calcWhuffie() {
    //can never be overriden
  }
}

final class MyMostPerfectClass{
  //can't be extended
}
