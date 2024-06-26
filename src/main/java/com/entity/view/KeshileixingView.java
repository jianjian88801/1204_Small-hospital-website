package com.entity.view;

import com.entity.KeshileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科室类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
@TableName("keshileixing")
public class KeshileixingView  extends KeshileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KeshileixingView(){
	}
 
 	public KeshileixingView(KeshileixingEntity keshileixingEntity){
 	try {
			BeanUtils.copyProperties(this, keshileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
