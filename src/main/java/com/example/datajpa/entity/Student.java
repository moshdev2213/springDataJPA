package com.example.datajpa.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(
		name = "tbl_student",
		uniqueConstraints = @UniqueConstraint(
				name = "email_unique",
				columnNames = "email"
				)
		)
public class Student {
	@Id
	@SequenceGenerator(
			name="student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1
	)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "student_sequence")
	private Long studentId;
	private String fname;
	private String lname;
	@Column(
			name="email",
			nullable = false
			)
	private String email;
	
	@Embedded
	private Guardian guardian;
}
