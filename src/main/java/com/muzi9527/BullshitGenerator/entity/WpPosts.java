package com.muzi9527.BullshitGenerator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author muzi9527
 * @since 2021-01-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("wp_posts")
public class WpPosts implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    //管理员：1
    private Long postAuthor;

    //上传时间
    private Date postDate;

    private Date postDateGmt;

    //文章内容
    private String postContent;

    //文章标题
    private String postTitle;

    private String postExcerpt;

    //文章状态 publish
    private String postStatus;

    private String commentStatus;

    private String pingStatus;

    private String postPassword;

    //链接组成元素
    private String postName;

    private String toPing;

    private String pinged;

    private Date postModified;

    private Date postModifiedGmt;

    private String postContentFiltered;

    private Long postParent;

    private String guid;

    private Integer menuOrder;

    private String postType;

    private String postMimeType;

    private Long commentCount;


}
