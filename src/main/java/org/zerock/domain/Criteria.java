package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
public class Criteria {    //검색의 기준, pageNum과 amount 값을 같이 전달하는 용도

  private int pageNum;
  private int amount;
  
  private String type;
  private String keyword;

  public Criteria() {  // 생성자를 통해서 기본값을 1페이지, 10개로 지정해서 처리
    this(1, 10);
  }

  public Criteria(int pageNum, int amount) {
    this.pageNum = pageNum;
    this.amount = amount;
  }
  
  public String[] getTypeArr() {
    
    return type == null? new String[] {}: type.split("");
  }
}
