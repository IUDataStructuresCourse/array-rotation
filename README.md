Implement a method in Java that rotates the elements of an array to
the right by one position.

For example, if the input array is the following array of integers

    {7,4,12,53,32}

then the method should change the array so that it contents are as follows

    {32,7,4,12,53}

Note that the right-most element, 32, wrapped-around to become the
first element.

Create a java file named Rotate.java that includes a class named
Rotate and a method named rotate, as shown below, but filling in the
... with your code for rotating the array A. Test your method by
running this program, then add three more tests to the main method.

     public class Rotate {
          public static void rotate(int[] A) {
                      ...
          }

          public static void main(String[] args) {
              int[] test = {7,4,12,53,32};
              int[] test_output = {32,7,4,12,53};
              Rotate.rotate(test);
              assert Arrays.equals(test, test_output);
          }
     }

