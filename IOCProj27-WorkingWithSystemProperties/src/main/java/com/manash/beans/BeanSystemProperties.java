package com.manash.beans;

public class BeanSystemProperties {
	private  String osArch;
	private String osName;
	private String runtimeEnv;
	private String desktop;
	private String javaHome;
	public void setOsArch(String osArch) {
		this.osArch = osArch;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public void setRuntimeEnv(String runtimeEnv) {
		this.runtimeEnv = runtimeEnv;
	}
	public void setDesktop(String desktop) {
		this.desktop = desktop;
	}
	public void setJavaHome(String javaHome) {
		this.javaHome = javaHome;
	}
	@Override
	public String toString() {
		return "BeanSystemProperties [osArch=" + osArch + ", osName=" + osName + ", runtimeEnv=" + runtimeEnv
				+ ", desktop=" + desktop + ", javaHome=" + javaHome + "]";
	}
	

}
