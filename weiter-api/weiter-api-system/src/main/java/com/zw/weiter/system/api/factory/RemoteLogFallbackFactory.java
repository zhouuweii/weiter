package com.zw.weiter.system.api.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import com.zw.weiter.common.core.domain.R;
import com.zw.weiter.system.api.RemoteLogService;
import com.zw.weiter.system.api.domain.SysLogininfor;
import com.zw.weiter.system.api.domain.SysOperLog;

/**
 * 日志服务降级处理
 * 
 * @author ZhouWei
 */
@Component
public class RemoteLogFallbackFactory implements FallbackFactory<RemoteLogService>
{
    private static final Logger log = LoggerFactory.getLogger(RemoteLogFallbackFactory.class);

    @Override
    public RemoteLogService create(Throwable throwable)
    {
        log.error("日志服务调用失败:{}", throwable.getMessage());
        return new RemoteLogService()
        {
            @Override
            public R<Boolean> saveLog(SysOperLog sysOperLog, String source)
            {
                return null;
            }

            @Override
            public R<Boolean> saveLogininfor(SysLogininfor sysLogininfor, String source)
            {
                return null;
            }
        };

    }
}
