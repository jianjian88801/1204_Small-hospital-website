package com.entity.vo;

import com.entity.JiaofeiqingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 缴费清单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public class JiaofeiqingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 费用项目
	 */
	
	private String feiyongxiangmu;
		
	/**
	 * 费用价格
	 */
	
	private Integer feiyongjiage;
		
	/**
	 * 费用详情
	 */
	
	private String feiyongxiangqing;
		
	/**
	 * 减免金额
	 */
	
	private Integer jianmianjine;
		
	/**
	 * 减免原因
	 */
	
	private String jianmianyuanyin;
		
	/**
	 * 实付金额
	 */
	
	private String shifujine;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：费用项目
	 */
	 
	public void setFeiyongxiangmu(String feiyongxiangmu) {
		this.feiyongxiangmu = feiyongxiangmu;
	}
	
	/**
	 * 获取：费用项目
	 */
	public String getFeiyongxiangmu() {
		return feiyongxiangmu;
	}
				
	
	/**
	 * 设置：费用价格
	 */
	 
	public void setFeiyongjiage(Integer feiyongjiage) {
		this.feiyongjiage = feiyongjiage;
	}
	
	/**
	 * 获取：费用价格
	 */
	public Integer getFeiyongjiage() {
		return feiyongjiage;
	}
				
	
	/**
	 * 设置：费用详情
	 */
	 
	public void setFeiyongxiangqing(String feiyongxiangqing) {
		this.feiyongxiangqing = feiyongxiangqing;
	}
	
	/**
	 * 获取：费用详情
	 */
	public String getFeiyongxiangqing() {
		return feiyongxiangqing;
	}
				
	
	/**
	 * 设置：减免金额
	 */
	 
	public void setJianmianjine(Integer jianmianjine) {
		this.jianmianjine = jianmianjine;
	}
	
	/**
	 * 获取：减免金额
	 */
	public Integer getJianmianjine() {
		return jianmianjine;
	}
				
	
	/**
	 * 设置：减免原因
	 */
	 
	public void setJianmianyuanyin(String jianmianyuanyin) {
		this.jianmianyuanyin = jianmianyuanyin;
	}
	
	/**
	 * 获取：减免原因
	 */
	public String getJianmianyuanyin() {
		return jianmianyuanyin;
	}
				
	
	/**
	 * 设置：实付金额
	 */
	 
	public void setShifujine(String shifujine) {
		this.shifujine = shifujine;
	}
	
	/**
	 * 获取：实付金额
	 */
	public String getShifujine() {
		return shifujine;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
