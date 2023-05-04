package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.modeldetails.modelO;
import com.example.demo.model.Login;
import com.example.demo.repo.Orepo;
import com.example.demo.repository.Logrepo;


@Service
public class Logser {
	
	@Autowired
	Orepo repo;
	
	@Autowired
	Logrepo repositoryL;
	
	public String addCustomer(modelO customer)
	{
		repo.save(customer);
		return "Added successfully";
	}
	public List<modelO> getCustomer()
	{
		return repo.findAll();
		
	}
	public Optional<modelO> getCustomerById(int id)
	{
		return repo.findById(id);
	}
	public String updateCustomer(modelO customer)
	{
		repo.save(customer);
		return "Updated successfully";
	}
	public String deleteById(int id)
	{
		repo.deleteById(id);
		return "Deleted successfully";
	}
	
	public List<modelO> getProDetails(@RequestParam String field)
	{
		return repo.findAll(Sort.by(Direction.ASC,field));
	}

	public List<modelO> getProwithPag(int offset, int pagesize)
	{
		Page<modelO> page=repo.findAll(PageRequest.of(offset, pagesize));
		return page.getContent();
	}
	
	public String checkLogin(String uname,String pwd)
	{
		Login user=repositoryL.findByuname(uname);
		if(user==null)
		{
			return "Invalid Details";
		}
		else
		{
			if(user.getPwd().equals(pwd))
			{
				return "Login successful";
			}
			else
			{
				return "Login failed";
			}
		}
	}
	
	public Login addUser(Login mod)
	{
		return repositoryL.save(mod);
	}
	
	
	public List<Login> getUser()
	{
		return repositoryL.findAll();
	}

}