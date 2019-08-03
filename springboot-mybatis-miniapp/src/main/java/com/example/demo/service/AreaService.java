package com.example.demo.service;

import com.example.demo.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> queryArea();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    int updateArea(Area area);

    int deleteAreaById(int areaId);
}
