/**
 * @作者 勉成翌
 * @签名 太极生两仪，两仪生四象，四象生八卦，八卦定吉凶，吉凶生大业！
 * @Email 1991993249@qq.com
 * @创建时间 2021/4/22 3:12 下午
 */
package com.mcy.mcymissyou.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/banner")
public class BannerController {
    @GetMapping("/get")
    public String getBanner() throws Exception {
        throw new Exception("呀呀呀");
//        return "Hello,机坪有风";
    }
}
