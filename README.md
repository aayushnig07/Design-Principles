# Design-Principles
A repo which contains best practices for OOPs

Here I am trying to convert some procedural codes to Object Oriented way.

I am trying to incorporate the following rules in my style of programming:
Rule 1: Abandon static method (Singleton pattern)
Static method gives only memory advantage, but it can be achieved using cache, lazy loading, object pooling, etc.
Unit testing becomes tough using static method
Rule 2: LSP (Listkov Substitution Principle)=> Inheritance fails LSP, aggregation is alternative
Rule 3: Type check is sinful (anti-abstraction) Idea is to treat everything equal
Rule 4: ISP – Interface Segregation Principle
Rule 5: Avoid flags (method to remove flags=>flags becomes interface)
Rule 6: Avoid cyclomatic complexity (Good code must have Cyclomatic complexity<10)
Rule 7: YAGNI (You aren’t gonna need it)
Rule 8: OCB (Open for adding code, closed for changing code)
Rule 9: Magic strings/ numbers are bad => hard coded
Rule 10: SRP (Single Responsibility Principle) Most imp principle =>Things that don’t change together must be kept separate || Control the class size. Max method =12, avg method= 4~5. (Ignore getter/setter)
Rule 11: Don’t use Swiss Knife (Antipattern)=> Util class, helper class is example
Rule 12: Don’t use GOD Class (Antipattern)=> Class that dominates your code. Controller,Handler,Manager class
Rule 13: Arrow code pattern must be avoided
Rule 14: Don’t return Boolean for error. Its procedural
Rule 15: Null for errors should not be used/ 0 – 1 for errors
Rule 16: Don’t use functional interface => Interface with one method. Solution is to go lambda (Functional)
Rule 17: Always Program to interface
Rule 18: DIP (Dependency Inversion Principle) High level should not know low level but vice versa
Rule 19: Coupling is bad, Cycle coupling, or bi-directional coupling is worse
Rule 20: Many to many coupling must be avoided
Rule 21: Don’t use overloading for family (inheritance)
Rule 22: Down use down casting
Rule 23: Use upcasting=> leads to abstraction
Rule 24: Follow DRY principle=> Don’t repeat yourself
Rule 25: Favor composition over inheritance (ref over extends) =>inheritance breaks LSP
Rule 26: Follow KISS (Keep simple and sweet)
Rule 27: Do not use nested interfaces
Rule 28: Do not use default methods.
Rule 29: Do not use Optional
Rule 30: Do not use inner classes (Can use private class)
Rule 31: Avoid using Booleans, instead throw an exception.
