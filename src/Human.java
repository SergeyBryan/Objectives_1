import java.sql.SQLOutput;
import java.util.Objects;

public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;
    public Human(String name, String town,String jobTitle, int yearOfBirth) {
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

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town +". Я работаю на должности "+ jobTitle+". Я родился в " + yearOfBirth + " году. Будем знакомы!";
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
