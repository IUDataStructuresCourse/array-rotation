# Pre-lecture Assignment: Array Rotation

1. IntelliJ Project Setup 

  * Create a new project using the 'check out from version control'
    option, selecting GitHub and password access.

  *  Control-click on the array-rotation-<username> directory in the left pane
     and select 'Mark Directory As' > 'Sources Root'.

  * Configure the project structure by going to menu 
    'File' > 'Project Structure'.
    * Set the 'Project SDK' to '1.8'.
    * Set the 'Project language level' to '8 - Lambdas, type annotations etc.'
    * Set the 'Project compiler output' to a new folder inside the
       array-rotation-<username> directory named 'out'.

  * Create a 'configuration' for running the program by going to
    the menu 'Run > Edit Configurations'. Name the configuration
    something like 'Run Main'. Choose 'Main' as the 'Main class'.
    In the VM options, enter '-ea'.

2. Implement a method named `rotate` in the `Main` class in the file
`Main.java`. The method should rotates the elements of an array to the
right by one position.  For example, if the input array is the
following array of integers

~~~~
{7,4,12,53,32}
~~~~

then the method should change the array so that its contents are as follows

~~~~
{32,7,4,12,53}
~~~~

Note that the right-most element, 32, wrapped-around to become the
first element. Test your `rotate` method by changing the `main` method
as follows and then run the program.

~~~~
import java.util.Arrays;

public class Main {
     public static void rotate(int[] A) {
         ...
     }

     public static void main(String[] args) {
		 int[] A = {7,4,12,53,32};
		 int[] A_shifted = {32,7,4,12,53};
		 Rotate.rotate(A);
		 assert Arrays.equals(A, A_shifted);
     }
}
~~~~
    
Add three more tests with different arrays to the main method.  Use
the -ea flag when running java to enable exceptions triggered by the
assert statements.  In Eclipse, go to menu Run=>Run Configurations and
click on the 'Arguments' tab. Enter '-ea' in the text field for 'VM
arguments'.


