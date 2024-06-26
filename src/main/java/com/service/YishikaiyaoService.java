package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishikaiyaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishikaiyaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishikaiyaoView;


/**
 * 医师开药
 *
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public interface YishikaiyaoService extends IService<YishikaiyaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishikaiyaoVO> selectListVO(Wrapper<YishikaiyaoEntity> wrapper);
   	
   	YishikaiyaoVO selectVO(@Param("ew") Wrapper<YishikaiyaoEntity> wrapper);
   	
   	List<YishikaiyaoView> selectListView(Wrapper<YishikaiyaoEntity> wrapper);
   	
   	YishikaiyaoView selectView(@Param("ew") Wrapper<YishikaiyaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishikaiyaoEntity> wrapper);
   	
}

