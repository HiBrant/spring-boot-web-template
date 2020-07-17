package cn.hibrant.springboot.sample.biz.consts;

import java.util.HashMap;
import java.util.Map;

public enum UserKind {

	normal(0, "普通用户"),
	admin(100, "管理员");
	
	private int value;
	private String label;
	
	private UserKind(int value, String label) {
		this.value = value;
		this.label = label;
	}
	
	private static Map<Integer, UserKind> map;
	static {
		map = new HashMap<>(UserKind.values().length);
		for (UserKind kind : UserKind.values()) {
			map.put(kind.value, kind);
		}
	}
	
	public static UserKind fromValue(int value) {
		return map.getOrDefault(value, null);
	}

	public int getValue() {
		return value;
	}

	public String getLabel() {
		return label;
	}
}
