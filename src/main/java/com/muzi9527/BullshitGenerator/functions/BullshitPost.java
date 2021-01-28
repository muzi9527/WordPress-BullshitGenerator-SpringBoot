package com.muzi9527.BullshitGenerator.functions;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@ResponseBody
@RestController
public class BullshitPost {
    @GetMapping("/bullshit")
    public String main(String title, @RequestParam(required = false) Integer circulate) throws IOException {
        if (circulate == null) {
            circulate = 1;
        }
        if (circulate > 10) {
            return "哥，一次性塞不下那么多了。";
        } else
            for (int i = 0; i < circulate; i++) {
                String url1 = "http://localhost:9527/insert";
                Connection con1 = Jsoup.connect(url1);
                try {
                    con1.data("postContent", BullshitGenerator.random(title));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                con1.data("postTitle", title).get();
                try {
                    Thread.sleep(1000 * 1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ;
            }
        return "已完成，请自行检查是否成功";
    }

    //此http请求方式已弃用
    public void getBullShit() {
//        String title="憨批";int num;
//        //生成随机汉字
//        //String str = String.valueOf(getRandomChar(3));//生成三个字
//        String figure = String.valueOf(getRandomChar(6));//生成随机数字6个
//        System.out.println(title);
//        //设置狗屁不通网站url
//        String url1 = "https://www.xiaodigu.cn/gpwz/";
//        //获取请求连接
//        Connection con1 = Jsoup.connect(url1);
//        //请求头设设置
//        con1.header("Accept", "text/html, application/xhtml+xml, */*");
//        con1.header("Content-Type", "application/x-www-form-urlencoded");
//        con1.header("User-Agent", "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0))");
//        //设置请求参数
//        con1.data("主题", title);
//        con1.data("字数", "200");
//        con1.data("随机种子", figure);
//
//        Document doc= null;
//        try {
//            doc = con1.get();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(doc);
////        return "1";
    }

    public static String getRandomChar(int num) {
        String strnum = "";
        for (int i = 0; i < num; i++) {
            String str = String.valueOf((char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1))));
            strnum = str + strnum;
        }
        return strnum;
    }
}
