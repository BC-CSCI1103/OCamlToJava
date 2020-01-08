#  CSCI 1103 Computer Science I Honors

## Fall 2019

Boston College

---

## Lecture Notes

## Week 14: Code Reuse and Abstract Data Types (ADTs)

**Topics:**

1. code reuse and polymorphism

---

At the outset of this course we were naturally focussed on developing simple programs that solved small problems.  We learned that functions played the key role and we've spent a fair amount of time writing functions and collections of functions that cooperatively carry out a computational task.

Here at the tail end of the course, we've turned out attention to aspects of coding in the large. We've found that groups of related definitions can be grouped together in larger modular units. These related definitions common implement either:

1. some sort of useful service, or

2. a new type.

Examples of services include input/output support, network support, graphical support and so on. We won't consider them further here.

Learning how to develop new types is an especially important topic and is one of the main themes of the follow-on course (CS1102). Generally speaking, most people follow the practice of abstract data types (ADTs) as proposed by Barbara Liskov (in the programming language CLU).

### Abstract Data Types

The ideas relating to ADTs are motivated by practical concerns about the engineering of software and the software lifecycle.  In particular, well-designed ADTs ensure that when some agent designs and implements a new type, those making use of the new type (the clients) have what they need and they don't have what they don't need.  In particular, they don't have to know about the type's internal representation and implementation details.

ADTs have two parts:

1. a *specification*

2. an *implementation*

Different programming languages provide varying levels of support for developing ADTs. Generally speaking, specifications involve types so languages without type notation (such as Python) don't support ADTs as robustly as languages that feature type notation such as Java, OCaml, C#, F#, Swift and so forth.

The main requirements for the specification of an ADT are:

1. a name for the new type
2. a list of specifications of operations on values of the new type

The main requirements for the implementation of an ADT are:

1. a hidden, internal type for representing values of the new type
2. implementations of each of the specified operations.

In practice, the documentation of the specified operations on the new type often include efficiency information.

#### Examples

Below are specifications of two example ADTs. Implementations in OCaml, Python and Java are linked.

1. A `Point` ADT
2. A `Pair` ADT

#### Point ADT

A point in the Cartesian plane.

Specification:

 - Name: `Point`

 - Operations:
    
    ```ocaml
    make : float * float -> Point
    getX : Point -> float
    getY : Point -> float
    toString : Point -> String
    compare : Point * Point -> int
    ```

#### Pair ADT

A pair of values of type `S` and` T`.  The symbols `S` and `T` are type variables.

Specification:

 - Name: `Pair(S, T)`
    
 - Operations:
    
    ```ocaml
    make : S * T -> Pair(S, T)
    getLeft : Pair(S, T) -> S
    getRight : Pair(S, T) -> T
    toString : Pair(S, T) -> String
    compare : Pair(S, T) * Pair(S, T) -> int
    ```
    
    
    
    
