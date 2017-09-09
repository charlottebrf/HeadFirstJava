//Deserialisation: restoring an object:

FileOutputStream fileStream = new FileOutputStream("MyGame.ser");
// Make a FileOutputStream


ObjectOutputStream os = new ObjectOutputStream(fileStream);
// Make an ObjectOutputStream


Object one = os.readObject();
Object two = os.readObject();
Object three = os.readObject();
// read the object

GameCharacter elf = (GameCharacter) one;
GameCharacter troll = (GameCharacter) two;
GameCharacter magician = (GameCharacter) three;
//cast the objects


os.close();
// Close the ObjectOutputStream
