package edu.nf.JoyfulKitchen.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/*食材表*/
/*CREATE TABLE tb_material(
        material_id INTEGER PRIMARY KEY  AUTO_INCREMENT,      -- 编号
        name VARCHAR(50) NOT NULL ,                           -- 食材名称
        protein FLOAT ,                                     -- 蛋白质
        protein_unit VARCHAR(20),                              -- 单位
        fat FLOAT ,                                         -- 脂肪
        fat_unit VARCHAR(20),                                  -- 单位
        carbohydrate FLOAT ,                                -- 碳水化合物
        carbohydrate_unit VARCHAR(20),                         -- 单位
        food_type_id INTEGER,                                  -- 食材类型(外键)
        create_time DATETIME,                                 -- 创建时间
        update_time DATETIME                                  -- 更新时间
        );*/

@Entity
@Table(name = "tb_material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="material_id")
    private long id;

    @Column(name="name",length = 50,unique = false)
    private String name;

    @Column(name="protein")
    private double protein;//蛋白质

    @Column(name="protein_unit",length = 20)
    private String proteinUnit; //单位

    @Column(name="fat")
    private double fat;// 脂肪

    @Column(name="fat_unit",length = 20)
    private String fatUnit;

    @Column(name="carbohydrate")
    private double carbohydrate;// 碳水化合物

    @Column(name="carbohydrate_unit",length = 20)
    private String carbohydrateUnit;

    @ManyToOne
    @JoinColumn(name = "food_type_id")
    private MaterialType foodType;

    @OneToMany(mappedBy = "material")
    private List<MeauAndFoodMaterial> materials;

    @Column(name="create_time")
    private Date createTime;

    @Column(name="update_time")
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

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public String getProteinUnit() {
        return proteinUnit;
    }

    public void setProteinUnit(String proteinUnit) {
        this.proteinUnit = proteinUnit;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public String getFatUnit() {
        return fatUnit;
    }

    public void setFatUnit(String fatUnit) {
        this.fatUnit = fatUnit;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public String getCarbohydrateUnit() {
        return carbohydrateUnit;
    }

    public void setCarbohydrateUnit(String carbohydrateUnit) {
        this.carbohydrateUnit = carbohydrateUnit;
    }

    public MaterialType getFoodType() {
        return foodType;
    }

    public void setFoodType(MaterialType foodType) {
        this.foodType = foodType;
    }

    public List<MeauAndFoodMaterial> getMaterials() {
        return materials;
    }

    public void setMaterials(List<MeauAndFoodMaterial> materials) {
        this.materials = materials;
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
        return "Material{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", protein=" + protein +
                ", proteinUnit='" + proteinUnit + '\'' +
                ", fat=" + fat +
                ", fatUnit='" + fatUnit + '\'' +
                ", carbohydrate=" + carbohydrate +
                ", carbohydrateUnit='" + carbohydrateUnit + '\'' +
                ", foodType=" + foodType +
                ", materials=" + materials +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
