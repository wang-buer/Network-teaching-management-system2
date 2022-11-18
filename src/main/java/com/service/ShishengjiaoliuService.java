package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShishengjiaoliuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShishengjiaoliuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShishengjiaoliuView;


/**
 * 师生交流
 *
 * @author 
 * @email 
 * @date 2021-02-19 21:43:50
 */
public interface ShishengjiaoliuService extends IService<ShishengjiaoliuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShishengjiaoliuVO> selectListVO(Wrapper<ShishengjiaoliuEntity> wrapper);
   	
   	ShishengjiaoliuVO selectVO(@Param("ew") Wrapper<ShishengjiaoliuEntity> wrapper);
   	
   	List<ShishengjiaoliuView> selectListView(Wrapper<ShishengjiaoliuEntity> wrapper);
   	
   	ShishengjiaoliuView selectView(@Param("ew") Wrapper<ShishengjiaoliuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShishengjiaoliuEntity> wrapper);
   	
}

