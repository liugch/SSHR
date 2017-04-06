package edu.nf.JoyfulKitchen.bean;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
/*用户*/
/*
CREATE  TABLE  tb_user(
      user_id INTEGER PRIMARY KEY AUTO_INCREMENT,
      name VARCHAR(30) NOT NULL ,           -- 姓名
      phone VARCHAR(20)  ,                  -- 电话号码
      age INTEGER NOT NULL,                 -- 年龄
      weight FLOAT ,                        -- 体重
      heigth FLOAT ,                        -- 身高
      sex BIT ,                             -- 性别
      nickname VARCHAR(30),                 -- 昵称
      target  INTEGER,                      -- 目标
      power INTEGER  ,                      -- 工作强度
      active INTEGER                        -- 是否激活
        create_time DATETIME,                                 -- 创建时间
    update_time DATETIME                                  -- 更新时间
);
*/

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

    @Column(name = "name", nullable = false, length = 30)
    private String name;


    @Column(name = "phone", nullable = false, length = 18)
    private String phone;

    @Column(name = "age", nullable = false, length = 3)
    private int age;

    @Column(name = "weight")
    private double weight;

    @Column(name = "height")
    private double height;

    @Column(name = "sex",length = 3)
    private int sex;
    @Column(name = "nickname",length = 30)
    private String nickname;

    @Column(name = "target",length = 5)
    private int target;

    @Column(name = "power",length = 5)
    private int power;

    @Column(name = "active",length = 5)
    private int active;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
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
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", sex=" + sex +
                ", nickname='" + nickname + '\'' +
                ", target=" + target +
                ", power=" + power +
                ", active=" + active +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }



    public static final String OBJECT_KEY = "USER";



    public String getKey() {
        return getId()+"";
    }

    public String getObjectKey() {
        return OBJECT_KEY;
    }
}
