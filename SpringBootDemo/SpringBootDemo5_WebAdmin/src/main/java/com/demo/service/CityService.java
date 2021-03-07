package com.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.bean.City;

public interface CityService{

    public City getCityById(Long id);

    public void saveCity(City city);

}
