Assignment #2 in Test, By Nicholas Tureczek

1 - Reflection.
 
1.1\
Computer Mouse:\
\
The following tests are what I would preform on a computer mouse to ensure the highest quality.
First I would test every small part of the mouse individually. I.E the mouse wheel, is it sturdy, and the buttons, to check if the material is
good and doesn't easily break. - That might be the unit test of our mouse.\
Stress test of all the buttons, including the wheel, to see the durability of the components.
\
\
Test the optic laser to estimate the lifespan.\
\
Test the hardware and software combined. - Pressing one button and getting the expected result.
\
\
1.2\
Catastrophic failure\
In December 2008 Microsoft's Zune music player encounter a worldwide failure due to the internal clock in the system.
This was a result of the way the device handled a leap year. The problem was that it only handled 365 days, and not 366 which occurs
in a leap year. This resulted in a loop that never ended.\
TDD could have helped to prevent this by following the three laws of TDD:\
1. You must write a failing test before you write any production code.
2. You must not write more of a test than is sufficient to fail or fail to compile.
3. You must not write more production code than is sufficient to make the currently failing test pass.
\

A test of edge cases for the days could have also worked in this case, where we test what happens if 
go above 365 days or below. just to see how the program would react. If this had been done. The infinite 
loop that the Zune encountered, would have been spotted.\
\
\
2 - Two Katas\
2.1 String Utility\
![img.png](img.png)


First I Build the test that should return a simple string of "aBc". I create the CustomStringBuilder class through the test, which returns an empty string.
![img_1.png](img_1.png)

Then the test fails.\
Next I return the wanted string, and run the test to make sure that this is working as intended.
![img_2.png](img_2.png)

Next I want to return the letters of the string in a list.
![img_3.png](img_3.png)
First test fails, while I have given zero characters. This leeds to ideas about a new test we need to write later.
![img_4.png](img_4.png)
Figured that it was smarter to make t in a char Array 
![img_5.png](img_5.png)
Then I fixed the words if it was too short.
![img_6.png](img_6.png)



