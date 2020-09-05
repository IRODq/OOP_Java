import java.lang.*;
public class Sudents {
   private String Name;
   private int Age;
   private int Group;

   public Sudents(String n, int a, int g) {
      Name = n;
      Age = a;
      Group = g;
   }

   public void setAge(int Age) {
      this.Age = Age;
   }

   public void setGroup(int Group) {
      this.Group = Group;
   }

   public void setName(String Name) {
      this.Name = Name;
   }

   public int getAge() {
      return Age;
   }

   public int getGroup() {
      return Group;
   }

   public String getName() {
      return Name;
   }
   public void StudentInfo(){
      System.out.println("Name-"+Name+" age-"+Age+" Group-"+Group);
   }
}