package com.example.demo.services;



import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.NTDateTimeRoleVO;





@Repository
public interface INTDateTimeService extends MongoRepository<NTDateTimeRoleVO , String > {
	
	public List<NTDateTimeRoleVO> findByFirstName(String firstName);
	public List<NTDateTimeRoleVO> findByLastName(String lastName);
	public List<NTDateTimeRoleVO> findByRole(String role);
	public List<NTDateTimeRoleVO> findByTime(Date time);
	public List<NTDateTimeRoleVO> findByFirstNameAndLastName(String firstName, String lastName);
	public NTDateTimeRoleVO findByFirstNameAndLastNameAndRoleAndTime(String firstName, String lastName, String role, Date time);
	
}
