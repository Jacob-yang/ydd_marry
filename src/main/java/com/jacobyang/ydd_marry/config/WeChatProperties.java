package com.jacobyang.ydd_marry.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author se7en
 * @since 1.0.0
 **/
@Component
@Setter
@Getter
@ConfigurationProperties(prefix = WeChatProperties.WECHAT_PREFIX)
public class WeChatProperties {
    public static final String WECHAT_PREFIX = "wechat";
    //小程序
    private String appId;
    private String appSecret;
}