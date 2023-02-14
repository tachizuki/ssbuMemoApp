package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.MemoService;

/**
 * 
 * キャラクター一覧を操作するコントローラー
 *
 */
@Controller
@RequestMapping()
public class MemoController {
	@Autowired
	private MemoService memoService;
}
