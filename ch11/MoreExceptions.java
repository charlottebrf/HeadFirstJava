try {
  laundry.doLaundry();
} catch (TeeShirtException tex) {
  //recovery
} catch (LingerieException lex) {
  //recovery
} catch (ClothingException cex) {
  //recovery
}

//extending multiple classes

//
// the smallest exception goes first
try {
  x.doRiskyThing();
} catch (BoinkEx e){
  //recovery  //recovery
} catch (FooEx c) {
  // Foo catches Baz & Biff as they are extensions of the Foo 
  //recovery
}  catch(BazEx a)  {
  //recovery
}
// the biggest exception goes last

class BazEx extends Exception {}
class FooEx extends BazEx {}
class BarEx extends FooEx {}
class BiffEx extends FooEx {}
class BoinkEx extends BiffEx {}
