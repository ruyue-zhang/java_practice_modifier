public class Application {
  /**
   * 需求描述
   *
   * 有Teacher和Student两个类。Student有姓名和成绩两个属性，姓名属性不能更改，Teacher有姓名和学生两个属性，姓名属性不能更改。
   * Application类中，有两个学生（Cindy，80），（Mary，95），两个老师（Solider，名下有Mary），（Bob，名下有Cindy）。
   * 要求每位老师给每一个学生的成绩加五分，打印出老师和其名下学生的信息。
   * @param args
   */
  public static void main(String[] args) {
    Student Cindy = new Student("Cindy", 80);
    Student Mary = new Student("Mary", 95);

    Student[] soliderStudent = { Cindy };
    Student[] BobStudent = { Mary };

    Teacher Solider = new Teacher("Solider", soliderStudent);
    Teacher Bob = new Teacher("Bob", BobStudent);

    for (int i = 0; i < Solider.getStudent().length; i++) {
      Solider.getStudent()[i].setScore(Solider.getStudent()[i].getScore() + 5);
    }

    for (int i = 0; i < Bob.getStudent().length; i++) {
      Bob.getStudent()[i].setScore(Bob.getStudent()[i].getScore() + 5);
    }

    System.out.println(Solider.getName());
    Solider.printStudent();

    System.out.println(Bob.getName());
    Bob.printStudent();


  }
}
