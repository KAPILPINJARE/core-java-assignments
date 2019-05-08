package com.capgemini.spring.mvc.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.mvc.model.entity.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
	
	/* (non-Javadoc)
	 * @see com.capgemini.spring.mvc.model.dao.PersonDao#addNew(com.capgemini.spring.mvc.model.entity.Person)
	 */
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public void addNew(Person person) {
		template.update("INSERT INTO PERSON VALUES(?,?)", new Object[] {person.getPersonId(), person.getPersonName()});
		
	}

	/* (non-Javadoc)
	 * @see com.capgemini.spring.mvc.model.dao.PersonDao#getAll()
	 */
	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.capgemini.spring.mvc.model.dao.PersonDao#update(com.capgemini.spring.mvc.model.entity.Person)
	 */
	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.capgemini.spring.mvc.model.dao.PersonDao#delete(int)
	 */
	@Override
	public void delete(int personId) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.capgemini.spring.mvc.model.dao.PersonDao#getPerson(int)
	 */
	@Override
	public Person getPerson(int personId) {
		// TODO Auto-generated method stub
		return null;
	}


}
