package com.sampleExProject.CustomerJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sampleExProject.DAOCustomer.CustomerRepository;
import com.sampleExProject.DomainCustomerData.Customer;

@Repository
public class CustomerJdbcImpl implements CustomerRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	RowMapper<Customer> rowMapper = new RowMapper<Customer>() {

		@Override
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Customer customer = new Customer();
			customer.setAddressId(rs.getInt("address_id"));
			customer.setActive(rs.getBoolean("active"));
			customer.setCustomerID(rs.getInt("customer_id"));
			customer.setDateTime(rs.getDate("create_date"));
			customer.setEmail(rs.getString("email"));
			customer.setFirstName(rs.getString("first_name"));
			customer.setLastName(rs.getString("last_name"));
			customer.setLastUpdate(rs.getTimestamp("last_update"));
			customer.setStoreId(rs.getInt("store_id"));
			return customer;
		}
		
	};
	
	
	@Override
	public List<Customer> findByCustomer() {
		String sql ="select * from customer";
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public List<Customer> findByLastName(String lastName) {
		
		return null;
	}

	@Override
	public Customer findById(int id) {
		String sql ="select * from customer where address_id=?";
		Customer customer =DataAccessUtils.singleResult(jdbcTemplate.query(sql, rowMapper, id));
		if (customer == null) {
			System.out.println("id :"+id +"customer not found");
		}
		return customer;
	}

	@Override
	public List<Customer> findByStretId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findByStoreAndStreed(int streedId, String storeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
