package com.example.memsourcetest.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class SettingsPerLanguage implements Serializable {
	
	private String targetLang;
	private MachineTranslateSettings machineTranslateSettings;
	
	public String getTargetLang() {
		return targetLang;
	}
	public void setTargetLang(String targetLang) {
		this.targetLang = targetLang;
	}
	public MachineTranslateSettings getMachineTranslateSettings() {
		return machineTranslateSettings;
	}
	public void setMachineTranslateSettings(MachineTranslateSettings machineTranslateSettings) {
		this.machineTranslateSettings = machineTranslateSettings;
	}
	@Override
	public int hashCode() {
		return Objects.hash(machineTranslateSettings, targetLang);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SettingsPerLanguage other = (SettingsPerLanguage) obj;
		return Objects.equals(machineTranslateSettings, other.machineTranslateSettings)
				&& Objects.equals(targetLang, other.targetLang);
	}
	
	
	
	
}
