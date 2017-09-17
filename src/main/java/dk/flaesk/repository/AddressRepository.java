package dk.flaesk.repository;

import dk.flaesk.model.Address;
import dk.flaesk.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long > {
}
