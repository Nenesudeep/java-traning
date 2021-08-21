class Faculty{
//METHOD OVERLOADING EXCERCISE WITH INHERITANCE..
    private String name;
    private float basicSalary;
    private float bonusPercentage;
    private float carAllowancePercentage;

    public Faculty(String name, float basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;

        this.bonusPercentage=4f;
        this.carAllowancePercentage=2.5f;
        }

    public double calculateSalary(){
        double extrapercentage;
        extrapercentage= 1+(this.bonusPercentage/100+this.carAllowancePercentage/100);
        double TotalSalary = getBasicSalary()*extrapercentage;
        return TotalSalary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public float getCarAllowancePercentage() {
        return carAllowancePercentage;
    }

    public void setCarAllowancePercentage(float carAllowancePercentage) {
        this.carAllowancePercentage = carAllowancePercentage;
    }
    //Implement your code here
}

class OfficeStaff extends Faculty{

    private String designation;

    public OfficeStaff(String name,float basicSalary, String designation){
        super(name,basicSalary);

        this.designation=designation;



    }
    @Override
   public double calculateSalary(){

        float extrapercentage;
        extrapercentage= 1+(getBonusPercentage()/100+getCarAllowancePercentage()/100);
        float extrapay = getBasicSalary()*extrapercentage;

        //##### comparing upper and lower case######
        if(this.designation.equals("Accountant")||this.designation.equals("accountant")){

            return  10000f+extrapay;

        }
        if (this.designation.equals("Clerk")){

            return  7000f+extrapay;
        }

        if (this.designation.equals("Peon")){

            return 4500f+extrapay;
        }

        else
             return 0;}




    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    //Implement your code here
}

class Teacher extends Faculty{

    private String qualification;



    public Teacher(String name, float basicSalary, String qualification){
        super(name,basicSalary);

        this.qualification=qualification;


    }

    @Override
    public double calculateSalary(){

        float extrapercentage;
        extrapercentage= 1+(getBonusPercentage()/100+getCarAllowancePercentage()/100);
        float extrapay = getBasicSalary()*extrapercentage;
         if(this.qualification.equals("Doctoral")){

             return 20000.0+extrapay;

         }
         if (this.qualification.equals("Masters")){

             return 18000.0+extrapay;
         }
         if (this.qualification.equals("Bachelors")){

             return 15500.0+extrapay;
         }
         if (this.qualification.equals("Associate")){

             return 100000.0+extrapay;
         }
         else
             return 0.0;


    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    //Implement your code here
}


class Tester {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
        OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "accountant");
        Faculty faculty = new Faculty("Henry",30500f);

        System.out.println(faculty.calculateSalary());

        System.out.println("Teacher Details\n***************");
        System.out.println("Name: "+teacher.getName());
        System.out.println("Qualification: "+teacher.getQualification());
        System.out.println("Total salary: $" + Math.round(teacher.calculateSalary()*100)/100.0);
        System.out.println();

        System.out.println("Office Staff Details\n***************");
        System.out.println("Name: "+officeStaff.getName());
        System.out.println("Designation: "+officeStaff.getDesignation());
        System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0);

        //Create more objects for testing your code

    }
}
