package CollectionsMap;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Objects;

public class Mechanics {

    private final String firstName; // имя механика
    private final String familyName; // фамилия механика
    private String companyWork; // компания работы
    private TransportType type;

    public Mechanics(String firstName, String familyName, String companyWork, TransportType type) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.companyWork = companyWork;
        this.type = type;
     }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getCompanyWork() {
        return companyWork;
    }

    public void setCompanyWork(String companyWork) {
        this.companyWork = companyWork;
    }

    public TransportType getType() {
        return type;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanics mechanics = (Mechanics) o;
        return Objects.equals(firstName, mechanics.firstName) && Objects.equals(familyName, mechanics.familyName) && Objects.equals(companyWork, mechanics.companyWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, familyName, companyWork);
    }


    public static void mechanicsInTheList(List<Mechanics> mechanics) {
       for (Mechanics mechanic : mechanics) {
           System.out.println("Муханик " + mechanic.firstName + " " +
                   mechanic.familyName +
                   " обслуживает тип трансопрта: " + mechanic.type);
          }
    }

    public void runTO() {
        System.out.println("Тухобслуживание транспорта");
    }

    @Override
    public String toString() {
        return "Механик " + firstName + '\'' +  familyName + '\'' + " от компании " +
                companyWork + '\'' +  " обслуживает типы машин: " + type;
    }
}

