package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxuexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoxuexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxuexinxiView;


/**
 * 教学信息
 *
 * @author 
 * @email 
 * @date 2021-02-19 21:43:49
 */
public interface JiaoxuexinxiService extends IService<JiaoxuexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoxuexinxiVO> selectListVO(Wrapper<JiaoxuexinxiEntity> wrapper);
   	
   	JiaoxuexinxiVO selectVO(@Param("ew") Wrapper<JiaoxuexinxiEntity> wrapper);
   	
   	List<JiaoxuexinxiView> selectListView(Wrapper<JiaoxuexinxiEntity> wrapper);
   	
   	JiaoxuexinxiView selectView(@Param("ew") Wrapper<JiaoxuexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoxuexinxiEntity> wrapper);
   	
}

