// Q17: Multiple and Hybrid Inheritance — Concept Only
public class InheritanceConceptMain {
    public static void main(String[] args) {
        System.out.println("Read the comments in this program for inheritance concepts.");
    }
}

/*
Multiple inheritance means one child class inherits from two parent classes.
Java does not allow a class to extend two classes because it can create ambiguity
when both parent classes provide the same method (the diamond problem).

Invalid Java syntax (shown only as a comment):
class C extends A, B

Hybrid inheritance combines two or more forms of inheritance, such as
hierarchical and multilevel inheritance.

Java interfaces are commonly used when multiple/hybrid inheritance of type
or behavior is needed. This program intentionally does not create or implement
any interface or executable multiple-inheritance code.
*/
