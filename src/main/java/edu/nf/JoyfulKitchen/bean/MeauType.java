package edu.nf.JoyfulKitchen.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/*菜的类型表*/
/*
CREATE TABLE tb_meau_type(
  meau_type_id INTEGER PRIMARY KEY AUTO_INCREMENT, -- 编号
  type_name VARCHAR(50) NOT NULL ,                      -- 菜类型 名称
  meau_type_desc TEXT ,                                      -- 菜类型 描述
  create_time DATETIME,                            -- 创建时间
  update_time DATETIME                             -- 更新时间
);
        */

/**
 *  菜类型 实体类
 */
@Entity
@Table(name = "tb_meau_type")
public class MeauType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="meau_type_id")
    private long id;

    @Column(name = "type_name",nullable = false,length = 50)
    private String name ;

    @Column(name = "meau_type_desc")
    private String desc;

    @OneToMany(mappedBy = "meauType")
    private List<Meau> meaus;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Meau> getMeaus() {
        return meaus;
    }

    public void setMeaus(List<Meau> meaus) {
        this.meaus = meaus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "MeauType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", meaus=" + meaus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
