package com.liuec.ssm.mapper;

import com.liuec.ssm.pojo.Emp;

import java.util.List;

public interface EmpMapper {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Emp> getAllEmp();
}
