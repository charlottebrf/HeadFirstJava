import java.net.*;
class Chat implements Serializable {
  transient String currentID;
  //transiet means don't save this variable during serialization 
  String userName;
}
