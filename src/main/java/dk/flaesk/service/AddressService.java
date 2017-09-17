package dk.flaesk.service;

import dk.flaesk.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {
    List<Address> addressList();

    Address findOne(Long id);
    Address addAddress(Address address);
    String deleteAddress(Long id);
}
