package com.cg.ems.services;

import java.util.List;
import com.cg.ems.entities.Compliance;
import com.cg.ems.entities.StatusReport;
public interface IComplianceService {
	void createRL(Compliance co);
	List<Compliance> getAllRL();
	List<Compliance> getAllRL(String userId);
	void createStatusReport(StatusReport statusreport);
	List<StatusReport> getAllStatusReport(String userId, int compid);
}
