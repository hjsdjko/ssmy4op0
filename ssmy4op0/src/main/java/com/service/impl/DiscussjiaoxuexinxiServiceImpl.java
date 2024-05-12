package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjiaoxuexinxiDao;
import com.entity.DiscussjiaoxuexinxiEntity;
import com.service.DiscussjiaoxuexinxiService;
import com.entity.vo.DiscussjiaoxuexinxiVO;
import com.entity.view.DiscussjiaoxuexinxiView;

@Service("discussjiaoxuexinxiService")
public class DiscussjiaoxuexinxiServiceImpl extends ServiceImpl<DiscussjiaoxuexinxiDao, DiscussjiaoxuexinxiEntity> implements DiscussjiaoxuexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiaoxuexinxiEntity> page = this.selectPage(
                new Query<DiscussjiaoxuexinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjiaoxuexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiaoxuexinxiEntity> wrapper) {
		  Page<DiscussjiaoxuexinxiView> page =new Query<DiscussjiaoxuexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiaoxuexinxiVO> selectListVO(Wrapper<DiscussjiaoxuexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiaoxuexinxiVO selectVO(Wrapper<DiscussjiaoxuexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiaoxuexinxiView> selectListView(Wrapper<DiscussjiaoxuexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiaoxuexinxiView selectView(Wrapper<DiscussjiaoxuexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
