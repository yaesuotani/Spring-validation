package jp.co.example.controller.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class TestForm {

	@NotBlank(message="名前は必須です。")
	private String name;

	@NotNull(message="ポイントは必須です。わーーーーー")
	@Max(value=100, message="ポイントは100以下です。")
	private Integer point;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

}
