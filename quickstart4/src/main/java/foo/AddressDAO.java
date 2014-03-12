package foo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Repository
//@Service did work either.don't know why
public class AddressDAO implements IAddressDAO {
	
	@Autowired
	//@Autowired(required=true)
	private SessionFactory sessionFactory;



	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
	      Session session = sessionFactory.getCurrentSession();
	      return (List<Student>)session.createQuery("from student").list();
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.getCurrentSession();    
         session.save(student);

	}

}
