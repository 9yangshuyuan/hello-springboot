package com.yang.service.impl;

import com.yang.mapper.TbUserMapper;
import com.yang.service.TbUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;


@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

}
