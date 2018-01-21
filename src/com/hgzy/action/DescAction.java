package com.hgzy.action;



import com.opensymphony.xwork2.ActionSupport;
/**
 * 此Action用于跳转到店铺详情的  饿了么 界面
 * @author 李恒
 *
 */
public class DescAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String shop() {
		if (id == 1001) {
			return "kbs";
		}
		if (id == 1002) {
			return "lzlm";
		}
		if (id == 1003) {
			return "dhct";
		}
		if (id == 1004) {
			return "lssj";
		}
		if (id == 1005) {
			return "htl";
		}
		if (id == 1006) {
			return "cqmlt";
		}
		if (id == 1007) {
			return "jdhmj";
		}
		if (id == 1008) {
			return "wxsk";
		}
		if (id == 1009) {
			return "tlcy";
		}
		return "other";
	}
	
	public String movie(){
		if(id == 1000){
			return "aokang";
		}
		if(id == 1001){
			return "dadi";
		}
		if(id == 1002){
			return "aimusi";
		}
		return "other";
	}
}
