/* PROBLEM:
Write a method called printPowersOf2 that prints each power from 2^0 to the
maximum inputted power. The exponent passed to printPowersOf2 will be 0 or
greater.

Example Inputs:
printPowersOf2(3);
1 2 4 8

printPowersOf2(10);
1 2 4 8 16 32 64 128 256 512 1024

*/

public static void printPowersOf2(int power){
    /* Because Math.pow() cannot be used, latestNum is used to gradually
    increase power values. This way, the * operator can be used instead. */
    int latestNum = 1;
    for (int i = 0; i <= power; i++){
        System.out.print(latestNum + " ");
        latestNum *= 2;        
    }
}

/* PROBLEM:
Write a method called printPowersOfN that takes in a base (N) and exponent.
Then the method should print each power from N^0 to the maximum inputted power.
The exponent passed to printPowersOfN will be 0 or greater.

Example Inputs:
printPowersOfN(4, 3);
1 4 16 64

printPowersOfN(5, 6);
1 5 25 125 625 3125 15625

printPowersOfN(-2, 8);
1 -2 4 -8 16 -32 64 -128 256

*/

public static void printPowersOfN(int power, int length){
    //Same as as the printPowersOf2 method.
    int latestNum = 1;
    for (int i = 0; i <= length; i++){
        System.out.print(latestNum + " ");
        latestNum *= power;        
    }
}

/* PROBLEM:
Write a variable that stores the equation below by only using 4 * operators and
no methods from the Math class:

y = 12.3x^4 - 9.1x^3 + 19.3x^2 - 4.6x + 34.2

*/

//Simple case of factorization solves the problem.
double y = 34.2+x*(-4.6+x*(19.3+x*(-9.1+12.3*x)));

/* PROBLEM:
Write a method called cylinderSurfaceArea that takes in the radius and height
of a cylinder and returns its surface area.
*/

public static double cylinderSurfaceArea(double radius, double height){
    // Introduces the concept of Math.PI.
    return 2 * Math.PI * radius * (radius + height);
}

/*
Write code that uses a for loop to print out the first 12 Fibonacci numbers.
*/

int num = 1;
int num2 = 0;
int temp = 0;

for (int i = 0; i < 12; i++){
    System.out.print(num + " ");
    /* Every loop, the previous number must be added onto the current number,
    but the current number needs to be stored for next time. */

    /* temp stores the previous number that needs to be added onto
     the current number to produce the next output. */
    temp = num2;
    /* num2 now stores the current number, which will become the next number
    to be added. */
    num2 = num;
    // Thanks to temp, num adds the previous number, not the modified num2 value.
    num += temp;
}