package com.codingwithmitch.mvvmrecyclerview.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseInfo {

    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("autoGoLive")
    @Expose
    private Boolean autoGoLive;
    @SerializedName("created_by")
    @Expose
    private String createdBy;
    @SerializedName("instruction")
    @Expose
    private String instruction;
    @SerializedName("smallPrint")
    @Expose
    private String smallPrint;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("subTitle")
    @Expose
    private String subTitle;
    @SerializedName("isResponseRequired")
    @Expose
    private Boolean isResponseRequired;
    @SerializedName("emailDeeplinkUrl")
    @Expose
    private String emailDeeplinkUrl;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("contributeButtonText")
    @Expose
    private String contributeButtonText;
    @SerializedName("shortDescription")
    @Expose
    private String shortDescription;
    @SerializedName("promotions")
    @Expose
    private List<Object> promotions = null;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("playlist")
    @Expose
    private List<Object> playlist = null;
    @SerializedName("CTAType")
    @Expose
    private String cTAType;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("twitterUrl")
    @Expose
    private String twitterUrl;
    @SerializedName("CTAImageUrl")
    @Expose
    private String cTAImageUrl;
    @SerializedName("isArchived")
    @Expose
    private Boolean isArchived;
    @SerializedName("facebookUrl")
    @Expose
    private String facebookUrl;
    @SerializedName("CTAImageDisplayDuration")
    @Expose
    private Integer cTAImageDisplayDuration;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("upperCaseName")
    @Expose
    private String upperCaseName;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("isVoted")
    @Expose
    private Boolean isVoted;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("bannerImage")
    @Expose
    private String bannerImage;
    @SerializedName("corporateEventType")
    @Expose
    private String corporateEventType;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("CTAVideoDuration")
    @Expose
    private String cTAVideoDuration;
    @SerializedName("teamName")
    @Expose
    private String teamName;

    @SerializedName("teamId")
    @Expose
    private String teamId;

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Boolean getAutoGoLive() {
        return autoGoLive;
    }

    public void setAutoGoLive(Boolean autoGoLive) {
        this.autoGoLive = autoGoLive;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getSmallPrint() {
        return smallPrint;
    }

    public void setSmallPrint(String smallPrint) {
        this.smallPrint = smallPrint;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Boolean getIsResponseRequired() {
        return isResponseRequired;
    }

    public void setIsResponseRequired(Boolean isResponseRequired) {
        this.isResponseRequired = isResponseRequired;
    }

    public String getEmailDeeplinkUrl() {
        return emailDeeplinkUrl;
    }

    public void setEmailDeeplinkUrl(String emailDeeplinkUrl) {
        this.emailDeeplinkUrl = emailDeeplinkUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContributeButtonText() {
        return contributeButtonText;
    }

    public void setContributeButtonText(String contributeButtonText) {
        this.contributeButtonText = contributeButtonText;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public List<Object> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Object> promotions) {
        this.promotions = promotions;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public List<Object> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<Object> playlist) {
        this.playlist = playlist;
    }

    public String getCTAType() {
        return cTAType;
    }

    public void setCTAType(String cTAType) {
        this.cTAType = cTAType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getCTAImageUrl() {
        return cTAImageUrl;
    }

    public void setCTAImageUrl(String cTAImageUrl) {
        this.cTAImageUrl = cTAImageUrl;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public Integer getCTAImageDisplayDuration() {
        return cTAImageDisplayDuration;
    }

    public void setCTAImageDisplayDuration(Integer cTAImageDisplayDuration) {
        this.cTAImageDisplayDuration = cTAImageDisplayDuration;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpperCaseName() {
        return upperCaseName;
    }

    public void setUpperCaseName(String upperCaseName) {
        this.upperCaseName = upperCaseName;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Boolean getIsVoted() {
        return isVoted;
    }

    public void setIsVoted(Boolean isVoted) {
        this.isVoted = isVoted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public String getCorporateEventType() {
        return corporateEventType;
    }

    public void setCorporateEventType(String corporateEventType) {
        this.corporateEventType = corporateEventType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCTAVideoDuration() {
        return cTAVideoDuration;
    }

    public void setCTAVideoDuration(String cTAVideoDuration) {
        this.cTAVideoDuration = cTAVideoDuration;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamId(){
        return teamId;
    }

    public void setTeamId(String teamId){
        this.teamId = teamId;
    }

}
