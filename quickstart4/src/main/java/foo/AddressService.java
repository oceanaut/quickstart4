package foo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Component
@Service
public class AddressService implements IAddressService {
	
    @Autowired
	//@Autowired(required=true)
	private AddressDAO addressDao;
	
	

	@Override
	@Transactional
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		addressDao.save(student);
		
	}

	@Override
	@Transactional
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		addressDao.findAll();
		return null;
	}

	
	
	/*
	public AddressDAO getAddressDao() {
		return addressDao;
	}

	public void setAddressDao(AddressDAO addressDao) {
		this.addressDao = addressDao;
	}

	*/
	
	
	
}
