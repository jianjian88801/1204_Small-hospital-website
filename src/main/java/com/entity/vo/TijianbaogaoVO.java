package com.entity.vo;

import com.entity.TijianbaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 体检报告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public class TijianbaogaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 科室编号
	 */
	
	private String keshibianhao;
		
	/**
	 * 科室类型
	 */
	
	private String keshileixing;
		
	/**
	 * 体检项目
	 */
	
	private String tijianxiangmu;
		
	/**
	 * 检测结果
	 */
	
	private String jiancejieguo;
		
	/**
	 * 体检时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijianshijian;
		
	/**
	 * 异常项目
	 */
	
	private String yichangxiangmu;
		
	/**
	 * 报告时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baogaoshijian;
		
	/**
	 * 医师工号
	 */
	
	private String yishigonghao;
		
	/**
	 * 医师姓名
	 */
	
	private String yishixingming;
				
	
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
	 * 设置：科室编号
	 */
	 
	public void setKeshibianhao(String keshibianhao) {
		this.keshibianhao = keshibianhao;
	}
	
	/**
	 * 获取：科室编号
	 */
	public String getKeshibianhao() {
		return keshibianhao;
	}
				
	
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
	 * 设置：体检项目
	 */
	 
	public void setTijianxiangmu(String tijianxiangmu) {
		this.tijianxiangmu = tijianxiangmu;
	}
	
	/**
	 * 获取：体检项目
	 */
	public String getTijianxiangmu() {
		return tijianxiangmu;
	}
				
	
	/**
	 * 设置：检测结果
	 */
	 
	public void setJiancejieguo(String jiancejieguo) {
		this.jiancejieguo = jiancejieguo;
	}
	
	/**
	 * 获取：检测结果
	 */
	public String getJiancejieguo() {
		return jiancejieguo;
	}
				
	
	/**
	 * 设置：体检时间
	 */
	 
	public void setTijianshijian(Date tijianshijian) {
		this.tijianshijian = tijianshijian;
	}
	
	/**
	 * 获取：体检时间
	 */
	public Date getTijianshijian() {
		return tijianshijian;
	}
				
	
	/**
	 * 设置：异常项目
	 */
	 
	public void setYichangxiangmu(String yichangxiangmu) {
		this.yichangxiangmu = yichangxiangmu;
	}
	
	/**
	 * 获取：异常项目
	 */
	public String getYichangxiangmu() {
		return yichangxiangmu;
	}
				
	
	/**
	 * 设置：报告时间
	 */
	 
	public void setBaogaoshijian(Date baogaoshijian) {
		this.baogaoshijian = baogaoshijian;
	}
	
	/**
	 * 获取：报告时间
	 */
	public Date getBaogaoshijian() {
		return baogaoshijian;
	}
				
	
	/**
	 * 设置：医师工号
	 */
	 
	public void setYishigonghao(String yishigonghao) {
		this.yishigonghao = yishigonghao;
	}
	
	/**
	 * 获取：医师工号
	 */
	public String getYishigonghao() {
		return yishigonghao;
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
			
}
