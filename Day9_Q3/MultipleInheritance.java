package com.Day9_Q3;

public class MultipleInheritance {

}

/*
 * 
 * Q. Why is multiple inheritance is not supported in Java at class level?
 * 
 * Ans: At class level multiple inheritance is not supported in Java because of the
 *      ambiguity.
 * 
 * for example there are 3 classes A,B and C
 * 
 * class C extends from both classes, class A and class B i.e. class A and B are the parent
 * class of class C.
 * 
 * if both classes A and B have a method of similar name say printDetails(), then on
 * calling the method printDetails(), JVM will be confused that which method it has to call.
 * 
 * therefore multiple inheritance is not supported in Java.
 * 
 */

  