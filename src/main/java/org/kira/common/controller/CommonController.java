package org.kira.common.controller;

import org.kira.common.resp.CommonResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang chaoqing
 * Create on 2022/7/27 AT 0:11
 */
@RestController
public class CommonController {

    @GetMapping("test")
    public CommonResp<?> common() {
        return CommonResp.success();
    }


}
