package edu.nf.JoyfulKitchen.bean;

import javax.persistence.*;
import java.util.Date;


/*菜制作过程*/
/*CREATE TABLE tb_procedure(
        procedure_id INTEGER PRIMARY KEY AUTO_INCREMENT,    -- 编号
        step TEXT,                                          -- 步骤
        step_img VARCHAR(100) ,                             -- 步骤图
        meau_id INTEGER,                                    -- 菜编号(外键)
        create_time DATETIME,                               -- 创建时间
        update_time DATETIME                                -- 更新时间
        );*/

/**
 * 菜制作过程
 */

@Entity
@Table(name = "tb_procedure")
public class Procedure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="procedure_id")
    private long id;

    @Column(name="step")
    private String step;

    @Column(name="step_img")
    private String stepImg;

    @ManyToOne
    @JoinColumn(name = "meau_id")
    private Meau meau;

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

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getStepImg() {
        return stepImg;
    }

    public void setStepImg(String stepImg) {
        this.stepImg = stepImg;
    }

    public Meau getMeau() {
        return meau;
    }

    public void setMeau(Meau meau) {
        this.meau = meau;
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
        return "Procedure{" +
                "id=" + id +
                ", step='" + step + '\'' +
                ", stepImg='" + stepImg + '\'' +
                ", meau=" + meau +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
