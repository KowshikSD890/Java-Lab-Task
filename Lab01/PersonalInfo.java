public class StudentInfo {
public static void main(String[] args) {
String name = "Kowshik shil";
String studentID = "E243013";
int age = 20;
String email = "kowshik@example.com";
String phone = "01910847787";
String address = "Fatikchari, Chittagong";
printStudentInfo(name, studentID, age, email, phone, address);
}
public static void printStudentInfo(String name, String studentID, int age, String email, String phone, String address) {
System.out.println("Student Information:");
System.out.println("Name: " + name);
System.out.println("Student ID: " + studentID);
System.out.println("Age: " + age);
System.out.println("Email: " + email);
System.out.println("Phone: " + phone);
System.out.println("Address: " + address);
}
}
