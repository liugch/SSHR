package edu.nf.JoyfulKitchen.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
/*食材类型*/
/*CREATE TABLE tb_material_type(
  material_type_id INTEGER PRIMARY KEY  AUTO_INCREMENT,      -- 编号
  type_name VARCHAR(50) NOT NULL ,                      -- 食材类型 名称
  material_type_desc TEXT ,                                           -- 食材的 描述
  create_time DATETIME,                                 -- 创建时间
  update_time DATETIME                                  -- 更新时间
);
*/
/**
 * 食材类型
 */
@Entity
@Table(name = "tb_material_type")
public class MaterialType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="material_type_id")
    private long id;

    @Column(name = "type_name",nullable = false,length = 50)
    private String name;

    @Column(name = "material_type_desc")
    private String desc;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @OneToMany(mappedBy = "foodType")
    private List<Material> materials;

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

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "MaterialType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", materials=" + materials +
                '}';
    }
}
