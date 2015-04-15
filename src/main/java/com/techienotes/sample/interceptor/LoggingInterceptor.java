package com.techienotes.sample.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

/**
 * Created by khanhpham on 4/15/15.
 */
@Interceptor
@Loggable
public class LoggingInterceptor {
    private static Logger logger = Logger.getLogger(LoggingInterceptor.class.getName());

    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        logger.info(ic.getTarget().getClass().getName() + " - " + ic.getMethod().getName());
        try {
            return ic.proceed();
        } finally {
            logger.info(ic.getTarget().getClass().getName() + " - " + ic.getMethod().getName());
        }
    }
}
