package dk.flaesk.service.impl;

import dk.flaesk.model.Address;
import dk.flaesk.model.User;
import dk.flaesk.repository.AddressRepository;
import dk.flaesk.repository.UserRepository;
import dk.flaesk.service.AddressService;
import dk.flaesk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;
    private UserRepository userRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, UserRepository userRepository) {
        this.addressRepository = addressRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Address> addressList() {
        return addressRepository.findAll();
    }

    @Override
    public Address findOne(Long id) {
        return addressRepository.findOne(id);
    }

    @Override
    public Address addAddress(Address address) {
        address.setUser(userRepository.findOne(address.getUserId()));
        return addressRepository.save(address);
    }

    @Override
    public String deleteAddress(Long id) {
        addressRepository.delete(id);
        return "{'message':'Address deleted successfully.'}";
    }
}
