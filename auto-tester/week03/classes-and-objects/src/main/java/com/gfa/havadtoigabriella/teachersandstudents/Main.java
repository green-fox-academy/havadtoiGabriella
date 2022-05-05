package com.gfa.havadtoigabriella.teachersandstudents;

public class Main {
  public static void main(String[] args) {
      /*Create Student and Teacher classes
Student
learn() -> prints: the student is actually learning
question(teacher) -> calls the teacher's giveAnswer() method
Teacher
teach(student) -> calls the student's learn() method
giveAnswer() -> prints: the teacher is answering a question
Instantiate a Student and Teacher object
Call the student's question() method and the teacher's teach() method
   */
    Student pista = new Student();
    Teacher gizi = new Teacher();
    pista.question(gizi);
    gizi.teach(pista);

  }
}
