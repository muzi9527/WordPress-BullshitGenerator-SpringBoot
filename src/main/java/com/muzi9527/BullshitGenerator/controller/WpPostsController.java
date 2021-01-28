package com.muzi9527.BullshitGenerator.controller;


import com.muzi9527.BullshitGenerator.entity.WpPosts;
import com.muzi9527.BullshitGenerator.mapper.WpPostsMapper;
import com.muzi9527.BullshitGenerator.service.IWpPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author muzi9527
 * @since 2021-01-27
 */
@ResponseBody
@RestController
@RequestMapping("/")
public class WpPostsController {
    @Autowired
    private IWpPostsService iWpPostsService;

    @GetMapping("insert")
    public String inserBullShit(String postContent, String postTitle) {
        WpPosts wpPosts = new WpPosts();

        SimpleDateFormat time = new SimpleDateFormat();// 格式化时间
        time.applyPattern("yyyy-MM-dd HH:mm:ss");// a为am/pm的标记
        Date date = new Date();// 获取当前时间

        System.out.println("文章插入时间:" + date);
        System.out.println("文章内容:" + postContent);
        System.out.println("文章标题:" + postTitle);

        wpPosts.setPostAuthor(1L);
        wpPosts.setPostDate(date);
        wpPosts.setPostContent(postContent);
        wpPosts.setPostTitle(postTitle);
        wpPosts.setPostStatus("publish");


        wpPosts.setPostName(getRandomNickname(6));//自动生成六位数PostName

        wpPosts.setPostExcerpt("");
        wpPosts.setToPing("");
        wpPosts.setPinged("");
        wpPosts.setPostContentFiltered("");

        iWpPostsService.save(wpPosts);
        return "1";
    }

    /**
     * java生成随机字母6位数
     * @param
     * @return
     */
    public static String getRandomNickname(int length) {
        String postName = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            // 字符串
            // 取得大写字母还是小写字母
            int choice = random.nextInt(2) % 2 == 0 ? 65 : 97;
            postName += (char) (choice + random.nextInt(26));
        }
        return postName;
    }
}
