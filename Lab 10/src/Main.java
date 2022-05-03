import config.DatabaseConfiguration;
import entity.Person;
import repository.PersonRepositoryUsingPreparedStatements;
import repository.PersonRepositoryUsingStatements;


public class Main {
    public static void main(String[] args) {
        PersonRepositoryUsingStatements personRepositoryUsingStatements = new PersonRepositoryUsingStatements();
        personRepositoryUsingStatements.createTable();
        personRepositoryUsingStatements.addPerson();
        personRepositoryUsingStatements.displayPerson();

        PersonRepositoryUsingPreparedStatements personRepositoryUsingPreparedStatements = new PersonRepositoryUsingPreparedStatements();
        Person person = personRepositoryUsingPreparedStatements.getPersonById(6);
        System.out.println("Name = " + person.getName());

        personRepositoryUsingPreparedStatements.updatePersonName("Silvia", 1);
        Person updatedPerson = personRepositoryUsingPreparedStatements.getPersonById(1);
        System.out.println("Name = " + updatedPerson.getName());

        DatabaseConfiguration.closeDatabaseConfiguration();
    }
}
