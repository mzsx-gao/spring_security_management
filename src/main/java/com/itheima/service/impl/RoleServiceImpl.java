package com.itheima.service.impl;

import com.itheima.dao.RoleDao;
import com.itheima.domain.SysRole;
import com.itheima.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;
    @Override
    public void save(SysRole role) {
        roleDao.save(role);
    }

    @Override
    public List<SysRole> findAll() {
        return roleDao.findAll();
    }
}
