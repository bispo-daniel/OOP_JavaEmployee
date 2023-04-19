class Employee{
    private int id;
    private String name;
    private float salary;
    private String sector;
    private int joinDate_MMDDYYYY;

    //Constructor
    public Employee(int id, String name, float salary, String sector, int joinDate_MMDDYYYY){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.sector = sector;
        this.joinDate_MMDDYYYY = joinDate_MMDDYYYY;
    }

    public int getId(){
        return id;
    }
    public void setId(int idIN){
        id = idIN;
    }

    public String getName(){
        return name;
    }
    public void setName(String nameIN){
        name = nameIN;
    }

    public float getSalary(){
        return salary;
    }
    public void setSalary(float salaryIN){
        salary = salaryIN;
    }

    public String getSector(){
        return sector;
    }
    public void setSector(String sectorIN){
        sector = sectorIN;
    }

    public int getJoinDate(){
        return joinDate_MMDDYYYY;
    }
    public void setJoinDate(int date){
        joinDate_MMDDYYYY = date;
    }
}