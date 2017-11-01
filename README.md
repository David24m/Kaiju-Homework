# Kaiju-Project

Model a Kaiju (Large Monster) Attack On A City.

Using TDD, abstract classes and interfaces where appropriate, model the following;

Using a 'Kaiju' abstract class, create two different types of monster (subclasses of the Kaiju class). Parameters for each Kaiju should include; 'name', 'healthValue' and 'attackValue'. Give the Kaiju a 'roar' method which returns a string.

Using a 'Vehicle' abstract class, create two different types of Army vehicle (subclasses of the Vehicle class) to battle the Kaiju. Parameters should include; 'type' and 'healthvalue'.

Give the Kaiju an 'attack' method which can be used to damage vehicles.

Give the Kaiju a 'move'/'fly' method, which returns a string (depending on the Kaiju).

Extensions;

Give the army vehicles two methods of damaging the Kaiju. (Give the vehicles attack methods).

Refactor the code so that the army vehicles implement an interface. (Interface should define the vehicle attack methods).

Expand the model to include buildings, more Kaiju and anything else you can think of.

Create a runner file in which instances of Kaiju can attack and damage instances of damageable classes.
