abstract class Report {
  void runReport() {}
    void printReport() {}
}


class BuzzwordsReport extends Report {
  void runReport() {
    super.runReport();
    //super keyword is a reference to superclass portion of an object - usually will call the subclass method, but using super keyword will override to use the superclass
    buzzwordCompliance();
  }
}
