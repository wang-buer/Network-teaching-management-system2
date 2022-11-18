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


import com.dao.JiaoxuexinxiDao;
import com.entity.JiaoxuexinxiEntity;
import com.service.JiaoxuexinxiService;
import com.entity.vo.JiaoxuexinxiVO;
import com.entity.view.JiaoxuexinxiView;

@Service("jiaoxuexinxiService")
public class JiaoxuexinxiServiceImpl extends ServiceImpl<JiaoxuexinxiDao, JiaoxuexinxiEntity> implements JiaoxuexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoxuexinxiEntity> page = this.selectPage(
                new Query<JiaoxuexinxiEntity>(params).getPage(),
                new EntityWrapper<JiaoxuexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoxuexinxiEntity> wrapper) {
		  Page<JiaoxuexinxiView> page =new Query<JiaoxuexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoxuexinxiVO> selectListVO(Wrapper<JiaoxuexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoxuexinxiVO selectVO(Wrapper<JiaoxuexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoxuexinxiView> selectListView(Wrapper<JiaoxuexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoxuexinxiView selectView(Wrapper<JiaoxuexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
