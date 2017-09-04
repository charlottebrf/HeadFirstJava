// int x = 34.5;
float x = 34.5f;

boolean boo = x;

int g = 17;

int y = g;

y = y + 10;

short s;

s = y;
// won't work as an int (y) is bigger than a short (s)

byte b = 3;

byte v = b;

short n = 12;

v = n;
// won't work as byte (v) is smaller than short (n)

byte k = 120;
// won't work as byte is too small for this value - should be an int or a long 
