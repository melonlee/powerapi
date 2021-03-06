package powerapi.entity;

import com.alibaba.druid.support.json.JSONUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import powerapi.common.utils.JsonUtil;

/**
 * Created by Melon on 17/3/2.
 */
@TableName("t_function")
public class Function extends BaseEntity {

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    private String title;

    private String url;

    private String method;

    @TableField(value = "is_login")
    private Integer isLogin;

    private String params;

    @TableField(value = "response_body")
    private String responseBody;

    @TableField(value = "m_id")
    private Long mId;

    private Integer status;

    private String description;

    @TableField(value = "response_type")
    private String responseType;

    @TableField(exist = false)
    private String jsonValue;

    @TableField(exist = false)
    private Module module;

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        setLogResource(this.title);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Integer isLogin) {
        this.isLogin = isLogin;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJsonValue() {
        return jsonValue;
    }

    public void setJsonValue(String jsonValue) {
        this.jsonValue = jsonValue;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return "Function{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", isLogin=" + isLogin +
                ", params='" + params + '\'' +
                ", responseBody='" + responseBody + '\'' +
                ", mId=" + mId +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", responseType='" + responseType + '\'' +
                ", jsonValue='" + jsonValue + '\'' +
                ", module=" + module.toString() +
                '}';
    }
}
