# Java OOP Concepts – 

This project is a collection of Java programs demonstrating key Object-Oriented Programming (OOP) concepts. Each concept is organized into separate folders and includes self-contained `.java` files with practical examples.

---

## 📁 Project Structure


---

## 📌 Concepts Covered

- **Class & Objects**
- **Constructors (Default & Parameterized)**
- **Inheritance**
- **Dynamic Method Dispatch (Runtime Polymorphism)**
- **Method Overriding**
- **Method Overloading**

---

## ▶️ How to Run

Each `.java` file is self-contained and can be compiled and run individually.

### Steps:

1. Open a terminal/command prompt.
2. Navigate to the directory containing the `.java` file.
3. Compile the file:

   ```bash
   javac FileName.java
   ```
# 🎮 Java Mini Games – Guess the Number & Rock Paper Scissors

This project contains two simple console-based Java games demonstrating object-oriented concepts and user interaction through standard input/output.

---

## 📂 Files

### `Guess_Number.java`
A game where:
- The program randomly generates a number between 1 and 100.
- The user tries to guess it.
- The program tells whether the guess is too high or too low.
- It keeps track of the number of attempts.

**Features:**
- Uses a class `Game` with the following methods:
  - `Game()` constructor: initializes a random number.
  - `userInput()`: handles user input.
  - `isCorrect()`: checks guess and provides feedback.

---

### `Rock_Paper.java`
A basic **Rock-Paper-Scissors** game where:
- The user chooses Rock (1), Paper (2), or Scissors (3).
- The computer randomly selects its move.
- The winner is determined using standard game rules.

---

## ▶️ How to Run

### Compile
**For Guess Number**
```bash
javac Guess_Number.java
java Game           # For Guess_Number (assuming main is inside Game class)

```
**For Rock Paper Scissors**
```bash
javac Rock_Paper.java
java Rock_Paper     # For Rock Paper Scissors game

