package com.ssmBase.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



// getter setter equals 无参构造
@Data
// 全参构造
@AllArgsConstructor
// 无参构造
// @NoArgsConstructor
public class Books {

    private Integer bookID;
    private String bookName;
    private Integer bookCounts;
    private String detail;
}
