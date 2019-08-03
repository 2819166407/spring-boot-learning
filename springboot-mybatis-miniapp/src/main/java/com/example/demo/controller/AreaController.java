package com.example.demo.controller;

import com.example.demo.entity.Area;
import com.example.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: xp
 * @Date: 2019/8/3 14:42
 * @Version: 1.0.0
 * @Description:
 */

@RestController
@RequestMapping("/api")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @GetMapping("/listarea")
    private Map<String, Object> listArea() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Area> list = areaService.queryArea();
        modelMap.put("areaList", list);
        return modelMap;
    }
}
