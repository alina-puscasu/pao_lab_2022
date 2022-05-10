import config.DatabaseConfiguration;
import entity.Person;
import repository.PersonRepositoryUsingCallableStatement;
import repository.PersonRepositoryUsingPreparedStatements;
import repository.PersonRepositoryUsingStatements;


public class Main {
    public static void main(String[] args) {
//        PersonRepositoryUsingStatements personRepositoryUsingStatements = new PersonRepositoryUsingStatements();
//        personRepositoryUsingStatements.createTable();
//        personRepositoryUsingStatements.addPerson();
//        personRepositoryUsingStatements.displayPerson();
//
//        PersonRepositoryUsingPreparedStatements personRepositoryUsingPreparedStatements = new PersonRepositoryUsingPreparedStatements();
//        Person person = personRepositoryUsingPreparedStatements.getPersonById(12);
//        System.out.println("Name = " + person.getName());
//
//        personRepositoryUsingPreparedStatements.updatePersonName("Silvia", 12);
//        Person updatedPerson = personRepositoryUsingPreparedStatements.getPersonById(12);
//        System.out.println("Name = " + updatedPerson.getName());

        PersonRepositoryUsingCallableStatement personRepositoryUsingCallableStatement = new PersonRepositoryUsingCallableStatement();
        personRepositoryUsingCallableStatement.insertPerson(new Person("Maria", 25.0));

        DatabaseConfiguration.closeDatabaseConfiguration();
    }
}
