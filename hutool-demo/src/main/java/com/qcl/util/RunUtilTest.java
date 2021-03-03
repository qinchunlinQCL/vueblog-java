package com.qcl.util;

import cn.hutool.cron.CronUtil;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author qinchunlin
 * @version 1.0.0
 * @ClassName RunUtilTest
 * @Description
 * @createTime 2021年02月23日 11:43:00
 */
@Component
@Order(value=2)
public class RunUtilTest  implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(1111);
        CronUtil.setMatchSecond(true);
        CronUtil.start();
        System.out.println(222);
    }
}
