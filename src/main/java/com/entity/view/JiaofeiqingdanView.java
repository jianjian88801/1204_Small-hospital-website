package com.entity.view;

import com.entity.JiaofeiqingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 缴费清单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
@TableName("jiaofeiqingdan")
public class JiaofeiqingdanView  extends JiaofeiqingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaofeiqingdanView(){
	}
 
 	public JiaofeiqingdanView(JiaofeiqingdanEntity jiaofeiqingdanEntity){
 	try {
			BeanUtils.copyProperties(this, jiaofeiqingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
