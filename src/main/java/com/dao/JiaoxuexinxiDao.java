package com.dao;

import com.entity.JiaoxuexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoxuexinxiVO;
import com.entity.view.JiaoxuexinxiView;


/**
 * 教学信息
 * 
 * @author 
 * @email 
 * @date 2021-02-19 21:43:49
 */
public interface JiaoxuexinxiDao extends BaseMapper<JiaoxuexinxiEntity> {
	
	List<JiaoxuexinxiVO> selectListVO(@Param("ew") Wrapper<JiaoxuexinxiEntity> wrapper);
	
	JiaoxuexinxiVO selectVO(@Param("ew") Wrapper<JiaoxuexinxiEntity> wrapper);
	
	List<JiaoxuexinxiView> selectListView(@Param("ew") Wrapper<JiaoxuexinxiEntity> wrapper);

	List<JiaoxuexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoxuexinxiEntity> wrapper);
	
	JiaoxuexinxiView selectView(@Param("ew") Wrapper<JiaoxuexinxiEntity> wrapper);
	
}
