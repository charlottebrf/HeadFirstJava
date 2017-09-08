public class Doctor {
  boolean worksAtHospital;

  void treatPatient() {
  }
}

public class FamilyDoctor extends Doctor {

  boolean makesHouseCalls();
  void giveAdvice();
}

public class Surgeon extends Doctor {

  void treatPatient() {
    }

  void makeIncision() {
  }
}
