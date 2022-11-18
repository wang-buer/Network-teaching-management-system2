package com.dao;

import com.entity.ShishengjiaoliuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShishengjiaoliuVO;
import com.entity.view.ShishengjiaoliuView;


/**
 * 师生交流
 * 
 * @author 
 * @email 
 * @date 2021-02-19 21:43:50
 */
public interface ShishengjiaoliuDao extends BaseMapper<ShishengjiaoliuEntity> {
	
	List<ShishengjiaoliuVO> selectListVO(@Param("ew") Wrapper<ShishengjiaoliuEntity> wrapper);
	
	ShishengjiaoliuVO selectVO(@Param("ew") Wrapper<ShishengjiaoliuEntity> wrapper);
	
	List<ShishengjiaoliuView> selectListView(@Param("ew") Wrapper<ShishengjiaoliuEntity> wrapper);

	List<ShishengjiaoliuView> selectListView(Pagination page,@Param("ew") Wrapper<ShishengjiaoliuEntity> wrapper);
	
	ShishengjiaoliuView selectView(@Param("ew") Wrapper<ShishengjiaoliuEntity> wrapper);
	
}
