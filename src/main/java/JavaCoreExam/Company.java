package JavaCoreExam;

public class Company {

   private static int totalEmployes = 0;

    private String departmentName;

   public Company(String departmentName){
       this.departmentName = departmentName;
   }

   public void hireEmployee(){
       totalEmployes++;
       System.out.println("Сотрудник нанят в отдел: " + departmentName);
   }

   public static int getTotalEmployees(){
       return totalEmployes;
   }
    public String getDepartmentName() {
        return departmentName;
    }
}
