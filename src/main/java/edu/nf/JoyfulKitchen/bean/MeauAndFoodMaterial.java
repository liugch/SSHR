package edu.nf.JoyfulKitchen.bean;

/*菜谱食材关系表*/
/*CREATE TABLE tb_meau_foodmaterial(
        meau_material_id INTEGER PRIMARY KEY AUTO_INCREMENT,
        meau_id INTEGER,                                        -- 外键 菜单表
        material_id INTEGER ,                                   -- 外键 食材表
        material_count float ,                                  -- 该食材的重量
        material_count_unit VARCHAR(30)                         -- 单位
        );*/

import javax.persistence.*;
import java.util.Date;

/**
 *   食材和 菜谱之间 的多对多 关系表
 */
@Entity
@Table(name = "tb_meau_foodmaterial")
public class MeauAndFoodMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="meau_material_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "meau_id")
    private Meau meau;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;

    @Column(name = "material_count")
    private float count;

    @Column(name = "material_count_unit")
    private String countUnit;

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

    public Meau getMeau() {
        return meau;
    }

    public void setMeau(Meau meau) {
        this.meau = meau;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public float getCount() {
        return count;
    }

    public void setCount(float count) {
        this.count = count;
    }

    public String getCountUnit() {
        return countUnit;
    }

    public void setCountUnit(String countUnit) {
        this.countUnit = countUnit;
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
        return "MeauAndFoodMaterial{" +
                "id=" + id +
                ", meau=" + meau +
                ", material=" + material +
                ", count=" + count +
                ", countUnit='" + countUnit + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}