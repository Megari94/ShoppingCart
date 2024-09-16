import java.time.LocalDate;


public class Persona {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String phone;
    private int idNumber;

    public Persona(String name, String lastName, LocalDate birthDate, String phone, int idNumber){
        this.name=name;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.phone=phone;
        this.idNumber=idNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", phone='" + phone + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

}
