package org.starking.dtos;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Jacksonized
public class OrderDTO {

	private Long customerId;
	
	private String customerName;
	
	private BigDecimal orderValue;
}
