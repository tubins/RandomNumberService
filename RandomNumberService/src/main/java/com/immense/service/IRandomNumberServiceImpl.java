package com.immense.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class IRandomNumberServiceImpl implements IRandomNumberService {

	@Override
	public int generateRandomNumber() {
		return new Random().nextInt();
	}

}
