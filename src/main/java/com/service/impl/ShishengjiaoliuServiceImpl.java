package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShishengjiaoliuDao;
import com.entity.ShishengjiaoliuEntity;
import com.service.ShishengjiaoliuService;
import com.entity.vo.ShishengjiaoliuVO;
import com.entity.view.ShishengjiaoliuView;

@Service("shishengjiaoliuService")
public class ShishengjiaoliuServiceImpl extends ServiceImpl<ShishengjiaoliuDao, ShishengjiaoliuEntity> implements ShishengjiaoliuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShishengjiaoliuEntity> page = this.selectPage(
                new Query<ShishengjiaoliuEntity>(params).getPage(),
                new EntityWrapper<ShishengjiaoliuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShishengjiaoliuEntity> wrapper) {
		  Page<ShishengjiaoliuView> page =new Query<ShishengjiaoliuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShishengjiaoliuVO> selectListVO(Wrapper<ShishengjiaoliuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShishengjiaoliuVO selectVO(Wrapper<ShishengjiaoliuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShishengjiaoliuView> selectListView(Wrapper<ShishengjiaoliuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShishengjiaoliuView selectView(Wrapper<ShishengjiaoliuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
