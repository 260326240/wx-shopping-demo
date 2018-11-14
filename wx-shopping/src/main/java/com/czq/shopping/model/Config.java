package com.czq.shopping.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenzeqiang
 * @since 2018-11-09
 */
@TableName("sys_config")
public class Config extends Model<Config> {

    private static final long serialVersionUID = 1L;

    private String variable;

    private String value;

    private LocalDateTime setTime;

    private String setBy;


    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDateTime getSetTime() {
        return setTime;
    }

    public void setSetTime(LocalDateTime setTime) {
        this.setTime = setTime;
    }

    public String getSetBy() {
        return setBy;
    }

    public void setSetBy(String setBy) {
        this.setBy = setBy;
    }

    @Override
    protected Serializable pkVal() {
        return this.variable;
    }

    @Override
    public String toString() {
        return "Config{" +
        "variable=" + variable +
        ", value=" + value +
        ", setTime=" + setTime +
        ", setBy=" + setBy +
        "}";
    }
}
