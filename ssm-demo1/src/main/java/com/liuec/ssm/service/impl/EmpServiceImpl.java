package com.liuec.ssm.service.impl;

import com.liuec.ssm.mapper.EmpMapper;
import com.liuec.ssm.pojo.Emp;
import com.liuec.ssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    public List<Emp> getAllEmp() {
        List<Emp> allEmp = empMapper.getAllEmp();
        return allEmp;
    }
}
