File f = new File("MyCode.txt");
File dir = new File("Chapter7");
dir.mkdir();

if (dir.isDirectory()) {
  String[] dirContents = dir.list();
  for (int = 0; i < dirContents.length; i++) }
  System.out.println(dirContents[i]);
}
}

System.out.println(dir.getAbsolutePath());
boolean isDeleted = f.delete();
//file doesn't represent or give direct access to data inside the file

BufferedWriter writer = new BufferedWriter(new FileWriter(aFile));
//don't need to keep a reference to the FileWriter object 
