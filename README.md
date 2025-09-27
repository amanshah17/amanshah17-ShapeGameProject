# Shape Based Game

## Project Title
**Shape Based Game**

## Technologies Used
- Java (Core Concepts)
- Object-Oriented Programming (OOP)
  - Classes & Objects
  - Inheritance
  - Polymorphism
  - Upcasting
  - Method Overriding & Overloading
  - Constructor Overloading
  - HAS-A Relationship
  - Interface
- SOLID Principles

## Description
The **Shape Based Game** is an interactive educational Java project designed to help students from classes 6 to 12 understand and explore 2D and 3D geometric shapes. The project leverages object-oriented programming concepts to create a robust, modular, and engaging learning experience.  

The game implements a structured class hierarchy with a base abstract class `Shape`, extended by `TwoDShape` and `ThreeDShape` abstract classes. Concrete shape classes such as `Circle`, `Square`, `Rectangle`, and `Cylinder` inherit from these, demonstrating **inheritance** and **polymorphism**. Each shape overrides methods like `printDetails()`, `printArea()`, `printPerimeter()`, `printVolume()`, `printLSA()`, and `printTSA()` to provide shape-specific calculations, showcasing **method overriding**.  

The project uses **upcasting**, allowing the game engine to treat all shapes uniformly through their abstract type while still executing shape-specific behavior. **Constructor overloading** and **method overloading** are applied to create flexible object initialization. The **HAS-A relationship** is demonstrated through the `Game` class, which contains shape instances to manage gameplay.  

Following **SOLID principles**, the codebase is maintainable and extensible, allowing new shapes to be added easily. The game features a **menu-driven interface**, enabling students to select 2D or 3D shapes, input dimensions, and receive detailed outputs including areas, perimeters, volumes, lateral surface area (LSA), and total surface area (TSA).  

This project reinforces students’ understanding of geometric concepts while providing a practical example of applying core Java OOP concepts.

## Features
- Interactive menu-driven interface
- Support for 2D shapes: Circle, Square, Rectangle
- Support for 3D shapes: Cylinder
- Calculates area, perimeter, volume, LSA, TSA
- Demonstrates OOP principles and SOLID design
- Easy to extend with new shapes

## Usage
1. Clone the repository:
   ```bash
   git clone https://github.com/amanshah17/ShapeBasedGame.git
