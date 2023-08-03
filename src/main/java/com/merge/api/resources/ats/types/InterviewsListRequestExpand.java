package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InterviewsListRequestExpand {
    APPLICATION("application"),

    APPLICATION_JOB_INTERVIEW_STAGE("application,job_interview_stage"),

    INTERVIEWERS("interviewers"),

    INTERVIEWERS_APPLICATION("interviewers,application"),

    INTERVIEWERS_APPLICATION_JOB_INTERVIEW_STAGE("interviewers,application,job_interview_stage"),

    INTERVIEWERS_JOB_INTERVIEW_STAGE("interviewers,job_interview_stage"),

    INTERVIEWERS_ORGANIZER("interviewers,organizer"),

    INTERVIEWERS_ORGANIZER_APPLICATION("interviewers,organizer,application"),

    INTERVIEWERS_ORGANIZER_APPLICATION_JOB_INTERVIEW_STAGE("interviewers,organizer,application,job_interview_stage"),

    INTERVIEWERS_ORGANIZER_JOB_INTERVIEW_STAGE("interviewers,organizer,job_interview_stage"),

    JOB_INTERVIEW_STAGE("job_interview_stage"),

    ORGANIZER("organizer"),

    ORGANIZER_APPLICATION("organizer,application"),

    ORGANIZER_APPLICATION_JOB_INTERVIEW_STAGE("organizer,application,job_interview_stage"),

    ORGANIZER_JOB_INTERVIEW_STAGE("organizer,job_interview_stage");

    private final String value;

    InterviewsListRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
