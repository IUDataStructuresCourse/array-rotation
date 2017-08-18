# Pre-lecture Assignment: Array Rotation

1. Java Installation

   If your computer does not already have Java Version 8 installed,
   you can download and install it from the following URL:
   
   https://java.com/en/download/

2. IntelliJ Project Setup 

  * Create a new project using the 'check out from version control'
    option, selecting GitHub and password access. Use the URL for
	your repository for this assignment, somehting like:
	https://github.com/IUDataStructuresCourse/array-rotation-<username>.git
	
  * Create a 'configuration' for running the program by going to
    the menu 'Run > Edit Configurations'. 
	Click on the '+' and choose 'Application'.
	Name the configuration something like 'Run Main'. 
	Choose 'Main' as the 'Main class'. In the VM options, enter '-ea'.
	Verify that your IntelliJ setup is correct by clicking on
	the run button (green rightward-pointing triangle in the toolbar).
	You should see an exception in the console window pointing to
	the assert on line 22.

3. Implement a method named `rotate` in the `Main` class in the file
`Main.java`. The method should rotate the elements of an array to the
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
first element. Add three more tests with different arrays to the
`main` method.


4. Submit your assignment by committing and pushing it to github.
  Go to the menu 'VCS' > 'Git' > 'Commit Directory ...',
  enter a commit message like 'Hurrah!' and push the 'Commit'
  button, selecting 'Commit and Push' and then again 'Push'
  on the next window.
  
