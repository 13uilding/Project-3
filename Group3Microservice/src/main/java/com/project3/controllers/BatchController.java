package com.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


import com.project3.services.BatchService;

@RestController
public class BatchController {
	@Autowired
	BatchService batchService;
}
