package com.ra.model.service;

import com.ra.model.dao.LoandtDAO;
import com.ra.model.entity.Loandt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoandtServiceImpl implements LoandtService{
    @Autowired
    private LoandtDAO loandtDAO;
    @Override
    public List<Loandt> findAll() {
        return loandtDAO.findAll();
    }
}
