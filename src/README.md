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

\
\
\
\
\
\
\
\

3.1 - JUnit 5

Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.

• @Tag

Bruges til at kunne filtrere tests, hvis man vil køre en række klasse eller metode tests afhængig af det man vil teste - hvor der måske er en række klasser som hænger sammen - eller i modsatte tilfælde hvor man kun vil køre nogle enkelte metode tests i en klasse.

• @Disabled

Bruges til at deaktivere en klasse eller metode test. Kunne være brugbart hvis man har nogle deaktiverede funktion i et program som man senere gerne vil benytte.

• @RepeatedTest

En måde at køre den samme test et bestemt antal gange. Kan være nyttig hvis man har en test, hvor man har nogle parametre som kan variere fra gang til gang.

• @BeforeEach, @AfterEach

En annotation til at markerer at en metode skal køre før eller efter en given test. Kan bruges til at ændre noget data som en test er afhængig af.

• @BeforeAll, @AfterAll

Som overstående, bare hvor man kun annoterer at denne metode skal køres en enkelt gang, hvorimod den overstående @BeforeEach/@AfterEach bliver kørt hver gang.

• @DisplayName

En annotation som giver mulighed for at give test metoden et bestemt navn, så man nemmere kan finde den eller bedre kan forklare præcis hvad testen gør.

• @Nested

Annoterer at denne testklasse er en ikke statisk indlejret klasse. Giver mulighed for at have en eller flere indre klasser i en klasse, som dermed vil have samme initialisering som hovedklassen.

• assumeFalse, assumeTrue

Giver mulighed for at lave en "test" inde i testen, hvor man forventer at noget enten er sandt eller falsk. Hvis dette ikke passer, vil testen stoppe. Kan bruges hvis man har en test hvor der er et krav om at en variable eller et statement enten er sandt eller falsk før man kan teste det man vil teste.
\
\
\
\
\
**Mocking Frameworks**\
\
**Mockito VS. EasyMock**

**Similaraties:**\
Both EasyMock and Mockito are open-source, java-based frameworks.
Both are typically used along with other test, like JUnit or TestNG\
Both follow Record-Replay-Verify patterns.
\
\
\
**Differences:**\
Mockito supports both mocking and spies, whereas EasyMock does not support spies.\
\
In Mockito, we use \
Mockito.when(mock.method(args)).thenReturn(value) \
method for mocking a method calls.
\
\
In EasyMock we use \
EasyMock.expect(mock.method(args)).andReturn(Value) \
method for mocking a method call.\
\
In Mockito, the Mockito.verify(mock).method(args) is used for verifying calls to a mock.\
\
In EasyMock, the EasyMock.verify(mock) is used for verifying calls to a mock, but this method is always used after
calling the EasyMock.replay(mock) method.\
\
In Mockito, throwing exception can be mocked using \
.thenThrow(ExceptionClass.class)\
after calling the Mockito.when(mock.method(args)) method.\
\
In EasyMock, throwing exception can be mocked using \
.andThrow(new ExceptionClass()) \
after calling the EasyMock.expect(..) method.
\
\
\
**Which one would you prefer, if any, and why?:**
Mockito would be my choice.
It seems to me that there are a lot more calls in EasyMock than in Mockito.
Everytime you call a methos in EasyMock, you have to run the following:\
\
EasyMock.replay(someService);\
SomeClass.someMethod(null);\
EasyMock.verify(someService);\
\
\
In Mockito you only have to use:\
SomeClass.someMethod(null);
Mockito.verifyZeroInteractions(someService);

