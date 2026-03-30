# Java Assignment 1 – Theory Questions

---

## Q1. What is Java?

Java is a **high-level, object-oriented, platform-independent programming language** developed by James Gosling at Sun Microsystems in 1995 (now owned by Oracle). It is designed to have as few implementation dependencies as possible, following the principle of **"Write Once, Run Anywhere"**. Java is widely used for web applications, mobile apps (Android), enterprise software, and backend systems.

---

## Q2. Is Java platform dependent or independent?

Java is **platform independent**. The Java source code (`.java`) is compiled into **bytecode** (`.class` file) by the Java compiler. This bytecode is not machine-specific — it can run on any machine that has a **JVM (Java Virtual Machine)** installed, regardless of the underlying OS or hardware.

> **Interview Tip:** Java is platform-independent at the **source/bytecode level**, but the JVM itself is platform-dependent (different JVMs exist for Windows, Linux, macOS).

---

## Q3. What is JVM?

**JVM (Java Virtual Machine)** is an abstract computing machine that enables Java programs to run on any device or OS. It:
- Loads and verifies bytecode
- Interprets or JIT-compiles bytecode into native machine code
- Manages memory through **Garbage Collection**
- Provides runtime environment for Java programs

> JVM is the reason Java achieves platform independence.

---

## Q4. What is JDK and JRE?

| Term | Full Form | Purpose |
|------|-----------|---------|
| **JDK** | Java Development Kit | Complete toolkit for **developers** — includes JRE + compiler (`javac`) + debugger + tools |
| **JRE** | Java Runtime Environment | For **running** Java programs — includes JVM + core libraries |
| **JVM** | Java Virtual Machine | Executes bytecode |

> **Rule of thumb:** To *write and run* Java → use JDK. To *only run* Java → use JRE.

---

## Q5. Why is Java called "Write Once, Run Anywhere"?

Java source code is compiled into **platform-neutral bytecode**. This bytecode can be executed on **any platform** that has a JVM installed — Windows, Linux, macOS, etc. — without recompilation. This eliminates the need to rewrite or recompile code for different environments, earning Java the slogan **"Write Once, Run Anywhere" (WORA)**.

---

## Q6. What is a class in Java?

A **class** is a **blueprint or template** for creating objects. It defines the properties (fields/variables) and behaviors (methods) that its objects will have.

```java
class Car {
    String color;      
    void drive() { }    
}
```

> Everything in Java lives inside a class. It is the fundamental building block of OOP.

---

## Q7. What is an object?

An **object** is a **real-world instance of a class**. It has:
- **State** – values of its fields
- **Behavior** – methods it can call
- **Identity** – a unique reference in memory

```java
Car myCar = new Car(); 
```

> Class : Object :: Blueprint : House

---

## Q8. What is the main method in Java?

The `main` method is the **entry point** of any Java application. The JVM looks for this exact signature to start program execution:

```java
public static void main(String[] args)
```

| Keyword | Reason |
|---------|--------|
| `public` | JVM must access it from outside the class |
| `static` | JVM calls it without creating an object |
| `void` | It returns nothing |
| `String[] args` | Accepts command-line arguments |

---

## Q9. What is the use of System.out.println()?

`System.out.println()` is used to **print output to the console** followed by a newline.

- `System` – a built-in class in `java.lang`
- `out` – a static `PrintStream` object
- `println()` – method that prints and moves to the next line

> `print()` prints without newline; `println()` adds a newline at the end.

---

## Q11. What are data types in Java?

Data types define the **type and size of data** a variable can hold. Java has two categories:

1. **Primitive** – byte, short, int, long, float, double, char, boolean
2. **Non-Primitive (Reference)** – String, Arrays, Classes, Interfaces

---

## Q12. Give examples of primitive data types.

| Data Type | Size | Example |
|-----------|------|---------|
| `byte` | 1 byte | `byte b = 10;` |
| `short` | 2 bytes | `short s = 200;` |
| `int` | 4 bytes | `int i = 1000;` |
| `long` | 8 bytes | `long l = 99999L;` |
| `float` | 4 bytes | `float f = 3.14f;` |
| `double` | 8 bytes | `double d = 3.14159;` |
| `char` | 2 bytes | `char c = 'A';` |
| `boolean` | 1 bit | `boolean flag = true;` |

---

## Q13. What is a variable?

A **variable** is a **named memory location** that stores a value which can change during program execution.

```java
int age = 20;  
```

---

## Q14. How do you declare a variable in Java?

```
dataType variableName = value;
```

```java
int number = 5;
double price = 99.99;
String name = "Java";
```

Variables can be declared without initialization, but must be initialized before use (for local variables).

---

## Q15. What is the difference between int and float?

| Feature | `int` | `float` |
|--------|-------|---------|
| Type | Integer (whole numbers) | Floating-point (decimal numbers) |
| Size | 4 bytes | 4 bytes |
| Example | `int x = 10;` | `float x = 10.5f;` |
| Precision | Exact | Approximate (up to ~7 decimal digits) |

---

## Q16. What is type casting?

**Type casting** is the process of converting one data type into another.

- **Widening (Implicit):** Smaller → Larger type, done automatically
  ```java
  int i = 10;
  double d = i;  
  ```
- **Narrowing (Explicit):** Larger → Smaller type, done manually (may lose data)
  ```java
  double d = 9.99;
  int i = (int) d;  
  ```

---

## Q17. What is the default value of int?

The default value of `int` in Java is **`0`**.

> Default values apply to **instance variables** (fields), not local variables. Local variables must be explicitly initialized.

| Type | Default Value |
|------|--------------|
| `int` | `0` |
| `double` | `0.0` |
| `boolean` | `false` |
| `char` | `'\u0000'` |
| Object reference | `null` |

---

## Q18. What is a keyword in Java?

A **keyword** is a **reserved word** that has a predefined meaning in the Java language and cannot be used as identifiers (variable names, class names, etc.).

Examples: `class`, `int`, `if`, `else`, `for`, `while`, `return`, `static`, `void`, `new`, `public`, `private`

Java has **50+ reserved keywords**.

---

## Q19. Can we use reserved keywords as variable names?

**No.** Reserved keywords cannot be used as variable names, class names, or method names in Java. Attempting to do so will result in a **compilation error**.

```java
int class = 5;  
int myClass = 5; 
```

---

## Q20. What is the difference between = and ==?

| Operator | Name | Purpose | Example |
|----------|------|---------|---------|
| `=` | Assignment | Assigns a value to a variable | `int x = 5;` |
| `==` | Equality | Compares two values (returns boolean) | `if (x == 5)` |

```java
int x = 10;       
if (x == 10) { }  
```

---

## Q21. What is an if statement?

An **if statement** is a conditional control structure that executes a block of code **only if a given condition is true**.

```java
if (condition) {
    // executes if condition is true
} else {
    // executes if condition is false
}
```

---

## Q22. Difference between if and switch?

| Feature | `if-else` | `switch` |
|--------|-----------|---------|
| Condition type | Any boolean expression | Value of a variable (int, char, String, enum) |
| Use case | Range checks, complex conditions | Multiple fixed values |
| Readability | Can get complex with many branches | Cleaner for multiple fixed cases |
| Fall-through | No | Yes (without `break`) |

---

## Q23. What is a loop?

A **loop** is a control structure that **repeats a block of code** multiple times until a specified condition becomes false. It avoids code duplication.

---

## Q24. Types of loops in Java?

1. **`for` loop** – when number of iterations is known
2. **`while` loop** – when condition is checked before each iteration
3. **`do-while` loop** – executes at least once, condition checked after
4. **Enhanced `for-each` loop** – iterates over arrays/collections

---

## Q25. Difference between for loop and while loop?

| Feature | `for` loop | `while` loop |
|--------|------------|-------------|
| Use when | Iterations count is **known** | Iterations count is **unknown** |
| Initialization | Inside loop header | Before the loop |
| Syntax | Compact (init; condition; update) | Only condition in header |

---

## Q26. What is break statement?

The `break` statement **immediately exits** the loop or switch block it is inside, skipping any remaining iterations.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) 
    {
        break; 
    }
}
```

---

## Q27. What is continue statement?

The `continue` statement **skips the current iteration** and jumps to the next iteration of the loop.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue;  // skips printing 5
    }
    System.out.println(i);
}
```

---

## Q28. What will happen if we don't write the main method?

The program will **compile successfully**, but the JVM will throw a **runtime error**:
```
Error: Main method not found in class ClassName
```
The JVM cannot find the entry point to start execution.

---

## Q29. Can we run a Java program without class?

**No.** In Java, every piece of code must be inside a class. Java is a purely object-oriented language (at the source level), and a class is the fundamental unit of code. There is no way to write executable Java code outside of a class.

---

## Q30. What happens if we don't compile a Java program?

Java source code (`.java`) cannot be directly executed by the JVM. The JVM runs **bytecode** (`.class` files). If you skip compilation, the JVM has no `.class` file to run, resulting in a **"file not found"** or **"class not found"** error.

> Flow: `.java` → (javac compiles) → `.class` → (JVM runs) → Output

---

## Q31. Can a variable change its data type?

**No.** Java is a **statically typed language**. Once a variable is declared with a data type, it cannot change its type. You can only store values compatible with that type (or use casting).

```java
int x = 10;
x = 3.14;  // Compile error
```

---

## Q32. What is the size of int in Java?

`int` in Java is always **4 bytes (32 bits)**, regardless of the platform. Its range is:
- **Minimum:** -2,147,483,648 (-2³¹)
- **Maximum:** 2,147,483,647 (2³¹ - 1)

> Unlike C/C++, Java guarantees fixed sizes for all primitive types across all platforms.

---

## Q33. Why does Java not support pointers directly?

Java does **not support explicit pointers** for the following reasons:
1. **Security** – Pointers can access arbitrary memory locations, posing security risks
2. **Simplicity** – Pointer arithmetic is complex and error-prone
3. **Reliability** – Eliminates issues like dangling pointers, memory leaks, and buffer overflows
4. **Automatic Memory Management** – Java's **Garbage Collector** handles memory, removing the need for manual pointer management

> Java does use **references** internally, but they are managed and safe — the programmer cannot manipulate memory addresses directly.
