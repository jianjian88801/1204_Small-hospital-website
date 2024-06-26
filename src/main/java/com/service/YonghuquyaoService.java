package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuquyaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuquyaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuquyaoView;


/**
 * 用户取药
 *
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public interface YonghuquyaoService extends IService<YonghuquyaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuquyaoVO> selectListVO(Wrapper<YonghuquyaoEntity> wrapper);
   	
   	YonghuquyaoVO selectVO(@Param("ew") Wrapper<YonghuquyaoEntity> wrapper);
   	
   	List<YonghuquyaoView> selectListView(Wrapper<YonghuquyaoEntity> wrapper);
   	
   	YonghuquyaoView selectView(@Param("ew") Wrapper<YonghuquyaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuquyaoEntity> wrapper);
   	
}

