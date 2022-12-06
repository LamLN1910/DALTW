package com.tpt.model.hibernate;
// default package
// Generated Dec 5, 2022, 10:49:34 PM by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HinhanhId generated by hbm2java
 */
@Embeddable
public class HinhanhId implements java.io.Serializable {

	private int stt;
	private int idP;
	private String hinhanh;

	public HinhanhId() {
	}

	public HinhanhId(int stt, int idP, String hinhanh) {
		this.stt = stt;
		this.idP = idP;
		this.hinhanh = hinhanh;
	}

	@Column(name = "stt", nullable = false)
	public int getStt() {
		return this.stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	@Column(name = "id_p", nullable = false)
	public int getIdP() {
		return this.idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	@Column(name = "hinhanh", nullable = false, length = 100)
	public String getHinhanh() {
		return this.hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HinhanhId))
			return false;
		HinhanhId castOther = (HinhanhId) other;

		return (this.getStt() == castOther.getStt()) && (this.getIdP() == castOther.getIdP())
				&& ((this.getHinhanh() == castOther.getHinhanh()) || (this.getHinhanh() != null
						&& castOther.getHinhanh() != null && this.getHinhanh().equals(castOther.getHinhanh())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getStt();
		result = 37 * result + this.getIdP();
		result = 37 * result + (getHinhanh() == null ? 0 : this.getHinhanh().hashCode());
		return result;
	}

}
