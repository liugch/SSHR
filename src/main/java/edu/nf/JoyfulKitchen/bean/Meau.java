package edu.nf.JoyfulKitchen.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/*菜单表*/
/*
CREATE TABLE tb_meau(
        meau_id INTEGER  PRIMARY KEY AUTO_INCREMENT,    -- 编号
        name VARCHAR(150) NOT NULL ,                    -- 菜名
        meau_desc TEXT ,                                 -- 描述
        img VARCHAR(100) ,                              -- 菜图
        meau_type_id INTEGER,                           -- 菜的类型(外键)
        create_time DATETIME,                           -- 创建时间
        update_time DATETIME                            -- 更新时间
        );
*/

/**
 * 菜谱
 */
@Entity
@Table(name = "tb_meau")
public class Meau {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="meau_id")
    private long id;

    @Column(name = "name" ,nullable = false)
    private String name;

    @Column(name = "meau_desc")
    private String meauDesc;

    @Column(name = "img")
    private String img;

    @ManyToOne
    @JoinColumn(name = "meau_type_id")
    private MeauType meauType;

    @OneToMany(mappedBy = "meau")
    private List<Procedure> procedures;

    @OneToMany(mappedBy = "meau")
    private List<MeauAndFoodMaterial> meaus;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;


}
