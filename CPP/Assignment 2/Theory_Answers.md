
# Assignment 2 Theory Answers

## Q1.2 Initialization vs Assignment
Initialization happens when the object is created. Assignment happens after the object already exists.

Initialization is preferred when:
- setting values during object creation
- initializing const members
- using initializer lists in constructors

## Q2.2 Reference as Alias
A reference variable is another name for the same variable.
Both variables refer to the same memory location.

In swapByReference(), changes directly affect the original variables.

## Q3.2 Pointer vs Reference
Differences:
1. Pointer stores memory address, reference is alias.
2. Pointer can be NULL, reference cannot.

Pointers can be reseated (point to another variable).
References cannot be reseated once initialized.

## Q4.3 new vs malloc
malloc:
- does not call constructors
- returns void*
- does not initialize objects

new:
- calls constructors
- returns correct pointer type
- can initialize objects

## Q5.2 Default Constructor Generation
Compiler generates a default constructor when no constructor is defined.

It will NOT generate one if any constructor is already defined.

Yes, constructors can be overloaded.

## Q6.3 Initializer List
Const members must be initialized using initializer list because their value cannot change later.

Assigning a const member inside constructor body causes compilation error.

Initializer list is faster because initialization happens directly instead of first creating then assigning.
