package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ApplicationsRetrieveRequestExpand {
    CANDIDATE("candidate"),

    CANDIDATE_CREDITED_TO("candidate,credited_to"),

    CANDIDATE_CREDITED_TO_CURRENT_STAGE("candidate,credited_to,current_stage"),

    CANDIDATE_CREDITED_TO_CURRENT_STAGE_REJECT_REASON("candidate,credited_to,current_stage,reject_reason"),

    CANDIDATE_CREDITED_TO_REJECT_REASON("candidate,credited_to,reject_reason"),

    CANDIDATE_CURRENT_STAGE("candidate,current_stage"),

    CANDIDATE_CURRENT_STAGE_REJECT_REASON("candidate,current_stage,reject_reason"),

    CANDIDATE_JOB("candidate,job"),

    CANDIDATE_JOB_CREDITED_TO("candidate,job,credited_to"),

    CANDIDATE_JOB_CREDITED_TO_CURRENT_STAGE("candidate,job,credited_to,current_stage"),

    CANDIDATE_JOB_CREDITED_TO_CURRENT_STAGE_REJECT_REASON("candidate,job,credited_to,current_stage,reject_reason"),

    CANDIDATE_JOB_CREDITED_TO_REJECT_REASON("candidate,job,credited_to,reject_reason"),

    CANDIDATE_JOB_CURRENT_STAGE("candidate,job,current_stage"),

    CANDIDATE_JOB_CURRENT_STAGE_REJECT_REASON("candidate,job,current_stage,reject_reason"),

    CANDIDATE_JOB_REJECT_REASON("candidate,job,reject_reason"),

    CANDIDATE_REJECT_REASON("candidate,reject_reason"),

    CREDITED_TO("credited_to"),

    CREDITED_TO_CURRENT_STAGE("credited_to,current_stage"),

    CREDITED_TO_CURRENT_STAGE_REJECT_REASON("credited_to,current_stage,reject_reason"),

    CREDITED_TO_REJECT_REASON("credited_to,reject_reason"),

    CURRENT_STAGE("current_stage"),

    CURRENT_STAGE_REJECT_REASON("current_stage,reject_reason"),

    JOB("job"),

    JOB_CREDITED_TO("job,credited_to"),

    JOB_CREDITED_TO_CURRENT_STAGE("job,credited_to,current_stage"),

    JOB_CREDITED_TO_CURRENT_STAGE_REJECT_REASON("job,credited_to,current_stage,reject_reason"),

    JOB_CREDITED_TO_REJECT_REASON("job,credited_to,reject_reason"),

    JOB_CURRENT_STAGE("job,current_stage"),

    JOB_CURRENT_STAGE_REJECT_REASON("job,current_stage,reject_reason"),

    JOB_REJECT_REASON("job,reject_reason"),

    REJECT_REASON("reject_reason");

    private final String value;

    ApplicationsRetrieveRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
