package com.entity.view;

import com.entity.ShishengjiaoliuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 师生交流
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-19 21:43:50
 */
@TableName("shishengjiaoliu")
public class ShishengjiaoliuView  extends ShishengjiaoliuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShishengjiaoliuView(){
	}
 
 	public ShishengjiaoliuView(ShishengjiaoliuEntity shishengjiaoliuEntity){
 	try {
			BeanUtils.copyProperties(this, shishengjiaoliuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
