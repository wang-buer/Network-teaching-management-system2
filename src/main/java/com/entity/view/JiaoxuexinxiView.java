package com.entity.view;

import com.entity.JiaoxuexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教学信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-19 21:43:49
 */
@TableName("jiaoxuexinxi")
public class JiaoxuexinxiView  extends JiaoxuexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoxuexinxiView(){
	}
 
 	public JiaoxuexinxiView(JiaoxuexinxiEntity jiaoxuexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoxuexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
