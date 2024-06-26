package com.entity.view;

import com.entity.MenzhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 门诊信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
@TableName("menzhenxinxi")
public class MenzhenxinxiView  extends MenzhenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MenzhenxinxiView(){
	}
 
 	public MenzhenxinxiView(MenzhenxinxiEntity menzhenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, menzhenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
