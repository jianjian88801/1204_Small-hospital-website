package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 医师开药
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
@TableName("yishikaiyao")
public class YishikaiyaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YishikaiyaoEntity() {
		
	}
	
	public YishikaiyaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
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
	 * 药品名称
	 */
					
	private String yaopinmingcheng;
	
	/**
	 * 药品类型
	 */
					
	private String yaopinleixing;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 服用剂量
	 */
					
	private String fuyongjiliang;
	
	/**
	 * 服用周期
	 */
					
	private String fuyongzhouqi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 医师工号
	 */
					
	private String yishigonghao;
	
	/**
	 * 医师姓名
	 */
					
	private String yishixingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	 * 设置：药品名称
	 */
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
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
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：服用剂量
	 */
	public void setFuyongjiliang(String fuyongjiliang) {
		this.fuyongjiliang = fuyongjiliang;
	}
	/**
	 * 获取：服用剂量
	 */
	public String getFuyongjiliang() {
		return fuyongjiliang;
	}
	/**
	 * 设置：服用周期
	 */
	public void setFuyongzhouqi(String fuyongzhouqi) {
		this.fuyongzhouqi = fuyongzhouqi;
	}
	/**
	 * 获取：服用周期
	 */
	public String getFuyongzhouqi() {
		return fuyongzhouqi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
