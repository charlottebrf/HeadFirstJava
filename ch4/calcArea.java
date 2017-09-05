int calcArea(int height, int width) {
  return height * width;
}

int a = calcArea(7, 12);

short c = 7;
calcArea(c, 15);

int d = calcArea(57);
//not legal

calcArea(2,3);

long t = 42;
int f = calcArea(t, 17);

int g = calcArea();
//not legal

calcArea();
//not legal

byte h = calcArea(4, 20);
//not legal

int j = calcArea(2,3,4);
//not legal
