# CAT Exam Evaluation System
A mini project on "CAT Exam Evaluation System". This project encompasses the creation of an Excel dataset to capture student information and incorporates MCQ-format question and answer data to calculate percentile. Throughout the development process, valuable insights into the CAT exam structure and scoring mechanisms were acquired. This is a Java-based application for evaluating CAT (Common Admission Test) exam results. It reads student responses and answer keys from an Excel file, calculates scores, ranks, and percentiles, and displays the results.

## Table of Contents
1. [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
2. [Usage](#usage)
3. [Main Class](#main-class)
4. [Functionality](#functionality)
5. [Output](#output)
6. [Contact](#contact)

## 1. Getting Started <a name="getting-started"></a>

### Prerequisites <a name="prerequisites"></a>

- Java Development Kit (JDK)
- Apache Maven

### Installation <a name="installation"></a>

1. Clone the repository:
   ```sh
   git clone https://github.com/Sharan-m-04/CAT-Exam-Evaluation-System.git
  
2. Build project using Maven:
  ```sh
  cd CAT-Exam-Evaluation-System
  mvn clean install
  ```
3. Run the application:
   ```sh
   java -jar target/CAT-Exam-Evaluation-System-0.0.1-SNAPSHOT.jar
## 2. Usage <a name="usage"></a>
1. Place your exam data in an Excel file following the structure mentioned in the code (`data.xlsx` in the `dataset` directory).
2. Modify the code if necessary to match your Excel file's format.
## 3. Main Class <a name="main-class"></a>
- The main class for running the application is Main.java.
## 4. Functionality <a name="functionality"></a>
- `readData()`: Reads student responses from the "Students" sheet.
- `keyAnswer()`: Reads answer keys from the "Answers" sheet.
- `calcMarks()`: Calculates scores for each student.
- `getRank()`: Calculates ranks based on scores.
- `calcPercentile()`: Calculates percentiles based on ranks.
- `displayResult()`: Displays the results, including student names and percentiles.
## 5. Output <a name="output"></a>
```
-----------------------
Name       Percentile 
-----------------------
Anjali     84.0       
Thejas     56.0       
Ankit      72.0       
Rohan      84.0       
sharan     64.0       
Suhas      12.0       
Ranjith    88.0       
Sujan      84.0       
Vaibhav    72.0       
Kiran      12.0       
Vishnu     12.0       
Nitish     48.0       
Rakshitha  12.0       
Yashwanth  56.0       
Shreyas    96.0       
Vikas      32.0       
Sanjay     64.0       
Nitin      96.0       
Ajay       48.0       
Yashas     32.0       
Ricky      32.0       
James      16.000002  
Manjeeth   48.0       
Nirmala    19.999998  
Harshith   48.0       
-----------------------
```
## 6. Contact <a name="contact"></a>
For any inquiries or feedback, you can reach out to the project developers:

- **Sharan M** <br>
GitHub: [Sharan-m-04](https://github.com/Sharan-m-04)
- **Srilakshmi H M** <br>
GitHub: [Srilakshmi-07](https://github.com/Srilakshmi-07)
- **Vaibhavi M S** <br>
GitHub: [vaibhavimss](https://github.com/vaibhavimss)
