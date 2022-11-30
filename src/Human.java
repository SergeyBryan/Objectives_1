import java.sql.SQLOutput;
import java.util.Objects;

public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    public Human(String name, String town, String jobTitle, int yearOfBirth) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
        if (yearOfBirth <= 1900) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    //SETTERS & GETTERS
    public String getTown() {
        if (town != null && town.isEmpty() == false && town.isBlank() == false) {
            return town;
        } else {
            return town = "Информация не указана";
        }
    }

    public int getYearOfBirth() {
        if (yearOfBirth >= 0) {
            return yearOfBirth;
        } else {
            return yearOfBirth = 0;
        }
    }

    public String getJobTitle() {
        if (jobTitle != null && !jobTitle.isBlank() && !jobTitle.isEmpty()) {
            return jobTitle;
        } else {
            return jobTitle = "Информация не указана";
        }
    }

    public void setTown(String townName) {
        if (townName != null && townName.isEmpty() == false && townName.isBlank() == false) {
            town = townName;
        } else {
            town = "Информация не указана";
        }
    }

    public void setYearOfBirth(int newYear) {
        if (newYear >= 0) {
            yearOfBirth = newYear;
        } else {
            yearOfBirth = 0;
        }
    }

    //TOSTRING&OTHERS
    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + getTown() + ". Я работаю на должности " + getJobTitle() + ". Я родился в " + getYearOfBirth() + " году. Будем знакомы!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && Objects.equals(name, human.name) && Objects.equals(town, human.town) && Objects.equals(jobTitle, human.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, name, town, jobTitle);
    }
}
