package com.entity.model;

import com.entity.ZuoyepingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 作业评分
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-19 21:43:50
 */
public class ZuoyepingfenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 院系
	 */
	
	private String yuanxi;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 作业成绩
	 */
	
	private Integer zuoyechengji;
		
	/**
	 * 作业状态
	 */
	
	private String zuoyezhuangtai;
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：院系
	 */
	 
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	
	/**
	 * 获取：院系
	 */
	public String getYuanxi() {
		return yuanxi;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：作业成绩
	 */
	 
	public void setZuoyechengji(Integer zuoyechengji) {
		this.zuoyechengji = zuoyechengji;
	}
	
	/**
	 * 获取：作业成绩
	 */
	public Integer getZuoyechengji() {
		return zuoyechengji;
	}
				
	
	/**
	 * 设置：作业状态
	 */
	 
	public void setZuoyezhuangtai(String zuoyezhuangtai) {
		this.zuoyezhuangtai = zuoyezhuangtai;
	}
	
	/**
	 * 获取：作业状态
	 */
	public String getZuoyezhuangtai() {
		return zuoyezhuangtai;
	}
			
}
