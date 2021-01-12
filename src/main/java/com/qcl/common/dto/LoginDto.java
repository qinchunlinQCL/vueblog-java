package com.qcl.common.dto;

/**
 * @author qinchunlin
 * @version 1.0.0
 * @ClassName LoginDto
 * @Description
 * @createTime 2021年01月12日 10:01:00
 */
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class LoginDto implements Serializable {

    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
}
