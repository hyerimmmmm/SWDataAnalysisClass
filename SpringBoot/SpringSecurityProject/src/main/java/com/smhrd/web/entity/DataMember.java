package com.smhrd.web.entity;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.security.crypto.password.PasswordEncoder;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // 엔티티 클래스임을 나타내는 annotation
@Table(name="datamember") // (선택)해당하는 클래스가 datatamember 클래스임을 표시하는  용도
public class DataMember {
	
	// DB 테이블 자체를 의미하는 테이블
	
	@Id // primary key 의미(제공하는 package가 persistence여야 함. 다른 패키지와 헷갈리지 말 것)
	@Column(name = "id", length = 100) // 해당하는 필드에 대응되는 테이블 컬럼의 디테일한 설정 가능
	private String id;
	
	@Column(length = 100, nullable = false)
	private String pw;
	
	@Column(nullable = false, insertable = false)
	@ColumnDefault("'user'")
	private String roles;
	
	public static DataMember createMember(String id, String pw, String roles, PasswordEncoder encoder) {
		return new DataMember(id, encoder.encode(pw), roles);
	}
	
}
