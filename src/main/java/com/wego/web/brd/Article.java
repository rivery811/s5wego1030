package com.wego.web.brd;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component @Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
	private String artseq,title,content, image, uid,comments,msg,rating, boardType;

}
