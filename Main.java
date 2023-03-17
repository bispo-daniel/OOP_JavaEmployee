import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Employee> employeeArr = new ArrayList<Employee>();
    static int iterator = 0;

    private static void menu() {
        try{
            String optionList = " 1) Create employee \n 2) List employees \n 3) Update employee \n 4) Delete employee \n 0) Exit";
            String menu = JOptionPane.showInputDialog(null, "Choose an option: \n" + optionList);
            int menuOp = Integer.parseInt(menu);

            switch(menuOp){
                case 0:
                    System.exit(0);
                case 1:
                    create();
                        break;
                case 2:
                    read();
                        break;
                case 3:
                    update();
                        break;
                case 4:
                    delete();
                        break;
                default:
                    JOptionPane.showMessageDialog(null, "Type a number from 0 to 4...");
                    menu();
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "You probably typed a chracter where a number is expected.\nTry again...");
            menu();
        }
    }

    private static void create() {
        String idHandler = JOptionPane.showInputDialog(null, "Type the employee's id: ");
        int id = Integer.parseInt(idHandler);

        String name = JOptionPane.showInputDialog(null, "Type the employee's name: ");

        String salaryHandler = JOptionPane.showInputDialog(null, "Type the employee's salary: ");
        int salary = Integer.parseInt(salaryHandler);

        String sector = JOptionPane.showInputDialog(null, "Type the employee's sector: ");

        String joinDateHandler = JOptionPane.showInputDialog(null, "Type the employee's join date: ");
        int joinDate = Integer.parseInt(joinDateHandler);

        employeeArr.add(new Employee());
        
        employeeArr.get(iterator).setId(id);
        employeeArr.get(iterator).setName(name);
        employeeArr.get(iterator).setSalary(salary);
        employeeArr.get(iterator).setSector(sector);
        employeeArr.get(iterator).setJoinDate(joinDate);

        iterator++;
        
        menu();
    }
    
    private static void read() {
        String resultString = "";
        
        for (Employee employee : employeeArr){
            resultString += "Id: " + employee.getId() + " Name: " + employee.getName() + " Salary: " + employee.getSalary() + " Sector: " + employee.getSector() + " Join date: " + employee.getJoinDate() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, resultString);
        menu();
    }

    private static void update() {
        String idHandler = JOptionPane.showInputDialog(null, "Type the employee's id to be updated:");
        int id = Integer.parseInt(idHandler);

        String fieldsToUpdate = "What do you want to update? \n 1) Id \n 2) Name \n 3) Salary \n 4) Sector \n 5) Join date";

        for(Employee employee : employeeArr){
            if(employee.getId() == id){

                String updateHandler = JOptionPane.showInputDialog(null, fieldsToUpdate);
                int update = Integer.parseInt(updateHandler);

                String newValue = JOptionPane.showInputDialog(null, "Type the new value: ");

                switch(update){
                    case 1: 
                        employee.setId(Integer.parseInt(newValue));
                        break;
                    case 2:
                        employee.setName(newValue);
                        break;
                    case 3: 
                        employee.setSalary(Integer.parseInt(newValue));
                        break;
                    case 4: 
                        employee.setSector(newValue);
                        break;
                    case 5:
                        employee.setJoinDate(Integer.parseInt(newValue));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Type a number from 1 to 5...");
                }

            }
        }

        menu();
    }

    private static void delete() {
        String idHandler = JOptionPane.showInputDialog(null, "Type the employee's id to be removed:");
        int id = Integer.parseInt(idHandler);

        for (Employee ee : employeeArr){
            if(ee.getId() == id){
                employeeArr.remove(ee);
                JOptionPane.showMessageDialog(null, "Employee successfully removed!");

                iterator--;
                break;
            }
        }

        menu();
    }


    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Welcome!");
        menu();
    }

}
