package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishiView;


/**
 * 医师
 *
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public interface YishiService extends IService<YishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishiVO> selectListVO(Wrapper<YishiEntity> wrapper);
   	
   	YishiVO selectVO(@Param("ew") Wrapper<YishiEntity> wrapper);
   	
   	List<YishiView> selectListView(Wrapper<YishiEntity> wrapper);
   	
   	YishiView selectView(@Param("ew") Wrapper<YishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishiEntity> wrapper);
   	
}

