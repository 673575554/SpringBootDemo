package com.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.bean.City;
import com.demo.mapper.CityMapper;
import com.demo.service.CityService;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityService cityService;

    @Override
    public City getCityById(Long id){
        return cityService.getCityById(id);
    };

    @Override
    public void saveCity(City city){
        cityService.saveCity(city);
    };


}
