package org.brapi.test.BrAPITestServer.model.entity.pheno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.brapi.test.BrAPITestServer.model.entity.BrAPIBaseEntity;

@Entity
@Table(name="scale_valid_value_category")
public class ScaleValidValueCategoryEntity extends BrAPIBaseEntity{
	@ManyToOne
	private ScaleEntity scale;
	@Column
	private String label;
	@Column
	private String value;

	public ScaleEntity getScale() {
		return scale;
	}
	public void setScale(ScaleEntity scale) {
		this.scale = scale;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
