package interfete.marker;

public class EntityDao {

    public boolean delete(Object object) {
        if(!(object instanceof Deletable)) {
            return false;
        }

        // implementation for deleting the object

        return true;
    }
}
