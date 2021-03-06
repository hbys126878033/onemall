package cn.iocoder.mall.user.api;


import cn.iocoder.mall.user.api.bo.OAuth2AccessTokenBO;
import cn.iocoder.mall.user.api.bo.OAuth2AuthenticationBO;

@Deprecated
public interface OAuth2Service {

    /**
     * 校验访问令牌，获取身份信息( 不包括 accessToken 等等 )
     *
     * @param accessToken 访问令牌
     * @return 授权信息
     */
    OAuth2AuthenticationBO checkToken(String accessToken);

    OAuth2AccessTokenBO refreshToken(String refreshToken);

    // TODO @see 移除 token

}
