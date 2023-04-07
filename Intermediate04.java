package org.bcit.midterm.questions;

public class Intermediate04 {

  public static void main(String[] args) {
    Intermediate04Football football = new Intermediate04Football("European football", "Pitch", 2500000);
    Intermediate04Golf golf = new Intermediate04Golf("Golf", "Golf course", 1000000);
    Intermediate04AmericanFootball americanFootball = new Intermediate04AmericanFootball("American football", "Stadium", 500000);
    Intermediate04Basketball basketball = new Intermediate04Basketball("Basketball", "Court", 25000000);
    Intermediate04Baseball baseball = new Intermediate04Baseball("Baseball", "Stadium", 8000000);
    Intermediate04Tennis tennis = new Intermediate04Tennis("Tennis", "Stadium", 500000);

    football.tackle();
    football.celebration();

    golf.swing();
    golf.celebration();

    americanFootball.tackle();
    americanFootball.celebration();

    basketball.shoot();
    basketball.celebration();

    baseball.swing();
    baseball.celebration();

    tennis.swing();
    tennis.celebration();



  }
}
/*
This question tests my ability to work with and understand interfaces and abstract classes. Using interfaces and
abstract classes is a good way to organize similar classes - all implementing the methods from the classes/interfaces
they extend.


Intermediate04:
In this Intermediate Question 04, you are tasked with creating a system of classes that models the relationships
between different types of sports and where they are played. Specifically, you are asked to create classes for baseball,
basketball, football, american football, tennis, and golf.

To model these relationships, you should create at least 2 superclasses to represent contact and
non-contact sports. For example, you could create a superclass called "NoContactSport" that tennis,
golf, and basketball all inherit from. You could also create a superclass called "ContactSport"
that football and american football inherit from.

To model these sports, you should also create at least 3 interfaces.
For example, you could create an interface called "swing" that baseball, golf,
and tennis all implement. You could also create an interface called "tackle" that football
and american football implement, and an interface called "shoot" that basketball implements.

By creating these superclasses and interfaces, you can model the relationships between the
 different types of sports and where they are played. This will allow you to write code that
 can work with all sports, regardless of their specific type, and call on their specific abilities
 when needed.



 */