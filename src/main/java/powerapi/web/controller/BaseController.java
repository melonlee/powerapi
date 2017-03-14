package powerapi.web.controller;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import powerapi.entity.BaseEntity;
import powerapi.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Melon on 17/3/14.
 */
public abstract class BaseController<T extends BaseEntity> {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected Logger log = LoggerFactory.getLogger(this.getClass());


    /**
     * 从shiro的session中获取当前登录用户
     *
     * @return
     */
    protected User getCurrentUser() {
        return (User) SecurityUtils.getSubject().getSession().getAttribute("curUser");
    }

}
