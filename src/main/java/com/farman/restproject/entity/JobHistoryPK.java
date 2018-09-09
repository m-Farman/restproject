package com.farman.restproject.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class JobHistoryPK implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Integer employeeId;

	@Temporal(TemporalType.DATE)
	protected Date startDate;

}
