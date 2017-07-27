# Pre-lecture Assignment: Array Rotation

1. Read the following tutorial for using Github and clone your version
   of the array-rotation repository onto your computer.

   http://homes.soic.indiana.edu/classes/spring2016/csci/c343-yye/github.php

2. Eclipse
    1. Download and install [Eclipse](https://eclipse.org/downloads/)
       if you have not already.
    2. Open Eclipse and set the workspace directory to the directory
      created when you cloned the array-rotation repository.
    3. Create a new Java project with project name 'Rotate'.
      In 'Project layout', choose 'Use project folder as root
      for sources and class files'. Click 'Finish'.
    4. Create a new Java class using the menu sequence File=>New=>Class.
      Name the class `Rotate` and click on the option to
      create a `main` method.
    5. Verify that you can run this Java program by changing the `main`
        method as follows:
     
        ~~~~
        public static void main(String[] args) {
            System.out.println("Hello, World");
        }
        ~~~~
        
        and click on the green button with the 'play' symbol, that is, a
        rightward pointing triangle. In the console window, you should
        see the output `Hello, World`.
   6. Use git to add, commit, and push the Rotate directory and its contents
     to your repository. Verify on github.com that the push was successfull.

3. Implement a method named `rotate` in the `Rotate` class that
rotates the elements of an array to the right by one position.  For
example, if the input array is the following array of integers

  {7,4,12,53,32}

then the method should change the array so that it contents are as follows

  {32,7,4,12,53}

Note that the right-most element, 32, wrapped-around to become the
first element. Test your `rotate` method by changing the `main` method
as follows and then run the program.

    ~~~~
    import java.util.Arrays;

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
    ~~~~
    
Add three more tests with different arrays to the main method.  Use
the -ea flag when running java to enable exceptions triggered by the
assert statements.  In Eclipse, go to menu Run=>Run Configurations and
click on the 'Arguments' tab. Enter '-ea' in the text field for 'VM
arguments'.


