package com.cloud.webapp.Model;



//@Entity
public class Counter {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    @Column
    private Integer count;

    public Counter() {

    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
