package com.manash.service;

import com.manash.external.DubaiICCScoreComp;

public class CBuzzLocalScoreServiceImp implements CBuzzLocalScoreService {
	private DubaiICCScoreComp localComp;

	public CBuzzLocalScoreServiceImp(DubaiICCScoreComp localComp) {
		super();
		this.localComp = localComp;
	}

	@Override
	public String searchScore(int mid) {
		String score=null;
		score=localComp.getScore(mid);
		return score;
	}
}
