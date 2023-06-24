/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library_management_system;

/**
 *
 * @author user
 */
public class Library_Management_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String className = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(className);
         
            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException ex) {
            
             System.out.println("Driver failed to load successfully");
            System.out.println(ex.getMessage());
        }
    
    }
    
}
