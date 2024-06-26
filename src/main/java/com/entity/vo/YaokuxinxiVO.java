package com.entity.vo;

import com.entity.YaokuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 药库信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public class YaokuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品类型
	 */
	
	private String yaopinleixing;
		
	/**
	 * 药品介绍
	 */
	
	private String yaopinjieshao;
		
	/**
	 * 主治功能
	 */
	
	private String zhuzhigongneng;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 供应厂家
	 */
	
	private String gongyingchangjia;
		
	/**
	 * 生产日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shengchanriqi;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：药品类型
	 */
	 
	public void setYaopinleixing(String yaopinleixing) {
		this.yaopinleixing = yaopinleixing;
	}
	
	/**
	 * 获取：药品类型
	 */
	public String getYaopinleixing() {
		return yaopinleixing;
	}
				
	
	/**
	 * 设置：药品介绍
	 */
	 
	public void setYaopinjieshao(String yaopinjieshao) {
		this.yaopinjieshao = yaopinjieshao;
	}
	
	/**
	 * 获取：药品介绍
	 */
	public String getYaopinjieshao() {
		return yaopinjieshao;
	}
				
	
	/**
	 * 设置：主治功能
	 */
	 
	public void setZhuzhigongneng(String zhuzhigongneng) {
		this.zhuzhigongneng = zhuzhigongneng;
	}
	
	/**
	 * 获取：主治功能
	 */
	public String getZhuzhigongneng() {
		return zhuzhigongneng;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：供应厂家
	 */
	 
	public void setGongyingchangjia(String gongyingchangjia) {
		this.gongyingchangjia = gongyingchangjia;
	}
	
	/**
	 * 获取：供应厂家
	 */
	public String getGongyingchangjia() {
		return gongyingchangjia;
	}
				
	
	/**
	 * 设置：生产日期
	 */
	 
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	
	/**
	 * 获取：生产日期
	 */
	public Date getShengchanriqi() {
		return shengchanriqi;
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
