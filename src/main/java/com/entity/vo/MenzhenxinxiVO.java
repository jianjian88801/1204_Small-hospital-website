package com.entity.vo;

import com.entity.MenzhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 门诊信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public class MenzhenxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科室类型
	 */
	
	private String keshileixing;
		
	/**
	 * 医师姓名
	 */
	
	private String yishixingming;
		
	/**
	 * 职称
	 */
	
	private String zhicheng;
		
	/**
	 * 专业特长
	 */
	
	private String zhuanyetezhang;
		
	/**
	 * 挂号费
	 */
	
	private Integer guahaofei;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 值班表
	 */
	
	private String zhibanbiao;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：科室类型
	 */
	 
	public void setKeshileixing(String keshileixing) {
		this.keshileixing = keshileixing;
	}
	
	/**
	 * 获取：科室类型
	 */
	public String getKeshileixing() {
		return keshileixing;
	}
				
	
	/**
	 * 设置：医师姓名
	 */
	 
	public void setYishixingming(String yishixingming) {
		this.yishixingming = yishixingming;
	}
	
	/**
	 * 获取：医师姓名
	 */
	public String getYishixingming() {
		return yishixingming;
	}
				
	
	/**
	 * 设置：职称
	 */
	 
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	
	/**
	 * 获取：职称
	 */
	public String getZhicheng() {
		return zhicheng;
	}
				
	
	/**
	 * 设置：专业特长
	 */
	 
	public void setZhuanyetezhang(String zhuanyetezhang) {
		this.zhuanyetezhang = zhuanyetezhang;
	}
	
	/**
	 * 获取：专业特长
	 */
	public String getZhuanyetezhang() {
		return zhuanyetezhang;
	}
				
	
	/**
	 * 设置：挂号费
	 */
	 
	public void setGuahaofei(Integer guahaofei) {
		this.guahaofei = guahaofei;
	}
	
	/**
	 * 获取：挂号费
	 */
	public Integer getGuahaofei() {
		return guahaofei;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：值班表
	 */
	 
	public void setZhibanbiao(String zhibanbiao) {
		this.zhibanbiao = zhibanbiao;
	}
	
	/**
	 * 获取：值班表
	 */
	public String getZhibanbiao() {
		return zhibanbiao;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
