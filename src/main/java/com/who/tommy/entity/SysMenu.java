package com.who.tommy.entity;

public class SysMenu {
    private Long id;

    private String name;

    private Long pid;

    private String link;

    private Integer order;

    private String e1;

    private String e2;

    private String e3;

    private String e4;

    private String e5;

    private String e6;

    private String e7;

    private String e8;

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
        this.name = name == null ? null : name.trim();
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getE1() {
        return e1;
    }

    public void setE1(String e1) {
        this.e1 = e1 == null ? null : e1.trim();
    }

    public String getE2() {
        return e2;
    }

    public void setE2(String e2) {
        this.e2 = e2 == null ? null : e2.trim();
    }

    public String getE3() {
        return e3;
    }

    public void setE3(String e3) {
        this.e3 = e3 == null ? null : e3.trim();
    }

    public String getE4() {
        return e4;
    }

    public void setE4(String e4) {
        this.e4 = e4 == null ? null : e4.trim();
    }

    public String getE5() {
        return e5;
    }

    public void setE5(String e5) {
        this.e5 = e5 == null ? null : e5.trim();
    }

    public String getE6() {
        return e6;
    }

    public void setE6(String e6) {
        this.e6 = e6 == null ? null : e6.trim();
    }

    public String getE7() {
        return e7;
    }

    public void setE7(String e7) {
        this.e7 = e7 == null ? null : e7.trim();
    }

    public String getE8() {
        return e8;
    }

    public void setE8(String e8) {
        this.e8 = e8 == null ? null : e8.trim();
    }
}