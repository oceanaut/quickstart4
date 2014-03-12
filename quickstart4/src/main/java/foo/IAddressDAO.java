package foo;

import java.util.List;



public interface IAddressDAO {

	//public void addStock(Stock stock,StockDailyRecord stockDailyRecords);  
	 //public void save(Address address);
	 public List<Student> findAll();
	 public void save(Student student);
}
