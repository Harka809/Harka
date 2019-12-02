package com.hrk.productservice;

import com.hrk.dtoproject.DtoProject;

public class ProductdService {
	public DtoProject getDtoData() {
		DtoProject dto = new DtoProject();
		dto.setName("Samsung");
		dto.setMdoel("Galaxy S10");
		dto.setProduct("Phone");
		dto.setCapacity("128gb");
		return dto;

	}

}
