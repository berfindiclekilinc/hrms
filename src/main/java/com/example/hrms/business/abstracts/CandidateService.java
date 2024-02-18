package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Candidate;
import com.example.hrms.entities.dtos.CandidateResumeDto;

import java.util.List;

public interface CandidateService {

    DataResult<List<Candidate>> getAll();
    Result add(Candidate candidate);

    DataResult<List<CandidateResumeDto>> getCandidateCv();
}
