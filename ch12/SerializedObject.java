
// Writing a serialised object to a file:

FileOutputStream fileStream = new FileOutputStream("MyGame.ser");
// Make a FileOutputStream


ObjectOutputStream os = new ObjectOutputStream(fileStream);
// Make an ObjectOutputStream

os.writeObject(characterOne);
os.writeObject(characterTwo);
os.writeObject(characterThree);
// Write the object

os.close();
// Close the ObjectOutputStream
