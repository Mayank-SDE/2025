# Java Backend Development
- Java is compiled and interpreted language.
- Compiler (javac) is a program itself which compiles the java code into the byte code.
- That byte code can run any machine and the only requirement is that machine has the JVM installed in it. 
- JVM executes the byte code and converts the byte code into the machine code which operating system can understand.
- JVM is a virtual machine which can be installed on any Operating System.
- Interpreted code means the code is interpreted line by line.
- JVM is a program written by someone stands for Java Virtual Machine.
- Virtual machine is the fake machine taking resources from main or other machine.
- There is someone playing video on your machine and a bunch of threads are handling that process.
- On Parallel, your code is also getting executed on the machine and if that code is in java, the JVM is responsible, but now we need some threads to execute the process of executing the code.
- The thread which is executing the java code will be taking the ram from the JVM itself not from the main machine. This means that the thread which is executing the java code cannot access the out resources and always refer to the JVM and thus JVM and thread is isolated which ensures thread safety which also makes the Java little bit slower.
- When the Java code get compiled by the javac compiler then an .class file is generated which contains the byte code and further it gets interpreted by the JVM into the machine code.  
- Hello.java --> Hello.class

## JVM 
- **Class loader**
    - All the classes you had defined in your code will be scanning and loading in the class Loader section using JVM using class path.
    - The above process consist of three things : 
        1. Loading - class will be loaded.
        2. Initializing - All the default values assigned to the variables is initialized.
        3. Linking - 
- **Byte Code Verifier**

- **JVM Stack** 
    - Every thread is going to have some initial memory in the form of stack
- **Method Area**
    - Class code
- **Register**
    - There is pc register pointing to the address of some variable. Register is the hardware component which is a storage component. Now the pc register points to the instruction which is going to currently execute.
    - Every thread have their own pc register so that they can run their instruction and each thread have their own JVM stack using which where they can store local variables.
## JIT - Just in time compilation
    - To all the code which is getting repeated again and again and producing the same output will not be compiled again and again instead JIT will perform the just in time compilation of those code
- Running program is called as process.
- Program is set of instructions.
```java
    Car car=new Car();
    // Now the obejct is created in the Heap section and memory is allocated.
    // And the reference is stored inside the stack i.e. car which is holding the address of the 
    // object created inside the heap section.
```
- Address are stored inside the form of Hexadecimal values.
- All the objects are given the memory in the two forms :
    1. Stack
        - All the functions and all the local variables inside it are going to be stored inside the stack.
        - Push and Pop operations are performed on stack following the LIFO i.e. Last in First Out pattern.
    2. Heap