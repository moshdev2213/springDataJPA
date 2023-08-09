package com.example.datajpa.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
	@AttributeOverride(
			name="name",
			column=@Column(name="gname")
	),
	@AttributeOverride(
			name="email",
			column=@Column(name="gemail")
	),
	@AttributeOverride(
			name="mobile",
			column = @Column(name="gmobile")
	)
	
})
public class Guardian {
	private String name;
	private String email;
	private String mobile;
}
