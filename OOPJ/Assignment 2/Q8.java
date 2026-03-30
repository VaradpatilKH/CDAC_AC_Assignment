class Patient {
    int patientId;
    String patientName;
    int age;
    String disease;

    Patient(int patientId, String patientName, int age, String disease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
    }

    void display() {

        System.out.println("Patient ID : " + patientId);
        System.out.println("Name : " + patientName);
        System.out.println("Age : " + age);
        System.out.println("Disease : " + disease);
        System.out.println("Senior Citizen : " + (isseniorcitizen() ? "Yes" : "No"));
    }

    boolean isseniorcitizen() {
        return age >= 60;
    }
}

public class Q8 {
    public static void main(String[] args) {

        Patient p1 = new Patient(101, "Suraj Patil",  65, "Diabetes");
        Patient p2 = new Patient(102, "Aman Jha",  23, "Fever");
        Patient p3 = new Patient(103, "Kunal Patil",   23, "Hypertension");


        System.out.println(" HOSPITAL PATIENT RECORDS ");


        p1.display();
        p2.display();
        p3.display();

    }
}
