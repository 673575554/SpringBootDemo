package com.demo.service;

import com.demo.bean.City;
import com.demo.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    CityMapper cityMapper;

    public City getCityById(Long id){
        return cityMapper.getByID(id);
    };

    public void saveCity(City city){
        cityMapper.insert(city);
    }
}
