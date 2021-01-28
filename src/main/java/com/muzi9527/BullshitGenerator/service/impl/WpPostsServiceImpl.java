package com.muzi9527.BullshitGenerator.service.impl;

import com.muzi9527.BullshitGenerator.entity.WpPosts;
import com.muzi9527.BullshitGenerator.mapper.WpPostsMapper;
import com.muzi9527.BullshitGenerator.service.IWpPostsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author muzi9527
 * @since 2021-01-27
 */
@Service
public class WpPostsServiceImpl extends ServiceImpl<WpPostsMapper, WpPosts> implements IWpPostsService {

}
