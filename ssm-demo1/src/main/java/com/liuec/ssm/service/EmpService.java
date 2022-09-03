package com.liuec.ssm.service;

import com.liuec.ssm.pojo.Emp;

import java.util.List;

public interface EmpService {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Emp> getAllEmp();
}
