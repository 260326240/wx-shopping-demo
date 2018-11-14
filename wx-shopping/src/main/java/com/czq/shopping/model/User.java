package com.czq.shopping.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 系统用户表
 * </p>
 *
 * @author chenzeqiang
 * @since 2018-11-13
 */
@TableName("sys_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId
    private Long id;

    /**
     * 用户名
     */
    @TableId
    private String name;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 0、禁用 1、正常, 如果使用tinyint(1)，mysql连接没加tinyInt1isBit=false，默认mysql驱动会把值转成boolean
     */
    private Integer type;

    /**
     * 自定义填充的创建时间
     */
    private LocalDateTime ctime;


    public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String name, Integer age, Integer type) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getCtime() {
        return ctime;
    }

    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", name=" + name +
        ", age=" + age +
        ", type=" + type +
        ", ctime=" + ctime +
        "}";
    }
}
