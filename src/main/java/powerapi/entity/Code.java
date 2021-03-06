package powerapi.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * Created by Melon on 17/3/2.
 */
@TableName("t_code")
public class Code extends BaseEntity {

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    private String code;

    private String description;

    @TableField(value = "p_id")
    private Long pId;

    @TableField(value = "user_id")
    private Long userId;

    @TableField(value = "is_update")
    private Integer isUpdate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
        setLogResource(this.code);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(Integer isUpdate) {
        this.isUpdate = isUpdate;
    }
}
