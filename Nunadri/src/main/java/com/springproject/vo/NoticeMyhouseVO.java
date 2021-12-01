package com.springproject.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class NoticeMyhouseVO {

	private String myhouseCategory;

	private int myhouseNo;

	private int houseNo;

	private String nickname;

	private String myhouseTitle;

	private String myhouseContent;

	private String myhousePicture;

	private Date myhouseRegDate;

	private int myhouseHit;

	//소모임
	private Date myhouseDate;

	//검색용 필드
	private String SearchCondition;
	private String SearchKeyword;



}
