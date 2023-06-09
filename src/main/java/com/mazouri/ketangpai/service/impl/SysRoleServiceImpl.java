package com.mazouri.ketangpai.service.impl;

import com.mazouri.ketangpai.entity.SysRole;
import com.mazouri.ketangpai.mapper.SysRoleMapper;
import com.mazouri.ketangpai.service.SysRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mazouri
 * @since 2021-06-13
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Override
    public List<String> selectRoleByEmail(String email) {
        return baseMapper.selectRoleByEmail(email);
    }
}
