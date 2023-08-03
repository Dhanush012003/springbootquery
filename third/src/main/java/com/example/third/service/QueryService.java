package com.example.third.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.third.model.Queries;
import com.example.third.repository.QueryRepository;

public class QueryService {
    
    @Autowired
    QueryRepository queryRepository;

    public List<Queries> getTableData(){
        return queryRepository.findAllData();
    }
    public List<Queries> getDetails(String activeState,List<String>designationList){
        return queryRepository.finddata(activeState,designationList);
    }
}
