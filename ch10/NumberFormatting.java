String s = String.format("%, d", 100000000);
=> 1,000,000,000,000

%.2f
%,.2f


int one = 2543267563724;
double two = 75645.675675
String s = String.format(“The rank is %,d out of %,.2f”, one, two);


// %d
// * decimal
format(“%d”, 42);

// %f
// * floating point
format(“%.3f”, 42.0000000);

// %x
// * hexadecimal
format(“%x”, 42);

// %c
// * character
format(“%c”, 42);

// date & time
String.format("%tc", new Date());

// time
String.format("%tr", new Date());


// day of the week
Date today = new Date();
String.formatr("%tA, %tB %td", today, today, today);

//
// For a date for now use Date, for everything else use Calendar
java.util.Calendar


Calendar cal = Calendar.getInstance();


// Key calendar methods
add(int field, int amount);
//add or subtract time from the calendar's field

get(int field);
//return value of the given calendar field

getInstance();
//returns a calendar- can sepcify locale

getTimeInMillis();
//return calendar time in milliseconds

roll(int field, boolean up);
// adds or subtracts time without chnging larger fields

set(int field, int value);
//sets the value of a given calendar field

set(year, month, day, hour, minute) (all ints)
//a common variety of set to set a complete time

setTimeInMillis(long millis)
//Set a calendar's time based on a long milli-time 
