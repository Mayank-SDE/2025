# Complete Interview Preparation
## Programming Language
### Introduction, Variables and Operators
#### Introduction to Java
- **Platform Independent**
    - Platform is the combination of operating system and architecture you are using.
    - Example :
        - Windows + Intel 
        - Linux + Intel
        - Windows + AMD
- **Before Java**
    - You write a c/c++ program and if you want to run this program in one platform you compile this using a compiler that generates an executable for a particular platform.
    - The executable that you generated on platform 1 cannot be used on platform 2 because they are different platforms and their executables might be different.
    - If you want to run that program on another platform you must have the compiler of that platform and then convert it to the executable of that platform.
    - This is how programming used to happen before JAVA.
- **After Java**
    - In Java when you compile your program that program is compiled into the Java Byte code using the Java compiler.
    - Where Java Byte code is an intermediate code which is platform independent code.
    - This byte code can run on any platform which has that platform specific JVM installed in it.
    - JVM stands for Java Virtual Machine. This is a Machine specific software which is responsible for running byte code on that machine.
    - JVM is different for Windows, Linux and Mac IOS.
    - As a programmer you have no need to worry about the machine specific things you only need to write your program once, and you can run it anywhere.
    - This is why we call Java as platform independent.
    - As compared to C/C++ programming, Java has simple compilation and complex running process.
    - On the other hand the C/C++ has complex compilation and simple running process because here we are generating the machine specific code.
    - In C/C++ there is a concept of pointer and if you want to pass the object/non-primitive type to the function then you have three different ways - 
        1. Pass by reference
        2. Pass by pointer
        3. Pass by value
    - In Java, you will always pass the object/non-primitive type as references.
    - Primitives are normal variables and are passed by values.
    - In C/C++ there is concept of operator overloading and which is not present in Java. 
- **Advantages**
    1. Platform independent
    2. Popular - 3 billion devices, 9 million developer and Language of Android.
    3. Simple
    4. Secure - In C/C++, you write code and then on compilation the machine code is generated without monitoring and in Java your code is compiled into the Java byte code and that byte code is interpreted by the JVM i.e. Java Virtual Machine which acts as a Monitoring Manager tool also. It can make your Java Byte code more secure by ensuring that non-secure things are not running on your machine. This is how Java is more secure as compared to C/C++. Also, Java does not have pointers, so there is no way to directly access memory in Java it is only references. Thus, more secure as compared to C/C++.
    5. Statically Typed - This is where Java is similar to C++ and different from python. In C/C++/Java if you want to use a variable you have to declare it first with the datatype information as well. In python, it is not like that. You make a variable assign it some values and start using it. The advantage of statically typed language are that since the type is not decided at the runtime your program becomes faster.
    6. Automatic garbage Collection - No need to de-allocate the dynamically allocated memory just like in C/C++. 
    7. There is index out of bound checking.
    8. There is better Exception Handling.
    9. There is better multi-threading.
    10. In Java, objects/non-primitives are by default references so not allowed to pass it as value.
    11. There are many issues in Java which are handled in compile time itself. Java programs are more maintainable and this is why Java is preferred more in the industry.
    12. It is considered as programming language for the software developers rather than student.
#### Writing First Program in Java
- Java is platform independent and java programs are portable, you write once and use it anywhere.
- In C/C++ the size of the integer varies from compiler to compiler and this is not the case with Java it is fixed it is 4 bytes.
- **Setup Environment**
    - Download JDK
    - IDE
        - IntelliJ
        - BlueJ
        - Eclipse
        - Online Compiler - ide.geeksforgeeks.org
    - CLASSPATH : path in operating system where a path variable decide where all the commands might be present. When you type a command on the console then your os searches it on the path variable.
- **JDK Architecture**
    - JDK Java Development Kit
        - JRE (Java Runtime Environment)
            - JVM (Java Virtual Machine)
            - Java Class Library
        - Dev Tools : Dev Tools are tools that required for the development like java compiler, java debugger, java document generator.
    - It is the Software tool offered by the Oracle so that you can develop Java Applications.

```java
    // Java first hello world program
    public class Test{
        // This is the main method, this is where the execution of the java programs begins.
        public static void main(String[] args){
            System.out.println("Hello World!");
        }
    }
```
- In Java, everything you write it must be inside some class. Whereas in C/C++ you can write the code outside the class also, it can simply be collection of functions.
- The main method is made public, so that JVM can access it from outside and start executing the code.
- static method are special method which can be called without creating the object. So, the JVM does not need to create a separate object of the class and called the main method instead it can be called directly without creating the object of the class.
- void is the return type of the main method.
- String[] args are the command line argument, so that you can pass the arguments through the command line when executing it from the command line. Not mostly used.
- System is the class, where out is the object of the PrintStream class which is used for printing something on the screen. println is the method inside the PrintStream class.
```bash
    # Compiling the code i.e. invoking the compiler
    # After the compilation the bytecode is generated inside the Test.class file 
    $ javac Test.java 
    # Running the code
    # The byte code is interpreted line by line and is given to JVM as an input
    # by the JVM i.e. Java Virtual Machine
    $ java Test
```
#### Variables and Data types in Java
- When we write a program in any programming language this program contains the instructions and data.
- Variable is a way to access and store the data.
- This variable can be of any type.
- To represent different types of data we have different datatype.
- Different data types represent different ranges of data which can be stored in a particular datatype.
- Data type also specifies the amount of memory that is allocated to a particular variable. e.g. int - 4 bytes, char - 2 bytes
- In Java, we must specify the data type of variable before using it. We must declare it before using it.
- This is not the requirement in other programming languages like python. Where we are not required to write the data type and directly assign the value and start using it which also makes it slower as compared to Java because the type of variable is being decided on the runtime and in Java it is decided on the compile time itself. 
- These languages Java/C/C++ are statically typed languages because we decide the data type of variable and then start using it.
- Languages like Python are called dynamically typed languages. In Python, it is decided at the runtime how much memory is to be allocated to a particular variable.
- Statically typed languages are faster as compared to Dynamic typed language.
```java
    public class Test{
        public static void main(Strng[] args)
        {
            int age=23;
            String name="Sandeep";
            float weight=70.50;
            System.out.println(age);
            System.out.println(name);
            System.out.println(weight);
        }
    }
```
- **Variable Naming**  
    - Valid Name : ab, AB, aBc, a1, a12, _a, a_b, ab$, $ab.
    - In-valid Name : ||ab, a#, a!, else, do etc
    - Allowed - (a-z), (A-Z), (0-9), (_, $) Cannot begin with the digit.
    - Not allowed - keywords are not allowed and other special symbols.
    - It follows camelCase pattern. e.g. name, nameOfPlayer, firstDate, firstName etc.
    - If you have constant variabels write it in uppercase. 
    ```java
    final int MAX=30;
    ```
    - If multiple words are involved in the naming of the constant variable then separate them using the underscore.
    ```java
    final int MAX_AGE=20;
    ```

- **Types of Variable in Java**
    1. **Primitive Type**
    - These are of basic types.
    - The very first bit of every data type is reserved for the sign bit. i.e. for positive 0 and for negative value 1.
        - boolean : true or false i.e. 1 byte. However, it takes only 1 bit but since 1 byte is the smallest unit of the memory. 
        - byte : -128 to 127 or (-2<sup>7</sup> to 2<sup>7</sup>-1)
        - short : 32768 to 32767 or (-2<sup>15</sup> to 2<sup>15</sup>-1)
        - int : -2147483648 to 2147483647 or (-2<sup>31</sup> to 2<sup>31</sup>-1)
        - long : -2<sup>63</sup> to 2<sup>63</sup>-1
        - float : single precision 32 Bit - 4 bytes
        - double : Double Precision 64 Bit - 8 bytes
        - char : 16 Bit Unicode characters ( '\u0000' to '\uffff')(Hexadecimal representation of range.) 0 to 2<sup>16</sup>-1
    - If you wish to store some more larger values in this range then there is class called BigInt in Java. 
    ```java
        
        public class Main {
            public static void main(String[] args) {
                boolean isValid = true;
                byte marks = 90;
                float pi = 3.14F;
                float div = 15.0f / 4.0f;
                long views = 10000000000L;
                char gender = 'M';
                System.out.println(isValid);
                System.out.println(marks);
                System.out.println(pi);
                System.out.println(div);
                System.out.println(views);
                System.out.println(gender);

            }
        }
    ```
    2. **Non-Primitive Type** 
    - These are objects of some classes.
    - When you are creating the array, basically you are creating the object.
        1. String 
        2. Array
        3. User Defined Class Types
    ```java
        public class Main {
            public static void main(String[] args) {
                Point point = new Point();
                point.x = 10;
                point.y = 20;
                System.out.println(point.x + " : " + point.y);
            }
        }

        class Point {
            int x;
            int y;
        }
    ```
    - Non-primitive data types are classes either created by you or pre-defined.
    - We create the object of the non-primitive data type using the new operator.
    - We access the methods or object of the non-primitive type using the dot operator.  
#### **Primitive Types V/S Non-Primitive Types**
 - Non-Primitive Type variables are always references.
 - Memory for non-primitive data type is always allocated on Heap.
 - Member of Non-Primitives get default values like int variable get 0, boolean get false etc.
 - Primitive types are stored in the stack memory and Non-primitive are stored in the Heap memory.
 - Stack memory is the memory which are used for function calls.
 - Heap memory is generally used in programming language for dynamic memory allocation.
 - Java allocates non-primitive types into the Heap area dynamically at the run time.
    ```java
        public class Main{
            public static void main(String args[])
            {
                // No memory is allocated in the heap area
                // The references is stored in the stack
                // Until and unless you use the new operator 
                // it will not create the object in the Heap section
                Point p1;
                
            }
        }
        class Point{

        }
    ```
 - Default values of all non-primitive types data member are :- 
    ```java
        package CIP;

        public class Test {
            public static void main(String[] args) {
                Point point = new Point();
        
                System.out.println(point.isValid);
                System.out.println(point.marks);
                System.out.println(point.pi);
                System.out.println(point.div);
                System.out.println(point.views);
                System.out.println(point.gender == '\0');
                System.out.println(point.div1);
            }
        }
        
        class Point {
            boolean isValid;
            byte marks;
            float pi;;
            long views;
            double div;
            long div1;
            char gender;
        }
        
        // Output ->
        //      false
        //      0
        //      0.0
        //      0.0
        //      0
        //      true
        //      0
    ```
  - However, in case of primitive types if you are accessing the non-initialized primitive variables then you will get the compiler error that you have not initialized the variables. But for non-primitive types, data members are by default initialized with default values.
  - If there are data members which are itself references of some other non-primitive types then they are initialized as null.  
  ```java
        package CIP;
        public class Test {
            public static void main(String[] args) {
                int x;
                System.out.println(x);
                /*
                 * Produces Compilation error
                 * cip\Test.java:6: error: variable x might not have been initialized
                 * System.out.println(x);
                 */
            }
        }
  ```
#### Wrapper classes in Java
**Primitive Types - Wrapper Classes**
- Char -> Character
- byte -> Byte
- short -> Short
- int -> Integer
- long -> Long
- float -> Float
- double -> Double
- boolean -> Boolean
* Java allows you to have Non-primtive types for every primitive type.
* There are built-in class in Java where every primitive types correspond to an Non-primitive type wrapper class.
* Need of wrapper classes are in Generics and Collections. To support the fully Object-Oriented Design pattern.
* These primitives types have come as legacy from C/C++ and are more efficient as compared to the Wrapper class.
#### Auto-Boxing and Un-Boxing
 ```java
  package CIP;
  public class Test {
      public static void main(String[] args) {
          int x1 = 10;
          Integer x2 = x1; // Auto-Boxing
          int x3 = x2; // Auto-Un-Boxing
            System.out.println(x1); // 10
            System.out.println(x2);// 10
            System.out.println(x3); // 10
      }
  }
 ```
 - Auto-Boxing means the primitive type automatically becomes the equivalent Non-Primitive type Wrapper class.
    ```java
        package CIP;
        public class Test {
            public static void main(String[] args) {
                Integer num1 = 400, num2 = 400;
                System.out.println(num1 == num2); // false
                Integer num3 = 4, num4 = 4;
                System.out.println(num3 == num4); // true

            }
        }
        /*
            Sometimes it will print true for smaller values because
            Java caches some values and for smaller values it might happen
            Java makes the other references to point to the same literal
        */
    ```
#### Type Conversion in Java
1. **Widening or Implicit Conversion**
    - byte -> short -> int -> long -> float -> double
    - char -> int
    - Yes, conversion of long to float is considered as widening. Because the largest value possible in float is larger than the largest possible value possible in long. However, you still loose some trailing digits.
    ```java
        package CIP;
        public class Test {
            public static void main(String[] args) {
                byte x1 = 1;
                System.out.println(x1); // 1
                short x2 = x1;
                System.out.println(x2); // 1
                char ch = 'g';
                System.out.println(ch); // g
                int x4 = x2;
                System.out.println(x4); // 1
                int ch1 = ch;
                System.out.println(ch1); // 103
                long x5 = x4;
                System.out.println(x5); // 1
                float x6 = x5;
                System.out.println(x6); // 1.0
                double x7 = x6;
                System.out.println(x7); // 1.0
            }
        }
    ```
2. **Narrowing or Explicit Conversion**
    ```java
    package CIP;
    public class Test {
        public static void main(String[] args) {
            double num1 = 65.6878;
            int num2 = (int) num1;
            char ch = (char) num2;
            System.out.println(num2); // 65
            System.out.println(ch); // A
        }
    }
    ```
    - There is high chance of loss of data.
    - You must explicitly type cast to the smaller data type. Which is called as narrowing.
#### Input in Java 
- There are two ways of taking input in Java
1. Buffered Reader
    - BufferedReader is a class which is used to read a character or sequence of character.
    - It has simple functions like which is read() which reads a character.
    - Another function read() which reads array of characters.
    - readLine() function which reads a line.
    ```java 
            package CIP;
            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStreamReader;

            public class Test {
                public static void main(String[] args) throws IOException {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Enter the full name :");
                    String name = bufferedReader.readLine();
                    System.out.println("Enter your age : ");
                    int age=Integer.parseInt(bufferedReader.readLine()+"");
                    System.out.println("Your full name is :" + name);
                    System.out.println("Your age is : "+age);

                }
            }

    ```
    - new BufferedReader() expects the streams of characters to read data from.
    - System.in is a static object mentioned in the System class of InputStream and it is converted into the character stream using the new InputStreaReader() constructor and which is later as a character stream is passed into the BufferedReader() constructor which was already expecting the character of stream.
    - System.in is an input stream which gives stream of bytes.
    - InputStreamReader() converts the stream of bytes into the character stream i.e. stream of characters
    - BufferedReader expects the stream of characters to read data from.
    - We specify the input stream using the System.in which is a standard stream i.e. keyboard
    - in is an object of InputStream.
    - When using the Integer.parseInt() always remember to pass the string using the bufferedReader.readLine() and not the bufferedReader.read() because it expects the string as an argument and not the character. And do try to convert the string passed as an argument using the + "" operation otherwise it will consider as an empty string and add the equivalent UNICODE value to it.
    - BufferedReader throws a checked exception knows as IOException and you must add the declaration of that exception in the function definition where you are using the BufferedReader() method.
    - import is the keyword used for adding all the library classes from other files and are not part of your file.
    - import java.io.*; means you want to use all the classes defined inside the package io.
    - package are the way to organize your software.
    - One package can contain many classes. Grouping of classes serving similar functionality into one package.
    - Packages contain related classes together.
    - The simplicity of Java is that they also consider the packages as folder structure.
    - import java.io.*; means that java is the folder inside it io is the folder where all the classes are defined.
    - so packages also define the folder structure.
    - The class path you had set contains all the root of these directories and inside these directories there are packages which also define the folder structure.
    - The folder which has the java folder inside it must be part of the class path. This is how Java finds out the libraries classes and functions.

2. Scanner Class
    - Scanner is an advance method for reading input from the user.
    - It was added in later version of Java.
    - Scanner can read formatted input.
    - It has different functions for different data types.
    - nextInt(), nextFloat(), next() for single word, nextLine() for reading the whole line.
    - Scanner has functions to read the basic data types.
    ```java
        package CIP;
        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Scanner;
        public class Test {
            public static void main(String[] args) throws IOException {
            
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your name : ");
                String name = sc.nextLine();
                System.out.println("Enter your age : ");
                int age = sc.nextInt();
                System.out.println("Enter your salary : ");
                float salary = sc.nextFloat();
                System.out.println("Your name is : " + name);
                System.out.println("Your salary is : " + salary);
                System.out.println("Your age is : " + age);
            }
        }

    ```
#### **Buffered Reader VS Scanner**
- BufferedReader is the very basic way to read the input. It is mainly used to read the character stream.
- BufferedReader is faster as compared to the Scanner. Because Scanner does lots of post-processing for parsing the input.
- BufferedReader is more flexible because you can also specify the buffer size that you want to read at a time.
- BufferedReader has larger Buffer for reading the data as compared to Scanner.
- This advantage are only there when you are reading large input.
- In general Scanner class serves the purpose.
- BufferedReader is synchronized. i.e. If you are using multiple threads then BufferedReader should be preffered.

#### Output in Java
- There are mainly 4 methods to produce something on the screen.
    1. System.out.prtin(); 
        - Print something without appending the new line.
    2. System.out.println();
        - Print something with appending the new line.
    - The above both methods are used to produce the string, numbers or the combination of numbers and string.
    - Whenever you are printing the non-primitive then these non-primitive are converted into the string, and then they are printed.
    - These functions also able to handle the primitive also.
    - These functions are overloaded that means print() and println() can take string, float, int etc. as a parameter and print the result on the console.
    ```java
            package CIP;
            public class Test {
            public static void main(String[] args) throws IOException {
            
                int x = 10, y = 30;
                char ch = 'M';
                String name = "Mayank Choudhary";
                System.out.print(x + " ");
                System.out.print(y);
                // '\n' is used for printing the new line
                System.out.println("\n" + ch);
                System.out.println(name);
                /*
                 * Output ->
                 * 10 30
                 * M
                 * Mayank Choudhary
                 */
            }
        }
        
    ```
    3. System.out.printf(); or System.out.format()
        - Both are same.
        - These functions are particularly useful for formatted outputs.
        - When you want to print the floating point numbers, date and time.
        - So, this particularly functions are mainly useful for numbers.
        - printf() or format() are the format string.
        - The first parameter of this function contains the string along with some placeholders.
        - These placeholders are the replaced by the values defined in the remaining parameters.
        - Placeholders begin with % sign and %d represents int value, %s for string, %c for characters and %f for float.
        ```java
            package CIP;
            import java.io.IOException;

            public class Test {
                public static void main(String[] args) throws IOException {
                
                    int x = 10, y = 20;
                    System.out.printf("Value of x is %d and value of y is %d ", x, y);
                    float z = (float) Math.PI;
                    System.out.println(z);
                    System.out.format("Value of z is : %f\n", z);
                    // Print only two digits after the decimal
                    System.out.format("Value of z is : %.2f\n", z);
                    // Here 5 specifies that you need to print atleast 5 characters
                    System.out.format("Value of z is : %5.2f\n", z);
                    // Here, 05 specifies that the output must be of atleast 5 characters
                    // and rather than making it empty, fill it with 0
                    System.out.format("Value of z is : %05.2f\n", z);

                    /*
                     * Output ->
                     Value of x is 10 and value of y is 20 3.1415927
                     Value of z is : 3.141593
                     Value of z is : 3.14
                     Value of z is :  3.14
                     Value of z is : 03.14
                     */
                }
            }
        ```
#### Command Line Argument
- If you want to have the utility calculator, where you are taking the input from the command line itself.
    ```java
        package CIP;
        public class Test {
            public static void main(String[] args) {
            
                for (int i = 0; i < args.length; i++) {
                    System.out.print(args[i] + " ");
                }
                System.out.println();
                /*
                 * Input ->
                 * For compilation
                 * $ javac Test.java
                 * Now the Test.class file is generated which contains the bytecode
                 * $ java Test 10 20 30 40 50
                 * 
                 * Output ->
                 * 10 20 30 40 50
                 */
            }
        }
    ```
    - It is also useful when you want to take the csv file, comma separated value and read from it using the command line utility.
    ```java
        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;

        public class CsvReaderUtility {
        
            public static void main(String[] args) {
                if (args.length < 1) {
                    System.out.println("Usage: java CsvReaderUtility <csv-file-path>");
                    return;
                }

                String csvFile = args[0];
                String line;
                String csvDelimiter = ",";

                try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                    while ((line = br.readLine()) != null) {
                        String[] data = line.split(csvDelimiter);

                        // Assuming CSV has columns: ID, Name, Age
                        if (data.length == 3) {
                            System.out.println("ID: " + data[0] + ", Name: " + data[1] + ", Age: " + data[2]);
                        } else {
                            System.out.println("Invalid line: " + line);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }
            }
        }
    ```
    - It can also take the database name, table name, db url etc to make the database connection and also take the csv file as input and enter the entries from the that csv file into the database.
    ```java
        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.SQLException;

        public class CsvToDatabaseUtility {
        
            public static void main(String[] args) {
                if (args.length < 4) {
                    System.out.println("Usage: java CsvToDatabaseUtility <db-name> <table-name> <csv-file-path> <db-url>");
                    return;
                }

                String dbName = args[0];
                String tableName = args[1];
                String csvFile = args[2];
                String dbUrl = args[3]; // Example: jdbc:mysql://localhost:3306/
                String username = "root"; // Change as per your DB credentials
                String password = "password";

                String line;
                String csvDelimiter = ",";

                try (Connection connection = DriverManager.getConnection(dbUrl + dbName, username, password);
                     BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                    
                    // Assuming the CSV columns match table columns: id, name, age
                    String insertQuery = "INSERT INTO " + tableName + " (id, name, age) VALUES (?, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

                    while ((line = br.readLine()) != null) {
                        String[] data = line.split(csvDelimiter);

                        if (data.length == 3) {
                            preparedStatement.setInt(1, Integer.parseInt(data[0])); // ID
                            preparedStatement.setString(2, data[1]); // Name
                            preparedStatement.setInt(3, Integer.parseInt(data[2])); // Age
                            preparedStatement.executeUpdate();
                        } else {
                            System.out.println("Invalid line skipped: " + line);
                        }
                    }

                    System.out.println("Data inserted successfully into table: " + tableName);

                } catch (IOException | SQLException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

    ```
    - Whatever you provide in the command line it is considered as a string.
#### Escape Sequence in Java
```java
    package CIP;

    public class Test {
        public static void main(String[] args) {

            // How to print the below string
            // Welcome to the "Mayank's Club"
            // The below statement will cause the error.
            // System.out.println("Welcome to the "Mayank's Club"");
            // To solve this problem we have excape sequences
            String str = "Welcome to the \"Mayank's Club\"";
            System.out.println(str);

            // The below statement will throw error
            // System.out.println("Using the backslash without \ and character after it.");
            // Error : Illegal escape Character
            // The Valid escape sequences are 
            // \t, \b, \n, \r, \f, \', \", \\
            // The below statement will work
            System.out.println("Escape \\");
        }
    }

```
    - '\' Escape Sequence will escape the character after it.
    - '\n' Escape sequence is used for inserting the new line.
    - backslash '\' and any character after this together form a escape sequence.
    - There are only certain limited number of characters allowed after backslash.
    - \t is used for printing the tab and tab usually means 4 spaces.
    - Assignment -> Print path : C:\xyz\abc.txt
```java
    package CIP;
    public class Test {
        public static void main(String[] args) {
        
            // Printing the path -> C:\xyz\abc.txt
            System.out.println("C:\\xyz\\abc.txt");
        }
    }
```
#### Operators in Java
1. Arithmetic Operators
 ```java
        class Test{
            public static void main(String[] args)
            {
                int x=10, y=20;
                System.out.println(x+y);
                System.out.println(x*y);
                System.out.println(x/y);
                int z= x+y*10;
                System.out.println(z);
                z=x++;
                System.out.println(z+" "+x);
                z=++x;
                System.out.println(z+" "+x);
            }
        }
 ```
2. Assignment Operators 
- (= (Simple Assignment), (+=, -=, *=, %=) Compound assignment operators in Java )
 ```java
    package CIP;
    public class Test {
        public static void main(String[] args) {
            int x = 10, y = 5, z;
            x += y;
            System.out.println(x);
            x %= y;
            System.out.println(x);
            z = x = y; // Here, x = y will happen first and then later it will assign to the z.
            System.out.println(z);
        }
    }
 ```
- It is very difficult to remember the associativity so always prefer brackets.
3. Logical Operators
- (&&, ||, !)
```java
    package CIP;
    import java.util.Scanner;
    public class Test {
        public static void main(String[] args) {
            String user = "root", password = "manager";
            Scanner sc = new Scanner(System.in);
            String inputUser = sc.next();
            String inputPassword = sc.next();
            if (user.equals(inputUser) && password.equals(inputPassword)) {
                System.out.println("Welcomes");
            } else {
                System.out.println("Try again !!");
            }
            boolean x=true,=false;
            System.out.println(x&&y);
            System.out.println(x||y);
            System.out.println(!x);
        }
    }
```
- Short Circuiting means that let say x && y, if x is false then it will not check for y.
- And if x || y, here x is true then it will not check for the y.
    ```java
        // Checking the s string first to avoid Null Pointer Exception
        // using the && operaors.
        if(s!=null && s.length()>5)
        {
            System.out.println("s string length() is greater than 5");
        }
    ```
4. Relational Operators or Comparision Operators
 ```java
        package CIP;
        public class Test {
            public static void main(String[] args) {
                int x = 10, y = 20;
                System.out.println(x == y);
                System.out.println(x != y);
                System.out.println(x < y);
                System.out.println(x > y);
                System.out.println(x >= y);
                System.out.println(x <= y);
            }
        }
 ```
 5. Bitwise Operator in Java
 ```java
    package CIP;
    public class Test {
        public static void main(String[] args) {
            int x = 3, y = 6;
            // Bitiwse And operator
            System.out.println(x & y);
            // Bitiwse OR Operator
            System.out.println(x|y);
            // Bitwise XOR operator
            // Outputs 1 when two bits are different
            // Outputs 0 when two bits are same
            System.out.println(x^y);
            // Bitiwse NOT or 1's compliment
            // It converts the decimal number into the binary 
            // and inverts all the binary number 0 to 1 and 1 to 0
            System.out.println(~x);

        }
    }
    
 ```
 - In Java, positive numbers are stored in the simple binary form i.e. decimal to binary conversion.
 - In Java, negative numbers are stored in 2's compliment form.
 - Range of int : -2<sup>31</sup> to 2<sup>31</sup>-1
 - Representation of -x = 2<sup>32</sup>-x 
