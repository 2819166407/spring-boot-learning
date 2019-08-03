package com.example.demo.dao;

import com.example.demo.entity.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AreaDao {
    List<Area> queryArea();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    int updateArea(Area area);

    int deleteAreaById(int areaId);
}
