package com.tns.order_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import javax.transaction.Transactional;

@Service
@Transactional


public class Order_service {
@Autowired
	
	private Order_Service_Repository repo;
	public List<Order> listAll()
	{
		return repo.findAll();
	}
    public Order get(Integer od_id)
    { 
	    return repo.findById(od_id).get();
    }
    public void delete(Integer od_id)
    {
	    repo.deleteById(od_id);
    }
    public void save(Order odr)
    { 
	   repo.save(odr);
    }	

}


