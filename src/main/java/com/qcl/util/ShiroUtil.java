package com.qcl.util;

/**
 * @author qinchunlin
 * @version 1.0.0
 * @ClassName ShiroUtil
 * @Description
 * @createTime 2021年01月12日 10:09:00
 */
import com.qcl.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}