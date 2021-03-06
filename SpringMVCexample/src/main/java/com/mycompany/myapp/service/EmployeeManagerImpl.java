package com.mycompany.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.dao.EmployeeDAO;
import com.mycompany.myapp.model.EmployeeVO;

@Service
public class EmployeeManagerImpl implements EmployeeManager{
	@Autowired
    EmployeeDAO dao;
     
    public List<EmployeeVO> getAllEmployees() 
    {
        return dao.getAllEmployees();
    }
}
